class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> answer = new HashMap<>();
        for (String str : strs) {
            char[] strChars = str.toCharArray();
            Arrays.sort(strChars);
            String sNew = String.valueOf(strChars);
            answer.putIfAbsent(sNew,new ArrayList<>());
            answer.get(sNew).add(str);
        }
        return new ArrayList<>(answer.values());
    }
}