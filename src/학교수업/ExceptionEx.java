package 학교수업;

public class ExceptionEx {
    public static void main(String[] args) {

        int x =10;
        int y = 0;
        int r = 0;
        try {

             r = x/ y;
        }catch (ArithmeticException e){
            System.out.println(e);

        }


        System.out.println(r);

        int[] k = new int[3];
        k[0] = 0;
        k[1] = 10;
        k[2] = 100;

        try{
            int x1 = 10;
            int x2 = 0;
            int r2 = x1/x2;

            int[] xx1 = {10,20,30};
            System.out.println(xx1[3]);

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }catch (ArithmeticException e){
            System.out.println(e);
        }
    }
}
