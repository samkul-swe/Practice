class Solution {
    public int maxFreqSum(String s) {
        String vowels = "aeiou";
        Map<Character,Integer> map = new HashMap<>();
        int vowel = Integer.MIN_VALUE, consonant = Integer.MIN_VALUE;
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            } else {
                map.put(s.charAt(i), 1);
            }
        }

        for (int i = 0; i < s.length(); i ++) {
            char c = s.charAt(i);
            if ((vowels.contains(String.valueOf(c))) && (map.get(c) > vowel)) {
                vowel = map.get(c);
            } else if (!(vowels.contains(String.valueOf(c))) && (map.get(c) > consonant)){
                consonant = map.get(c);
            }
        }

        if (consonant < 0) {
            consonant = 0;
        } else if (vowel < 0) {
            vowel = 0;
        }

        return vowel + consonant;

    }
}