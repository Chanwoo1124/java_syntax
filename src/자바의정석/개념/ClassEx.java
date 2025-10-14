package 자바의정석.개념;

class Aclass {
    public void a(){
        System.out.println("a 클래스");

    }
}

class B extends  Aclass{
    public void a(){
        System.out.println("B 클래스에서 재정의");
    }
}

public class ClassEx{
    public static void main(String[] args) {
        Aclass c = new Aclass();
        Aclass d = new B();

        c.a();
        d.a();

    }




}
