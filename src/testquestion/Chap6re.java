package testquestion;

public class Chap6re {
    public static void main(String[] args) {
        // Q1
        // 클래스 내부 : 필드 생성자 메서드 이너클래스
        // 클래스 외부 : 패키지 임포트 외부클래스

        // Q2 다음과 같이 클래스 A 다음 코드 작성

        A a = new A();
        a.m= 5;
        System.out.println(a.m);
        a.method();



    }
    static class A {
        int m;
        void method(){
            System.out.println("A의 메서드");
        }
    }
}
