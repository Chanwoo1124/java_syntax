package proprammers;
class Solution3 {
    public int solution(int a, int b) {
        String strA = String.valueOf(a);
        String strB = String.valueOf(b);
        int result1 = Integer.parseInt(strA+strB);
        int result2 = Integer.parseInt(strB+strA);
        int answer = 0;
        if (result1>result2){
            answer = result1;
            System.out.println(result1);
        } else if (result2>result1) {
            answer = result2;
            System.out.println(result2);
        }else {
            answer = result1;
            System.out.println(result1);
        }

        return answer;
    }
}
public class 더크게합치기 {
    public static void main(String[] args) {
        Solution3 s = new Solution3();
        s.solution(9,91);

    }
}
