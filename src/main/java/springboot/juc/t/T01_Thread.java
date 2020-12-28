package springboot.juc.t;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class T01_Thread {

    public static void main(String[] args) {
        eThread eThread= new eThread();
        eThread eThread2= new eThread();
        eThread.start();
        eThread2.start();
        Thread t = new Thread(new eatTread());
        t.start();
        for (int i=0 ;i<5;i++
             ) {
            System.out.println("main{}"+i);
        }



    }

   static class eatTread implements Runnable{

        @Override
        public void run() {
            for (int i=0 ;i<5;i++
            ) {
                System.out.println("run{}"+i);
            }
        }
    }


    static class eThread extends Thread{
        @Override
        public void run() {
            for (int i=0 ;i<5;i++
            ) {
                System.out.println("Thread{}"+i);
            }
        }
    }
}
