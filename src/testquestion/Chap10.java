package testquestion;

class A {
    int m =2;
    static int n = 4;
    void method1(){
        System.out.println("A클래스 instance method");
    }
    static void method2(){
        System.out.println("A클래스 static method");
    }
}
class B extends A {
    int m = 6;
    static int n =8;
    void method1(){
        System.out.println("B 클래스 instance method");
    }
    static void method2(){
        System.out.println("B 클래스 static method");
    }
}
    class C {
        C(){
            System.out.println("A 생성자1");
        }
        C(int c){
            this();
            System.out.println("A 생성자2");
        }
    }
    class E extends C {
        E(){
            System.out.println("B 생성자1");
        }
        E(int c){
            super(c);
            System.out.println("B 생성자2");
        }
    }

public class Chap10 {
    public static void main(String[] args) {
        A ab = new B();
        System.out.println(ab.m); // 2
        System.out.println(ab.n); // 4
        ab.method1(); // B 클래스 instance method
        ab.method2(); // A 클래스 static method

            E ee = new E(5);
    }



    //q1 클래스 이름과 같아야한다.
    //   반환형이 없다.

    //q2
    // class B extends A
    // class C extends B
    // class D extends B

    //q3
    //O O O O
    //X O X O
    //X X O X
    //X X X O

    //q4
    //X X X X
    //O X X X
    //O O X X

    //q5
    // tfff / ttft

    //q6
    // "안녕하세요", "반갑습니다", "반갑습니다."

    //q7 E private 때문 A가 default임

    //q8 2, 4, B클 instance, A클 static method

    //q9 A의 기본생성자가 없기 때문에 super()를 호출할 수 없다

    //q10 A 생성자1 A 생성자2 B생성자2

    //q11 - A 클래스 내부의 equals() 메서드는 오버라이딩을 하지 않아 Object 클래스의 equals() 메서드
    //    - 이는 스택 메모리의 값 비교 즉, 객체의 위치를 비교
    //    - 따라서 두 객체의 생성위치가 서로 다르기 때문에 false가 출력

    //q12
//     @Override
//     public boolean equals(Object obj){
//     if(obj instanceof A) {
//          return this.data == ((A)obj).data;
//         }
//       return false;
//      }



}

