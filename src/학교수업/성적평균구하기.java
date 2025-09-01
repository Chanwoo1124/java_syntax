package 학교수업;

class  MyPersson{
    private int x1,x2,x3;
    public void 성적(int i ,int j ,int p){
//        int result = (i+j+p) /3;
        System.out.println((i+j+p) /3);
    }
}

public class 성적평균구하기{
    public static void main(String[] args) {
        MyPersson m = new MyPersson();
        m.성적(100,90,80);
        m.성적(80,80,80);
    }
}
