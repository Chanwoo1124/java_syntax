package 김영한;

public class 삼항연산자 {
    public static void main(String[] args) {
//        int age = 16;
//        String status = (age >= 18)? "성인":"미성년자";
//        System.out.println("age="+ age+" status="+status);

//        int a = 30;
//        int b = 20;
//        int c = (a > b) ? a : b;
//        System.out.println("더 큰 숫자는 "+ c +"입니다.");

        int x = 2;
        String s = (x % 2 == 0)? "짝수" : "홀수";
        System.out.println(s);

    }
}
