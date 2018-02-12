package com.lizx.adapter_2;

public class Main {

    public static void main(String[] args) {
        Source source = new Source();
        Adapter adapter = new Adapter(source);
        adapter.sing();
        adapter.dance();
    }
}
