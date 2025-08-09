package proprammers;


class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String result = my_string.substring(0, s);
        result += overwrite_string;
        result += my_string.substring(s + overwrite_string.length());
        return result;
    }
}


public class 문자열겹쳐쓰기 {
    public static void main(String[] args){
        Solution so = new Solution();
        String an =so.solution("He11oWor1d","lloWorl",	2);
        System.out.println(an);

    }
}
