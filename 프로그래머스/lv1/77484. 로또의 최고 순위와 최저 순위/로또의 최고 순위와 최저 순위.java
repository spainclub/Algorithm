class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int zerocnt = 0;
        int matchcnt = 0;
        for (int l : lottos) {
            if (l == 0) zerocnt++;
            else {
                for (int w : win_nums) {
                    if (l == w) {
                        matchcnt++;
                        break;
                    }
                }
            }
        }
        int min = matchcnt;
        int max = matchcnt + zerocnt;
        answer[0] = Math.min(7 - max, 6);
        answer[1] = Math.min(7 - min, 6);
        return answer;
    }
}