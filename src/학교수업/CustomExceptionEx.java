package 학교수업;

//프로젝트 진행하다 보면 현재 프로젝트 정책상 예외 취급해야되는 특정 상황/ 특정 코드가 생기가됨
//이런 우리만의 예외상황을 관리하기 위해 우리만의 커스텀된 예외 클래스를 정의해 줄 수 있다.

//우리만의 예외를 정의해줄 떄에는 자바의 룰에따라 모든 에외처리에 관련된 클래스의 최상위 클래스에 해당하는 Exception 클래스를 상속받도록 해야 함!
class MyException extends  Exception{

}


public class CustomExceptionEx {
    public static void main(String[] args) {
        //자 그럼 우리만의 예외처리 클래스를 실제 사용해보자
        try {
            int x = 10;
            int y = 2;
            if (y == 2){
                throw new MyException();    //나만의 예외 클래스 만들고 예외 발생 시키기 throws/ throw의 차이 throw: 나만의 예외를 강제 발생시킬때 사용
            }
            int r = x / y;
            System.out.println(r);
        } catch (Exception e){
            System.out.println(e);
        }





    }
}
