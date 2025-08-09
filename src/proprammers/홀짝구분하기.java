package proprammers;
import java.util.Scanner;


public class 홀짝구분하기 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        if (s % 2 == 0){
            System.out.printf("%d is even",s);

        }else{
            System.out.printf("%d is odd",s);

        }

    }
}
