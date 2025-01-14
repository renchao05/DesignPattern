//package com.renchao.principle.segregation;
//
//public class Demo1 {
//    public static void main(String[] args) {
//        B b = new B();
//        D d = new D();
//        A a = new A();
//        C c = new C();
//        a.depend1(b);
//        a.depend2(b);
//        a.depend3(b);
//
//        c.depend1(d);
//        c.depend4(d);
//        c.depend5(d);
//    }
//}
//
//interface Interface1 {
//    void operation1();
//    void operation2();
//    void operation3();
//    void operation4();
//    void operation5();
//}
//
//class B implements Interface1 {
//    public void operation1() {
//        System.out.println("B 实现了 operation1");
//    }
//
//    public void operation2() {
//        System.out.println("B 实现了 operation2");
//    }
//
//    public void operation3() {
//        System.out.println("B 实现了 operation3");
//    }
//
//    public void operation4() {
//        System.out.println("B 实现了 operation4");
//    }
//
//    public void operation5() {
//        System.out.println("B 实现了 operation5");
//    }
//}
//
//class D implements Interface1 {
//    public void operation1() {
//        System.out.println("D 实现了 operation1");
//    }
//
//    public void operation2() {
//        System.out.println("D 实现了 operation2");
//    }
//
//    public void operation3() {
//        System.out.println("D 实现了 operation3");
//    }
//
//    public void operation4() {
//        System.out.println("D 实现了 operation4");
//    }
//
//    public void operation5() {
//        System.out.println("D 实现了 operation5");
//    }
//}
//
//class A { //A 类通过接口 Interface1 依赖(使用) B 类，但是只会用到 1,2,3 方法
//    public void depend1(Interface1 i) {
//        i.operation1();
//    }
//
//    public void depend2(Interface1 i) {
//        i.operation2();
//    }
//
//    public void depend3(Interface1 i) {
//        i.operation3();
//    }
//}
//
//class C { //C 类通过接口 Interface1 依赖(使用) D 类，但是只会用到 1,4,5 方法
//    public void depend1(Interface1 i) {
//        i.operation1();
//    }
//
//    public void depend4(Interface1 i) {
//        i.operation4();
//    }
//
//    public void depend5(Interface1 i) {
//        i.operation5();
//    }
//}