package com.atguigu.bigdata.java.chapter01;

public class TestJava {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Runnable() {
            public void run() {

            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {

            }
        });
        t1.start();
        t2.start();

        Thread.sleep(1000);//Thread类中的静态方法
        t2.wait();//Object类中的成员方法
    }
}
