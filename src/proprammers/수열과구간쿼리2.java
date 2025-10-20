package proprammers;
class Solution20 {
    public int[] solution(int[] arr, int[][] queries) {
        //반환 할 배열 생성

        //반복문 해서 값 꺼내기
        int[] answer = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            int min = 1000000;
            //값 찾아내기
            for(int j = s; j<=e; j++){

                int r = arr[j];
                if (arr[j] > k && arr[j] < min ){
                    min = r;
                    answer[i] = min;
                }else{
                    answer[i] = -1;
                }


                }
            }
        return answer;
    }
}

class 수열과구칸쿼리2{
    public static void main(String[] args) {
        int[] arr = {0,1,2,4,3};
        int[][] queries = {{0,4,2},{0,3,2},{0,2,2}};
        Solution20 s = new Solution20();
        int[] result  =s.solution(arr,queries);
        for (int i =0; i<result.length; i++){
            System.out.println(result[i]);
        }

    }
}