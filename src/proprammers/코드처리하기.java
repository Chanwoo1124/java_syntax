package proprammers;

class Solution11 {
    public String solution(String code) {
        String answer = "";
        int mode = 0;
        for (int i = 0; i < code.length(); i++){
            if (mode == 0){
                if (code.charAt(i) != '1' && i % 2 == 0) {
                    answer += code.charAt(i);
                }else if (code.charAt(i) == '1'){
                    mode = 1;
                }
            }else{
                if (code.charAt(i) != '1' && i % 2 != 0){
                    answer += code.charAt(i);
                }else if (code.charAt(i) == '1'){
                    mode = 0;
                }
            }
        }
        if (answer == ""){
            answer = "EMPTY";
        }
        return answer;
    }
}

public class 코드처리하기{
    public static void main(String[] args) {
        Solution11 s = new Solution11();
        String result = s.solution("abc1abc1abc");
        System.out.println(result);
    }
}
