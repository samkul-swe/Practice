class Solution {
    public boolean isValid(String word) {
        boolean containsDigits = false;
        boolean containsVowel = false;
        boolean containsConsonant = false;
        String vowels = "aeiouAEIOU";
        String consonants = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";
        String digits = "0123456789";

        for (char c : word.toCharArray()) {
            if (vowels.contains(String.valueOf(c))) {
                containsVowel = true;
            } else if (consonants.contains(String.valueOf(c))) {
                containsConsonant = true;
            } else if (digits.contains(String.valueOf(c))) {
                containsDigits = true;
            } else {
                return false;
            }
        }

        return word.length() >= 3 && containsVowel && containsConsonant;

    }
}