package 학교수업;

import java.util.StringTokenizer;

public class StringTokenEx {
    public static void main(String[] args) {
        //StringTokenizer : 문자열 분리를 위해 사용하는 클래스

        String str = "3+2-1";
        int result = 0;
        StringTokenizer t = new StringTokenizer(str, "+-", true);
        while (t.hasMoreTokens()) {
            String r = t.nextToken();
            if (r.equals("+")) {
                result = result + Integer.parseInt(t.nextToken());

            } else if (r.equals("-")) {
                result = result - Integer.parseInt(t.nextToken());
            } else {
                result = Integer.parseInt(r);


                System.out.println();

            }

        }
    }
}