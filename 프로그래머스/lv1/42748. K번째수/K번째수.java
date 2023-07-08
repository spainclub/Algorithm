import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            int[] list = new int[commands[i][1] - (commands[i][0] - 1)];
            for (int j = 0; j < list.length; j++) {
                list[j] = array[j + (commands[i][0] - 1)];
            }
            Arrays.sort(list);
            answer[i] = list[commands[i][2] - 1];
        }
        return answer;
    }
}