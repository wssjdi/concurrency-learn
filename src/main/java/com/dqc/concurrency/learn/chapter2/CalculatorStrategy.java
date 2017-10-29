package com.dqc.concurrency.learn.chapter2;

/**
 * 
 * @Description 
 * @author wssjdi@gmail.com
 * @date 2017年10月29日 上午8:43:24
 */
@FunctionalInterface
public interface CalculatorStrategy {

    double calculate(double salary, double bonus);
}
