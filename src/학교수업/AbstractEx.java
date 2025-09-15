package 학교수업;


class Animal{
    public void cry(){
        System.out.println("동물이 운다");
    }
}


class Cat extends Animal{
    public void cry(){
        System.out.println("야옹");
    }
}

class DOg extends Animal{
    public  void cry(){
        System.out.println("멍멍");
    }
}

class Pig{
    public void cry(){
        System.out.println("꿀꿀");
    }
}




public class AbstractEx {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.cry();
        DOg g = new DOg();
        g.cry();
    }
}
