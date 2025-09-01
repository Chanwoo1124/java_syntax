package 학교수업;
//자바에서 메소드 정의 문법
//접근 제한자 리턴형 메소드 이름 (파라미터 {...}

//접근 제한자 종류 :public protected default private
//리턴형 종류 기본자료형 ,객체형, void(리턴형이 없음을 의미)

import java.sql.SQLOutput;

class 라면{
    //접근 제한자, 리턴형 메소드 이름  순으로
    public void 라면끓어줘( int 라면살돈){
        System.out.println("새우탕");
    }

}


public class methodEx {
    public static void main(String[] args) {
        라면 라면1 = new 라면();
        라면1.라면끓어줘(1000);
    }
}
