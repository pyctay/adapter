package com.lizx.adapter_1;

/**
 * 适配器
 *
 * @date 2018/2/12 19:05:24
 * @auther Pyctay
 */
public class Adapter extends Source implements Target {
    @Override
    public void dance() {
        System.out.println("Dancing..");
    }
}
