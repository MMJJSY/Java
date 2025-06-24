package summary;

public class Chap6 {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.m); // 0
        System.out.println(a.n); // 0
    }
}
    class A {
        int m;
        int n;
        void work1() {
            int k;
//            System.out.println(k); // 지역변수 k는 초깃값 없이 출력을 시도해 오류 발생
        }
}

