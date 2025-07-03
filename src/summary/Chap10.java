package summary;

class AA {
    void print1() {
        System.out.println("A 클래스 print1");
    }
    void print2() {
        System.out.println("A 클래스 print2");
    }
}
class BB extends AA {
    void print1(){
        System.out.println("B 클래스 print1");
    }
    void print2(int a){
        System.out.println("B 클래스 print2");
    }
}
public class Chap10 {
    public static void main(String[] args) {
        BB bb = new BB();
        bb.print1(); // B 클래스 print1
        bb.print2(); // A 클래스 print2
        bb.print2(3); // B 클래스 print2

        AA ab = new BB();
        ab.print1(); // B 클래스 print1 (오버라이딩)
        ab.print2(); // A 클래스 print2

    }
}
