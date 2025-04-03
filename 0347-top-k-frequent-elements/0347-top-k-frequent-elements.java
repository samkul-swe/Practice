class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.putIfAbsent(num,1);
            map.put(num,map.get(num) + 1);
        }

        Map<Integer,Integer> sortedMapReverseOrder =  map.entrySet().
            stream().
            sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).
            collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        List<Integer> mapKeys = new ArrayList<>();
        for (Map.Entry<Integer, Integer> mapEntry : sortedMapReverseOrder.entrySet()) {
            mapKeys.add(mapEntry.getKey());
        }
        List<Integer> answer = new ArrayList<>();
        while(k > 0) {
            answer.add(mapKeys.get(0));
            mapKeys.remove(0);
            k --;
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}