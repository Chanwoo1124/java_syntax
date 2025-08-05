package 자바의정석.문제;


public class 배열예제2 {
    public static void main(String args[]){
        int[][] score = {
                {100,100,100},
                {20,20,20},
                {30,30,30},
                {50,50,50,}
        };
        System.out.println("번호  국어  영어  수학  총점  평균");
        System.out.println("=========================");
        int kor = 0;
        int eng = 0;
        int math = 0;
        for (int i =0; i <score.length;i++) {
            int total = 0;
            kor += score[i][0];
            eng += score[i][1];
            math += score[i][2];
            System.out.printf("%3d", i + 1);
            for (int j = 0; j < score[i].length; j++) {

                total += score[i][j];
                System.out.printf("%5d", score[i][j]);
            }
            System.out.printf("%6d", total);
            double avg = total / (float) (score[i].length);
            System.out.printf("%8.2f", avg);
            System.out.println();
        }
        System.out.println("=========================");
        System.out.printf("총점:%4d %4d %4d\n",kor,eng,math);






    }
}
