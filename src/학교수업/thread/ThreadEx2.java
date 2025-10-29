package 학교수업.thread;

import java.awt.image.ImageProducer;

public class ThreadEx2 {
    public static void main(String[] args) {
        Car c = new Car();
        Producer producer = new Producer(c);
        Thread tProdeucer = new Thread(producer);
        Customer tCustomer = new Customer(c);
        Thread tc = new Thread(tCustomer);
        tProdeucer.start();
        tc.start();

    }
}
