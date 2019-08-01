package com.example.demo;

import org.junit.Test;

import java.util.function.Consumer;

/**
 * java内置
 */
public class LambdaTest01 {

    @Test
    public void test01(){
        happyTime(500,money -> System.out.println("学习太累了去消费一下"+money));
    }
    public void happyTime(double money, Consumer<Double> con){
        con.accept(money);
    }
}
