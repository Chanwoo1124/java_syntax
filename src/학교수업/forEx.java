package 학교수업;
public class forEx {
    public void printC(char c, int n) {
        System.out.print(c);

        if (n > 1) {
            printC(c, n - 1);
        }
    }


    public static void main(String[] args) {
        //자바에서 반복문
        //기본문법
        //
        for (int i = 1; i < 10; i ++) {
            forEx f = new forEx();
            f.printC('*', i);
            System.out.println("");
        }
//        for (int i = 0; i < 10; i ++){

//            forEx.printC('*',i);
//
//            }
//
//
//        }
//    }
//
    }

}
