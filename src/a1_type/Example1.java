package a1_type;

public class Example1 {
    public static void main(String[] args) {
        // byte타입의 크기 (1byte) 만큼 메모리를 할당 받고 그 주소를 a라고 부르고
        // a 위치에 숫자 1을 저장한다.
        byte a = 1;
        byte b = 2;
        System.out.println(b); // 2
        b = 3; // 기존 b의 위치에 3을 덮어쓴다.
        System.out.println(b); // 3
        // byte b = 4; // 에러발생! 같은 이름의 변수를 선언할 수 없음
        // 사칙연산 (+,-,*,/)
        int c = a + b;
        System.out.println(c); // 4
        System.out.println(a*b); // 3
        System.out.println(a/b); // 0 정수 1/3 0.333이기때문에 0으로 표기됨
        //char ch1 = A; // A는 변수인가? 예약어인가? 아 변수구나 하는데 없어서 에러
        // char형은 문자 '하나'만 저장하고 단따옴표를 사용한다.
        char ch1 = 'A';
        char ch2 = 'B';
        System.out.println(ch1); //A
        System.out.println(ch2); //B
        // 산술연산자 + 때문에 숫자로 변환하여 덧셈을 수행한다.
        System.out.println(ch1 + ch2); // 131 대문자 A는 65, B는 66
        // 빈문자열이 포함 되면 숫자가 아닌 문자로 인식한다
        System.out.println("" + ch1 + ch2); //AB ""는 문자라는 뜻으로 인식
        // +기호는 문자형 변수를 숫자로 인식하게 한다.
        System.out.println(+ch1); // 65 이때 +는 더하기가 아니라 숫자라는 뜻
        System.out.println(+ch1 + +ch2); //131

        //char name = "steve"; // 에러발생! char 형은 문자 하나만 저장하고 단따옴표를 사용한다.
        String name = "Steve"; // 문자열은 String 으로 생성한다. 기본 자료형(boolean, int, long, double 등) 과는 다르다.
        System.out.println(name); // steve
        System.out.println(name.length()); // 5
        String str1 = "한글";
        System.out.println(str1.length()); // 2

        boolean bool = true; // true는 참을 의미하는 예약어(keyword) 숫자로는 1
        System.out.println(bool); // true
        bool = false;
        System.out.println(bool); // false 거짓의 의미이고 숫자로는 0





    }
}
