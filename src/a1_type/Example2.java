package a1_type;

public class Example2 {
    public static void main(String[] args) {
        // 정수형 변수 생성 연습
        byte a = 1; // 127까지이므로 128부터 오류 발생
        short b = 128;
        int c = 1000; // 최대값이 대략 20억정도
        long d = 100000; // 뒤에 l 또는 L을 명시적으로 붙이기도 한다.
        // 실수형 변수 생성 연습
        // float e = 3.5; // 실수형의 기본형은 double이므로 float = double가 되어 오류 발생
        double f = 3.144372894732; // d 또나 D를 명시적으로 붙이기도 한다.
        float e = 3.5F; // f나 F를 붙여 float임을 인식
        // 문자형
        char g = 'A';
        String h = "안녕하세요"; // 참조자료형 (char를 여러개 모아놓은 형태) 대문자로 시작해야함
        // 불리언형
        boolean i = false;

        // 진법에 따른 표기법 연습 (10진법, 2진법, 16진법
        System.out.println(c); // 1000
        c= 15; // 10진법
        System.out.println(c); // 15
        c = 0b1111; //2진법
        System.out.println(c); // 15
        c = 0xF; // 16진법
        System.out.println(c); // 15
    }
}
