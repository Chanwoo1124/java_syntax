package proprammers;

class Solution16 {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        int i = num_list[num_list.length-1];
        int j = num_list[num_list.length-2];
        int[] arr = new int[num_list.length+1];


        for (int p = 0; p < num_list.length; p++){
            arr[p] = num_list[p];
        }if (i > j){
            arr[num_list.length] = i -j;
        }else{
            arr[num_list.length] = i*2;

        }
        answer = arr;

        return answer;
    }
}