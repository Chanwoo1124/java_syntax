package 학교수업;

class AAA{
    public AAA(){
        System.out.println("내가 aaa 생성자");
    }
}
class BBB extends AAA{
    public BBB(){
        System.out.println("내가 bbb생성자");
    }
}


public class OOPEx2 {
    public static void main(String[] args) {
        new BBB();
    }
}
