package proprammers;
import java.util.Scanner;



public class 대소문자바꿔서출력하기 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String st = scanner.nextLine();
        String st1 = "";
        for (char s : st.toCharArray()) {
            if ('A'<= s && s <='Z'){
                st1 += Character.toLowerCase(s);
            }else{
                st1 += Character.toUpperCase(s);
            }
        }
        System.out.println(st1);
    }
}
