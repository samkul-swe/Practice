class RecentCounter {
    List<Integer> requests;

    public RecentCounter() {
        requests = new ArrayList<>();
    }
    
    public int ping(int t) {
        requests.add(t);
        int count = 0;
        for (int a : requests) {
            if ( a >= t-3000 && a <= t) {
                count ++;
            }
        }
        return count;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */