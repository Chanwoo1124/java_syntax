package 학교수업;

class MyThread1 extends Thread{
    public void run(){

        for (int i = 0; i < 10; i++){
            System.out.println(i);
        }
    }

}
//2번 방식으로 정의
class  MyThread2 implements Runnable{

    @Override
    public void run() {  //callback method
        //Thread 수행할 작업을 코딩
        for (int i = 0; i < 100; i++){
            System.out.println(i);
        }

    }


}




public class ThreadEx {
    public static void main(String[] args) {
        System.out.println("start");

        MyThread1 myThread1 = new MyThread1();
        myThread1.start();

        System.out.println("End");

        System.out.println("start");


        MyThread2 myThread2 = new MyThread2();
        Thread m2t = new Thread(myThread2);

        System.out.println("End");
        m2t.start();
    }
}
