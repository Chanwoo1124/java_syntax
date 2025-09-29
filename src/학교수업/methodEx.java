package 학교수업;
//자바에서 메소드 정의 문법
//접근 제한자 리턴형 메소드 이름 (파라미터 {...}

//접근 제한자 종류 :public protected default private
//리턴형 종류 기본자료형 ,객체형, void(리턴형이 없음을 의미)
            //public :누구나 접근해서 사용가능한 메소드
            //private: 메소드가 정의된 클래스 안에서만 사용 가능
            //

class  MyCal{

    public int add(int x,int y){
        int r = x + y;
        return r;
    }
    public double add(double x,double y){
        double r = x + y;
        return r;
    }
}



class 라면{
    //접근 제한자, 리턴형 메소드 이름  순으로
    public void 라면끓어줘( int 라면살돈){
        System.out.println("새우탕");
    }

}


public class methodEx {
    public static void main(StringEx[] args) {
        라면 라면1 = new 라면();
        라면1.라면끓어줘(1000);
        MyCal a = new MyCal();
        int r =a.add(1,2);
        System.out.println(r);
        double d = a.add(0.1,0.2);
        System.out.println(d);
    }
}
