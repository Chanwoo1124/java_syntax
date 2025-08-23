package proprammers;

import java.sql.SQLOutput;

class Solution19 {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        for (int n = 0; n < queries.length; n++) {
            int i = queries[n][0];
            int l = queries[n][1];
            int w = arr[i];
            arr[i] = arr[l];
            arr[l] = w;
        }
        answer = arr;
        return answer;
    }
}
public class 수열과구간쿼리3 {
    public static void main(String[] args) {
        Solution19 so = new Solution19();
        int[] a = {0, 1, 2, 3, 4};
        int[][] q = {{0, 3},{1, 2},{1, 4}};

        int[] ss =so.solution(a,q);
        System.out.println(ss);
    }
}
