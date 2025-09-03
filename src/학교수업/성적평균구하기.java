package 학교수업;

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
    int total = m1.e;
    MyPerson m2 = new MyPerson("박길동",50,90,80,70);
    m2.성적평균구하기();
    m2.성적표출력();
    total = m2.e;
    MyPerson m3 = new MyPerson("홍0길동",70,90,80,70);
    m3.성적평균구하기();
    m3.성적표출력();
    total = m3.e;

    }
}
