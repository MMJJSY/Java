package testquestion;

public class Chap12 {

    //q7
    interface A {
        void abc();
    }
    class B implements A {
        public void abc(){

        }
    }

    // q1
    // 클래스 B 내부에 상속받은 추상메서드가 존재하지 않기 때문에
    // void abc(){}

    // q2
    // @Override
    // void abc(){print("안녕하세요")}

    // q3
    // new A(){Override void abc(){print("반갑습니다");}};

    // q4

    // q5  extends, extends, implements, 불가능

    // q6 class D extends C implements A, B

    // q7 인터페이스의 void는 자동으로 컴파일되어 public abstract가 포함되어 있고
    // 자식은 void는 default 타입이므로 불가능하다
    // public void abc() { } 로 만들어야함

    // q8 A.super.abc(){}
}
