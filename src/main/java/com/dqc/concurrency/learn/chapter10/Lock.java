package com.dqc.concurrency.learn.chapter10;


import java.util.Collection;

public interface Lock {

    class TimeOutException extends Exception {

		private static final long serialVersionUID = 2263854789224299498L;

		public TimeOutException(String message) {
            super(message);
        }
    }

    void lock() throws InterruptedException;

    void lock(long mills) throws InterruptedException, TimeOutException;

    void unlock();

    Collection<Thread> getBlockedThread();

    int getBlockedSize();

}