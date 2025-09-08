package 학교수업;
//oop : 유지보수 관리가 편리한 프로그ㅐㄻ
//oop에 출발점은 멤버 변수 private 선언부터
// 추가로 public get,set 메소드 구현
class Mystudent{
    public int age;
    public String name;
}

public class OOPBasic {
    public static void main(String[] args) {
        Mystudent m1 = new Mystudent();
        m1.age = 20;
        m1.name = "김길동";
        Mystudent m2 = new Mystudent();
        m1.age = 22;
        m1.name = "박길동";
    }
}
