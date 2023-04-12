class Solution {
    public String solution(String new_id) {
        String answer = "";
        // 1단계
        String no1 = new_id.toLowerCase();
        //2단계
        String no2 = "";
        for(int i = 0; i < no1.length(); i++) {
            char ch = no1.charAt(i);

            if(ch >= 'a' && ch <= 'z') {
                no2 += String.valueOf(ch);
            } else if(ch >= '0' && ch <= '9') {
                no2 += String.valueOf(ch);
            } else if(ch == '.' || ch == '-' || ch == '_') {
                no2 += String.valueOf(ch);
            }
        }
        //3단계
        String no3 = no2.toString().replace("..", ".");
        while (no3.contains("..")) {
            no3 = no3.replace("..", ".");
        }
        //4단계
        String no4 = no3;
        if (no4.length() > 0) {
            if (no4.charAt(0) == '.') {
                no4 = no4.substring(1, no4.length());
            }
        }
        if (no4.length() > 0) {
            if (no4.charAt(no4.length() - 1) == '.') {
                no4 = no4.substring(0, no4.length() - 1);
            }
        }
        //5단계
        String no5 = no4;
        if (no5.equals("")) {
            no5 = "a";
        }
        //6단계
        String no6 = no5;
        if (no6.length() >= 16) {
            no6 = no6.substring(0, 15);
            if (no6.charAt(no6.length() - 1) == '.') {
                no6 = no6.substring(0, no6.length() - 1);
            }
        }
        //7단계
        String no7 = no6;
        if(no7.length() == 2) {
            no7 = no7 + no7.charAt(no7.length()-1);
        } else if(no7.length() == 1) {
            no7 = no7 + no7.charAt(no7.length()-1) + no7.charAt(no7.length()-1);
        }
        answer = no7;
        return answer;
    }
}