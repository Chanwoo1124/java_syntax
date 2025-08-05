package 자바의정석.문제;
import java.util.Scanner;
public class 연습문제4 {
    public static void main(String args[]){
        //4-1
//        int x = 9;
//        if (10 <= x && x <= 20){
//            System.out.println("ture");
//        }
//        char ch = ' ';
//        if (ch != ' '&& ch != 't'){
//            System.out.println("ture");
//        }
//          char ch = 'x';
//          if (ch == 'x' || ch == 'X'){
//              System.out.println("ture");
//
//          char ch = '5';
//          if ('0'<=ch && ch <='9'){
//              System.out.println("ture");
//
//          char ch = 'A';
//            if ('A'<= ch && ch <='Z'){
//                System.out.println("ture");
//
//          int i = 2024;
//          if (i % 400 == 0 || i % 4 == 0){
//              if (i % 100 != 0){
//                  System.out.println("ture");
//                }
//            }

//                boolean powerOn = false;
//                if (powerOn == false){
//                    System.out.println("ture");
//                }
//                String str = new String("Yes");
//                if (str.equals("Yes")){
//                    System.out.println("ture");
//                }
                //4-2
//                int sum = 0;
//                for (int i= 1; i <= 20; i++ ){
//                    if (i % 2 != 0 && i % 3 != 0) {
//                        sum += i;
//                    }
//                }
//                System.out.println(sum);
//
                //4-3
//
//                int sum = 0;
//                for (int n = 0; n <= 10; n++ ){
//                    sum = sum + 1 + n;
//                    System.out.println(sum);
//                }
                //4-4
//                int sum = 0;
//                int n = 1;
//
//                while (sum<100){
//                    if (n % 2 ==0){
//                        sum -= n;
//
//                    }else{
//                        sum += n;
//                    }
//                    n += 1;
//                }
//                System.out.println(n-1);

//    }           //4-5
//                int num = 1;
//                while (num <=10){
//                    int i = 1;
//                    while(i<=num){
//                        System.out.print("*");
//                        i +=1;
//                    }System.out.println();
//                    num += 1;
//                    }
                 //4-6
//                    int count = 0;
//                    for (int i = 1; i <=6; i++){
//                         for (int j = 1; j <= 6; j++) {
//                             if (i + j == 6) {
//                                 count += 1;
//                             }
//
//                         }
//        }           System.out.println(count);
//                //4-7
//                String str = "12345";
//                int sum = 0;
//
//                for (int i = 0; i < str.length(); i++){
//                    int j = str.charAt(i) - '0';
//                    sum += j;
//
//                }
//                System.out.println(sum);
//

//                //4-8
//                int value = (int) (Math.random()*6)+1;
//                System.out.println(value);

                  //4-9
//                  int num = 12345;
//                  int sum = 0;
//
//
//                  while (num != 0) {
//                      int i = num % 10;
//                      sum += i;
//                      num /= 10;
//                  }
//                  System.out.println(sum);


                  //4-10
                  int answer = (int) (Math.random() *100)+1;
                  Scanner sc = new Scanner(System.in);
                  int count = 0;
                  while (true) {
                      System.out.print("1과100사이의 값을 입력하세요:");
                      int i= sc.nextInt();
                      if (answer < i){
                          System.out.println("더 작은수를 입력하세요");

                      }else if (answer > i ){
                          System.out.println("더 큰수를 입력하세요");

                      }else{
                          System.out.println("맞혔습니다");
                          break;
                      }
                      count += 1;


                  }
                  System.out.printf("시도횟수는 %d입니다",count);

    }
}
