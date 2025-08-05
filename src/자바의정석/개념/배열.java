package 자바의정석.개념;
import java.util.Arrays;

public class 배열 {
    public static void main(String args[]){
    int[] score = new int[5];
    for (int i = 0; i < score.length; i++){
        System.out.println(score[i]);
    }

    int[] a = new int[]{10,20,30,40,50};
    int[] b = {10,20,30,40,50};
    System.out.println(Arrays.toString(b));

    String[] str = {"qwe","asd","zxc"};
    System.out.println(Arrays.toString(str));

    int[][] s = {
            {10,20,30},
            {30,30,30},
            {40,30,20}
    };
    System.out.println(Arrays.toString(s[0]));



    }
}
