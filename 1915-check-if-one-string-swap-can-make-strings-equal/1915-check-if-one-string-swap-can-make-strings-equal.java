class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        int count = 0;
        int[] indexes = new int[2];
        int j = 0;
        for (int i = 0; i < s1.length(); i++){
            if (s1.charAt(i) == s2.charAt(i)) {
                continue;
            } else {
                count ++;
                if (j < 2) {
                    indexes[j] = i;
                    j ++;
                } else {
                    return false;
                }
            }
        }

        char[] s1CharArray = s1.toCharArray();

        if (count == 2) {
            char temp = s1CharArray[indexes[0]];
            s1CharArray[indexes[0]] = s1CharArray[indexes[1]];
            s1CharArray[indexes[1]] = temp;
            String s1Check = new String(s1CharArray);
            if (s1Check.equals(s2)) {
                return true;
            } else {
                return false;
            }
        }

        if (count == 0) {
            return true;
        }
        return false;
    }
}