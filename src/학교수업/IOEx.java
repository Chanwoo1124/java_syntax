package 학교수업;

import java.io.*;

public class IOEx {
    public static void main(String[] args) throws IOException {
        //1) byte stream  사용
        //파일에 데이터 쓰기
        FileOutputStream fos = new FileOutputStream("/Users/chan/Programming/파일/javatest/test.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        bos.write("ABC이찬우".getBytes());
        bos.flush();

        //파일에서 데이터 읽기
        FileInputStream fis = new FileInputStream("/Users/chan/Programming/파일/javatest/test.txt");
        byte[] temp = new byte[1024];
        fis.read(temp);                 //값을 읽어와서 temp에 넣음

        String msg = new String(temp);
        System.out.print(msg.trim());   // trim() 메소드는  빈 공간들을 제거 함
        System.out.println("and");




    }
}