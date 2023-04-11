import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        for (int i=0; i < numbers.length; i++) {
            int sum = 0;
            for(int j=i+1; j<numbers.length; j++) {
                sum = numbers[i] + numbers[j];
                if (!arrList.contains(sum)) {
                    arrList.add(sum);
                }
            }
        }
        answer = new int[arrList.size()];
        for (int i=0; i<answer.length; i++) {
            answer[i] = arrList.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}

