class Solution {
    public char kthCharacter(int k) {
        String word = "a";
        while (word.length() < k) {
            String changedWord = "";
            for (char c : word.toCharArray()) {
                c++;
                changedWord += c;
            }
            word += changedWord;
        }
        return word.charAt(k - 1);
    }
}