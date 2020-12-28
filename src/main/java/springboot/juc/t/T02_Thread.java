package springboot.juc.t;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class T02_Thread {

    public static void main(String[] args) {
        eatTread eatTread = new eatTread();
        eatTread.run();
        new Thread(() -> {
            for (int i = 0; i < 5; i++
            ) {
                System.out.println("Thread: {}" + i);
            }
        }).start();
        for (int i = 0; i < 5; i++
        ) {
            System.out.println("main{}" + i);
        }



    }

    static class eatTread implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < 5; i++
            ) {
                System.out.println("run{}" + i);
            }
        }
    }


}
