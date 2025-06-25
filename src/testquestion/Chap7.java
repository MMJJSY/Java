package testquestion;

import java.util.Arrays;

public class Chap7 {

    public static void main(String[] args) {
        // chap 7 연습문제
        // 1. fasle, 0, 0.0, null
        // b+c= 0.0, c+d= 0.0null, d+a= nullfalse

        // 2.
        A a = new A();
        int[] data1 = new int[] {1,2,3};
        int[] data2 = {1,2,3};
        System.out.println(a.arraySum(data1)); // 6
        System.out.println(a.arraySum(data2)); // 6
        System.out.println(a.arraySum(new int[] {1,2,3})); //6
//        System.out.println(a.arraySum({1,2,3});



        // 4.
        B b = new B();
        int m = 5;
        int[] n = {1,2,3};

        System.out.println(m); //5
        System.out.println(Arrays.toString(n)); // [1, 2, 3]

        b.abc(m);
        b.bcd(n);



        System.out.println(m); // 5
        System.out.println(Arrays.toString(n)); // [4, 5, 6]

        //
        // 참조자료형은 주소를 복사함
        /*
        int m = 5; main의 int = 5 스택에 생성
        지역변수 int m = 8 스택에 생성
        print(m) = main의 int 5

        int[] n = {1,2,3}; int[] n 스택에 생성 하고 힙에 [1 , 2 , 3] 생성
        bcd의 힙이 [4,5,6]으로 변해 힙에 저장됨
        sout(n) = int[] n = 힙의 위칫값 [4,5,6]
         */

        // 6. A a1 = new A(3);
        //    A a2 = new A(2.0,3.0);

        // 7.
        C c = new C();
        c.abc(7,8);
        System.out.println(c.m); // 3
        System.out.println(c.n); // 5
        // 객체내의 필드 m,n 을 수정하려면 반드시 this.m, this.n을 사용해야 한다.

        //8. this(5);



    }

    static class A {

        int arraySum(int[] array) {
            int sum =0;
            for(int i =0; i < array.length; i++) {
                sum += array[i];
            }
            return sum;
        }
    }
    static class B {
        void abc(int m) {
            m=8;
        }
        void  bcd(int[] n) {
            n[0] = 4; n[1] = 5; n[2] = 6;

        }
    }
    static class C {
        int m = 3;
        int n = 5;
        void abc(int m, int n) {
            m = this.m;
            n = n;
            System.out.println(m); // 3
            System.out.println(n); // 8
        }
    }
}


