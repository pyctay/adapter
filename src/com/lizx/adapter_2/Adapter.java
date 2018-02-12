package com.lizx.adapter_2;

/**
 * 适配器
 *
 * @date 2018/2/12 19:05:24
 * @auther Pyctay
 */
public class Adapter implements Target {
    private static Source source;

    public Adapter(Source source) {
        this.source = source;
    }

    @Override
    public void sing() {
        source.sing();
    }

    @Override
    public void dance() {
        System.out.println("Dancing..");
    }
}
