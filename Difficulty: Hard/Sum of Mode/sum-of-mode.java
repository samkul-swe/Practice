public class Solution {
    public int sumOfModes(int[] arr, int k) {
        int n = arr.length;
        if (n < k || k == 0) return 0;

        // Frequency of each value in current window
        // Since arr[i] <= 1e5, we could use int[] freq = new int[100001], but using HashMap is fine for sparse.
        HashMap<Integer, Integer> freq = new HashMap<>();

        // Map from frequency to the set of values having that frequency
        // Treemap to quickly access max frequency, and each bucket is a TreeSet to get smallest value
        TreeMap<Integer, TreeSet<Integer>> bucket = new TreeMap<>();

        int maxFreq = 0;
        long result = 0; // sum can be large; use long then cast to int at the end if needed

        // Helper to add value v with frequency f into bucket
        java.util.function.BiConsumer<Integer, Integer> addToBucket = (v, f) -> {
            if (f <= 0) return;
            bucket.computeIfAbsent(f, x -> new TreeSet<>()).add(v);
        };

        // Helper to remove value v with frequency f from bucket
        java.util.function.BiConsumer<Integer, Integer> removeFromBucket = (v, f) -> {
            if (f <= 0) return;
            TreeSet<Integer> set = bucket.get(f);
            if (set != null) {
                set.remove(v);
                if (set.isEmpty()) {
                    bucket.remove(f);
                }
            }
        };

        // Initialize first window
        for (int i = 0; i < k; i++) {
            int x = arr[i];
            int old = freq.getOrDefault(x, 0);
            int newFreq = old + 1;
            freq.put(x, newFreq);

            // move x from oldFreq bucket to newFreq bucket
            if (old > 0) {
                removeFromBucket.accept(x, old);
            }
            addToBucket.accept(x, newFreq);

            if (newFreq > maxFreq) {
                maxFreq = newFreq;
            }
        }

        // Current mode
        Integer mode = getModeFromBucket(bucket, maxFreq);
        if (mode != null) {
            result += mode;
        }

        // Slide the window
        for (int i = k; i < n; i++) {
            int enter = arr[i];
            // add entering element
            int oldEnter = freq.getOrDefault(enter, 0);
            int newEnter = oldEnter + 1;
            freq.put(enter, newEnter);

            if (oldEnter > 0) removeFromBucket.accept(enter, oldEnter);
            addToBucket.accept(enter, newEnter);
            if (newEnter > maxFreq) maxFreq = newEnter;

            // remove leaving element
            int leave = arr[i - k];
            int oldLeave = freq.getOrDefault(leave, 0);
            int newLeave = oldLeave - 1;
            if (newLeave == 0) {
                freq.remove(leave);
            } else {
                freq.put(leave, newLeave);
            }
            // move in buckets
            removeFromBucket.accept(leave, oldLeave);
            if (newLeave > 0) addToBucket.accept(leave, newLeave);

            // Adjust maxFreq if needed
            if (!bucket.containsKey(maxFreq) || bucket.get(maxFreq).isEmpty()) {
                // find new maxFreq
                Integer floorKey = bucket.isEmpty() ? null : bucket.lastKey();
                maxFreq = (floorKey == null) ? 0 : floorKey;
            }

            mode = getModeFromBucket(bucket, maxFreq);
            if (mode != null) {
                result += mode;
            }
        }

        // Return as int, problem expects int
        return (int) result;
    }

    // Helper to get the smallest value among those with frequency maxFreq
    private Integer getModeFromBucket(TreeMap<Integer, TreeSet<Integer>> bucket, int maxFreq) {
        if (maxFreq <= 0) return null;
        TreeSet<Integer> set = bucket.get(maxFreq);
        if (set == null || set.isEmpty()) return null;
        return set.first(); // smallest value among those with max frequency
    }
}