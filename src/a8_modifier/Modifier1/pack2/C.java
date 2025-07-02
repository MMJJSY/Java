package a8_modifier.Modifier1.pack2;

import a8_modifier.Modifier1.pack1.A;

public class C {
    public void print() {
        A a = new A();
        System.out.print(a.a + " ");
        //System.out.print(a.b + " "); // protected 외부패키지 read/write불가
        //System.out.print(a.c + " "); // default 외부패키지 read/write불가
        //System.out.print(a.d + " "); // private 외부클래스 read/write불가
        // pack1.A를 임포트 했지만 이는 그 위치를 볼 수 있는 것이지
        // 권한을 받은 것이 아니다.
        System.out.println();
    }
}
