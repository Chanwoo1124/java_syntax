package 학교수업;

import java.util.StringTokenizer;

public class Callogic {
    public int doIt(String temp) {
        int result = 0;

        StringTokenizer t = new StringTokenizer(temp, "+-*/", true);
        while (t.hasMoreTokens()) {
            String r = t.nextToken();

            switch (r) {
                case "+":
                    result += Integer.parseInt(t.nextToken());
                    break;
                case "-":
                    result -= Integer.parseInt(t.nextToken());
                case "*":
                    result *= Integer.parseInt(t.nextToken());
                case "/":
                    result /= Integer.parseInt(t.nextToken());
                default:
                    result = Integer.parseInt(r);
            }

        }

            return result;
    }
}

