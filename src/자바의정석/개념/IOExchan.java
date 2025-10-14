package 자바의정석.개념;

import java.io.*;

public class IOExchan {
    public static void main(String[] args) throws IOException {
        FileOutputStream fops = new FileOutputStream("/Users/chan/Programming/파일/javatest/chan.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fops);
        bos.write("이찬우".getBytes("UTF-8"));
        bos.flush();

        FileInputStream fis = new FileInputStream("/Users/chan/Programming/파일/javatest/chan.txt");
        byte[] b = new byte[1024];
        fis.read(b);

        String msg = new String(b,"UTF-8");
        System.out.println(msg.trim());


    }
}
