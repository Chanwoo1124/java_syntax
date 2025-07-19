package 자바의정석.개념;
import java.util.Scanner;


public class while문 {
    public static void main(String args[]){
//        int i = 5;
//        while (i-- != 0){
//            System.out.println(i);
//        }
//        System.out.println("---");
//        i = 5;
//        //감소연산자 앞뒤 차이
//        while (--i !=0){
//            System.out.println(i);
//        }
        Scanner sc = new Scanner(System.in);
        String t = sc.nextLine();
        int num = Integer.parseInt(t);
        System.out.println(num);
        int sum = 0;
        while (num != 0){
            sum += num % 10;
            System.out.printf("sum=%3d num=%d%n",sum,num);
            num /= 10;


        }
    }
}
