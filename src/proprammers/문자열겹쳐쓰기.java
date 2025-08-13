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
        Solution2 so = new Solution2();
        String an =so.solution("He11oWor1d","lloWorl");
        System.out.println(an);

    }
}
