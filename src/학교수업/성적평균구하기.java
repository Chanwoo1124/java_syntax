package 학교수업;

import java.util.ArrayList;

class  MyPerson{
    int age;
    String name;
    int score1;
    int score2;
    int score3;
    int e = 0; //평균값을 저장하기 위한변수

    public MyPerson(String n,int a, int s1,int s2,int s3){
        name =n;
        age = a;
        score1 = s1;
        score2 = s2;
        score3 = s3;
        e = score1 + score2 + score3;
    }


    public void 성적평균구하기(){
        int result = score1 + score2 + score3;
        e = result / 3;

    }
    public  void 성적표출력(){
        System.out.println("이름:" + name);
        System.out.println("나이:" + age);
        System.out.println("성적평균:" + e);
    }
}


public class 성적평균구하기{
    public static void main(String[] args) {
    MyPerson m1 = new MyPerson("김길동",20,90,80,70);
    m1.성적평균구하기();
    m1.성적표출력();

    MyPerson m2 = new MyPerson("박길동",50,90,80,70);
    m2.성적평균구하기();
    m2.성적표출력();

    MyPerson m3 = new MyPerson("홍0길동",70,90,80,70);
    m3.성적평균구하기();
    m3.성적표출력();

    //객체를 여러개 저장할 수 있는 공간
    ArrayList mTotal = new ArrayList();
    mTotal.add(m1);    //mTotal 에 m1객체 저장
    mTotal.add(m2);
    mTotal.add(m3);

    for (int i = 0; i < mTotal.toArray().length; i++){
        MyPerson t = (MyPerson) mTotal.get(i); //ArrayList 에서 값 가져올때는 순서를 기준으로 가져옴
        int result = t.score1 + t.score2 + t.score3;
    }




    }
}
