class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        Long pNum = Long.valueOf(p);

        for(int i=0; i<= t.length()-p.length(); i++){
            String x = t.substring(i, i+p.length());
            Long tNum = Long.valueOf(x);
            if(tNum <= pNum)
                answer++;
        }
        return answer;
    }
}