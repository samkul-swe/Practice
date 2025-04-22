class Solution {
    public String interpret(String command) {
        String answer = "";
        for (int i = 0; i < command.length(); i ++) {
            if (command.charAt(i) == 'G') {
                answer += "G";
            } else if (command.charAt(i) == '(') {
                if (command.charAt(i + 1) == ')') {
                    answer += "o";
                    i ++;
                } else {
                    answer += "al";
                    i += 3;
                }
            }
        }
        return answer;
    }
}