class Solution {
    public boolean isPrefixString(String s, String[] words) {
        String sFinal = "";
        for (String word : words) {
            sFinal += word;
            if (sFinal.equals(s)) {
                return true;
            }
        }
        return false;
    }
}