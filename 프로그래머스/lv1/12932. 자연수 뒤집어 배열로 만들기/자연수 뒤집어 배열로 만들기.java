class Solution {
    public int[] solution(long n) {
        String num = String.valueOf(n);
        char[] c = num.toCharArray();
        int[] answer = new int[num.length()];
        for(int i=num.length()-1;i>=0;i--) {
            answer[num.length()-1-i] = num.charAt(i)-'0';
        }
        return answer;
    }
}