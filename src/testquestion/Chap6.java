package testquestion;

public class Chap6 {
    // 6챕터 연습문제

    // 1. 내부 : 필드, 생성자 , 메서드. 이너클래스
    //    외부 : 패키지, 임포트, 외부클래스(external class)

    class A {
        int m;
        void method() {
            System.out.println("A의 메서드");

            A a = new A();
            m = 5;
            System.out.println(a.m);
            a.method();


        }
    }
}
