package 자바의정석.문제;
import java.util.Arrays;
import java.util.Scanner;
public class 연습문제5 {
    public static void main(String main[]){

        //5-3
//        int[] arr = {10,20,30,40,50};
//        int sum = 0;
//        for (int i = 0; i<arr.length;i++){
//            sum += arr[i];
//        }
//        System.out.println("sum="+sum);
        //5-4
//        int[][] arg = {
//                {5,5,5,5,5},
//                {10,10,10,10,10},
//                {20,20,20,20,20},
//                {30,30,30,30,30}
//        };
//        int total = 0;
//        float average = 0;
//        for (int i =0; i < arg.length;i++){
//            for (int j =0; j < arg[i].length; j++){
//                total += arg[i][j];
//                average += 1;
//            }
//        }
//        average = total / average;
//        System.out.println("total="+total);
//        System.out.println("average="+average);
        //5-5
//        int[] ballArr = {1,2,3,4,5,6,7,8,9};
//        int[] ball3 = new int[3];
//        for(int i =0; i<ballArr.length;i++){
//            int j = (int)(Math.random()*ballArr.length);
//            int tmp = 0;
//            tmp = ballArr[i];
//            ballArr[i] = ballArr[j];
//            ballArr[j] = tmp;
//        }
//        //System.out.println(Arrays.toString(ballArr));
//        for (int i =0; i<ball3.length;i++){
//            ball3[i] = ballArr[i];
//        }
//        for (int i=0; i<ball3.length;i++){
//            System.out.print(ball3[i]);
//        }

        //5-6
        String[] words = {"television","computer","mouse","phone"};
        Scanner sc = new Scanner(System.in);

        for (int i =0; i< words.length; i++) {
            char[] question = words[i].toCharArray();
            for (int j = 0; j < question.length; j++) {
                int idx = (int) (Math.random() * question.length);
                char t;
                t = question[j];
                question[j] = question[idx];
                question[idx] = t;
            }
            System.out.printf("Q%d. %s의 정답을 입력하세요", i + 1, new String(question));
            String a = sc.nextLine();
            if (words[i].equals(a.trim())){
                System.out.println("맞았습니다");
            }else
                System.out.println("틀렸습니다");

        }
    }
}
