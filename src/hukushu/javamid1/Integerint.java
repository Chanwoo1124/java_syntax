package hukushu.javamid1;

import java.util.ArrayList;

public class Integerint {
    public static void main(String[] args) {
        int i = 0;
        String s = "ccc@aaa.com";
        char[] charArray = s.toCharArray();

        if(charArray[0] == '@'){

        }
        for (char c : charArray) {
            if(c == '@'){
                i++;
            }
        }


    }

}

