package 학교수업;


class ATM2 implements Runnable {
    private long depositMoney = 100000; // 계좌 잔액

    @Override
    public void run() {

        synchronized (this){
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(1000); // 1초 대기
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (getDepositMoney() <= 0)
                    break;
                withdraw(10000);
            }
        }

    }

    // 동기화된 인출 메서드 (스레드 간 충돌 방지)
    public synchronized void withdraw(long howMuch) {
        if (getDepositMoney() > 0) {
            depositMoney -= howMuch;
            System.out.println(Thread.currentThread().getName() + "가 " + howMuch + "원 인출함");
            System.out.println("남은 잔액: " + getDepositMoney() + "원");
        } else {
            System.out.println(Thread.currentThread().getName() + ": 잔액 부족");
        }
    }

    public long getDepositMoney() {
        return depositMoney;
    }
}


public class SynchEx{
    public static void main(String[] args) {
        ATM2 a = new ATM2();
        Thread mother = new Thread(a, "현재스레드 이름 할당");
        mother.start();

//        ATM2 b = new ATM2();
        Thread son = new Thread(a, "son");
        son.start();



    }
}