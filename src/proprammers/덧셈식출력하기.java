package proprammers;
import java.util.Scanner;


public class 덧셈식출력하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a + b;
        System.out.printf("%d + %d = %d\n", a, b ,c);
    }

}
