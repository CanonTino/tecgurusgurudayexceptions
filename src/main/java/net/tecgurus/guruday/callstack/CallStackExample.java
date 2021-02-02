package net.tecgurus.guruday.callstack;

public class CallStackExample {

    public static void main(String[] args) {
        new CallStackExample().method1();
    }

    void method1() {
        System.out.println("Method 1");
        method2();
    }

    void method2() {
        System.out.println("Method 2");
        method3();
    }

    void method3() {
        System.out.println("Method 3");
    }
}
