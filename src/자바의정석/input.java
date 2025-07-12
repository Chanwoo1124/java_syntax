package 자바의정석;

import java.util.Scanner;



public class input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(input);
        int num = Integer.parseInt(input);
        num += 1;
        System.out.println(num);
        int num2 = scanner.nextInt();
        System.out.println(num2);


    }
}
