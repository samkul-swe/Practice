class Solution {
    public String[] findWords(String[] words) {
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";
        boolean row1Bool = false, row2Bool = false, row3Bool = false;
        List<String> answerList = new ArrayList<>();

        for (String word : words) {
            String wordLow = word.toLowerCase();
            for (char c : wordLow.toCharArray()) {
                if (row1.contains(String.valueOf(c))) {
                    row1Bool = true;
                } else if (row2.contains(String.valueOf(c))) {
                    row2Bool = true;
                } else if (row3.contains(String.valueOf(c))) {
                    row3Bool = true;
                }
            }
            if (row1Bool && !row2Bool && !row3Bool) {
                answerList.add(word);
            } else if (!row1Bool && row2Bool && !row3Bool) {
                answerList.add(word);
            } else if (!row1Bool && !row2Bool && row3Bool) {
                answerList.add(word);
            }
            row1Bool = false;
            row2Bool = false;
            row3Bool = false;
        }

        String[] answer = new String[answerList.size()];
        int k = 0;
        for (String word : answerList) {
            answer[k] = word;
            k ++;
        }

        return answer;
    }
}