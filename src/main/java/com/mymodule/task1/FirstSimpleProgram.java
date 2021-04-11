package com.mymodule.task1;

public class FirstSimpleProgram {
    public static void main(String[] args) {
        saySomething("world");
        saySomething("Alex");
    }
    public static void saySomething(String s) {
        System.out.println("Hello, " + s + "!");
    }
}
