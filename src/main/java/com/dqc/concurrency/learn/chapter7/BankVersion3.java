package com.dqc.concurrency.learn.chapter7;


/**
 * 
 * @Description 
 * @author wssjdi@gmail.com
 * @date 2017年10月29日 上午8:52:55
 */
public class BankVersion3 {
    public static void main(String[] args) {
        final SynchronizedRunnable ticketWindow = new SynchronizedRunnable();

        Thread windowThread1 = new Thread(ticketWindow, "一号窗口");
        Thread windowThread2 = new Thread(ticketWindow, "二号窗口");
        Thread windowThread3 = new Thread(ticketWindow, "三号窗口");
        windowThread1.start();
        windowThread2.start();
        windowThread3.start();
    }
}
