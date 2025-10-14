package 자바의정석.개념;

public class switchfor {
    public static void main(String[] args) {
        int a = 8;
        int b = 7;
        if ( a > b ){
            System.out.println("a큼");

        }else{
            System.out.println("b큼");
        }
        a = 100;
        switch (a/ 10){
            case 10:
                System.out.println("10");
                break;
            case  9:
                System.out.println("9");
                break;
            case 8:
                System.out.println("8");
                break;
            default:
                System.out.println("10,9,8 no");
        }
        for (int i = 0; i < b; i++){
            System.out.println("for문");
        }
        int i = 0;
        while ( i < b ){
            System.out.println("while");
            i++;
        }


    }
}
