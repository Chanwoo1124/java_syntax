package 학교수업;


//class 구성요소 3가지
//1. 멤버 변수
//2. 메소드
//3. 생성자

class MyClass{
    int x = 10;
    public void printX(){
        System.out.println(x);
    }
}

public class OOPEx {
    public static void main(StringEx[] args) {
    MyClass my = new MyClass();
    my.printX();
    }
}


// 클래스에 있는 멤버 변수를 객체화 하지않아도 메인 메소드에서 사용할수있는 경우는
// 클래스내에있는 멤버 변수 앞에 ex) static int x = 10; 올리면 메인 메소드에서 사용 할수있음.