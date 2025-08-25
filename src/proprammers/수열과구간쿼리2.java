package proprammers;
class Solution20 {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        int max = 0;
        for (int i = 0; i < arr.length; i++){
            if (max < arr[i]){
                max = arr[i];
            }
        }
        for (int q = 0; q < queries.length; q++){
            answer[q] = max;
        }
        for (int i = 0; i < queries.length; i++){
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            for (; s < e+1; s++){
                if (arr[s] > k && answer[i] > arr[s]){
                    answer[i] = arr[s];
                    }
//                else{
//                    answer[i] = -1;
//                }
                }
            }
        return answer;
    }
}
public class 수열과구간쿼리2{
    public static void main(String[] args) {
    Solution20 so = new Solution20();
    int[] arr = {0,1,2,4,3};
    int[][] queries = {{0,4,2},{0,3,2},{0,2,2}};
    int[] a =so.solution(arr,queries);
    for (int i = 0; i < a.length; i++){
        System.out.println(a[i]);
    }




    }
}