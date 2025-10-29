package 학교수업.thread;

public class Producer implements Runnable {
    private  Car car;
    public Producer(Car c) {
        this.car = car;
    }
    public void run(){
        String carName = null;
        for (int i = 0; i < 20; i++) {
            carName = car.getCar();
            car.push(carName);
            try {
                Thread.sleep((int) (Math.random() * 200));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
