package 학교수업;

class Outer {
    int x =10;
    class Inner{ //내부 클래스
        public void printX(){
            System.out.println(x);
        }
    }
}


public class InnerClassEx {
    public static void main(String[] args) {
        Outer o = new Outer();

    }


}
