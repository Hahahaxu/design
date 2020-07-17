package com.company.Adapter;

public class adapterMain {
    public static void main(String[] args) {
        Print p = new PrintBanner("123456");
        p.printStrong();
        p.printWeak();
    }
}
