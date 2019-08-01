package com.example.demo;

class CreateThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("run ()i:"+i);
        }
    }
}

public class ThreadDemo {

    public static void main(String[] args) {
        System.out.println("创建线程开始main");
        //定义一个类 继承thread 类
        CreateThread createThread=new CreateThread();
        //启动一个调用start方法  而不是run 方法
        //使用多线程 代码不会从上往下执行 并行执行
        System.out.println("线程启动");
        createThread.start();
        System.out.println("线程结束");
        //交叉进行执行
        for (int i = 0; i < 100; i++) {
            System.out.println("main()"+i);
        }
    }
}
