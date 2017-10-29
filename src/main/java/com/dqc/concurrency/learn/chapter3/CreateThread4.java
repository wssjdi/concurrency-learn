package com.dqc.concurrency.learn.chapter3;

/**
 * 
 * @Description 
 * @author wssjdi@gmail.com
 * @date 2017年10月29日 上午8:46:58
 */
public class CreateThread4 {

    private static int counter = 1;

    public static void main(String[] args) {

        Thread t1 = new Thread(null, new Runnable() {
            @Override
            public void run() {
                try {
                    add(1);
                } catch (Error e) {
                    System.out.println(counter);
                }
            }

            private void add(int i) {
                counter++;
                add(i + 1);
            }
        }, "Test", 1 << 24);
        t1.start();
    }
}
