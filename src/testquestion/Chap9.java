package testquestion;

public class Chap9 {
    /* Q1
    public
    protected
    default
    private

        q2
        public default

        q3
        A에서는
        a,b,c,d
        B에서는 a b c
        C에서는 a
        D에서는 a b (b는 상속받아서 가능)  가능

        q4
        static 메서드 내부에서는 static 멤버(static필드,static메서드)만 사용 가능

        q5
        30
        60
        50
        60

        q6


     */
class A {
    static int a;

    static {
        a=8;
    }

    }

    public static void main(String[] args) {
        System.out.println(A.a);
    }
}

