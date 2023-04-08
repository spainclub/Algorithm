class Solution {
    public long solution(long n) {
        long answer = 0;
        long sqrRt = (long)Math.sqrt(n);

        if (sqrRt * sqrRt == n) {
            answer= (sqrRt + 1) * (sqrRt + 1);
        }
        else {
            answer = -1;
        }
        return answer;
    }
}