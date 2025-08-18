package proprammers;

class Solution12 {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int b = a;
        for (int i = 0; i < included.length; i++){
            if (i != 0){
                b += d;
            }


            if (included[i] ==true){
                answer += b;
            }

        }
        return answer;

    }
}