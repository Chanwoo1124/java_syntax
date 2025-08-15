package proprammers;

class Solution5 {
    public int solution(int a, int b) {
        int answer = 0;
        int result2 = 2 * a * b;
        String strA = String.valueOf(a);
        String strB = String.valueOf(b);
        int result1 = Integer.parseInt(strA + strB);
        if (result1 > result2) {
            answer = result1;
        } else if (result2 > result1) {
            answer = result2;
        } else {
            answer = result1;
        }

        return answer;
    }
}