package 학교수업;


import java.io.*;

public class IOEx2 {
    public static void main(String[] args) throws IOException{
        //character steram 계열을 사용하여 파일에 읽기/쓰기
        FileWriter fw = new FileWriter("/Users/chan/Programming/파일/javatest/test.txt");
        fw.write("가나다");
        fw.flush();

        FileReader Fr = new FileReader("/Users/chan/Programming/파일/javatest/test.txt");
        BufferedReader br = new BufferedReader(Fr);
        String result = br.readLine();
        System.out.println(result);


    }
}
