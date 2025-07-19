package 자바의정석.개념;

public class random {
    public static void main(String args[]){
        int num;


        for (int i = 0; i <= 5; i++) {
            num = (int) (Math.random() * 10) + 1;
            System.out.println(num);

        }

    }
}
