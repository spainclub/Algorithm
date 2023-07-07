class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        for (int x=1; x<=n; x++) {
            if (n%x==0 && m%x==0) answer[0] = x;
        }
        for (int y=(n*m); y>=m; y--) {
            if (y%n==0 && y%m==0) answer[1] = y;
        }
        return answer;
    }
}