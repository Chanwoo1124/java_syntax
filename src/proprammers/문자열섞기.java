package proprammers;

class Solution2 {
    public String solution(String str1, String str2){
        String answer = "";
        for(int i = 0; i <str1.length();i++){
            answer += str1.charAt(i);
            answer += str2.charAt(i);
        }
    return answer;
    }
}


public class 문자열섞기 {
    public static void main(String[] args){
        Solution2 so = new Solution2();
        String a =so.solution("aaaaa","bbbbb");
        System.out.println(a);

    }
}
