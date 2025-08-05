package proprammers;
import java.util.Scanner;
public class 문자열반복해서출력하기 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int n = scanner.nextInt();

        for (int i =0; i<n;i++){
            System.out.print(s);
        }
    }
}
/**/