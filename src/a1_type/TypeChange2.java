package a1_type;

public class TypeChange2 {
    public static void main(String[] args) {
        // 비명시적인 타입변환 = 자동 타입변환
        float value1 = 3; // int가 float 으로 업캐스팅 됨
        System.out.println(value1); // 3.0
        long value2 = 5; // int가 long 으로 업캐스팅
        System.out.println(value2); //  5
        double value3 = 7; //int가 double로 업캐스팅
        System.out.println(value3); // 7.0
        byte value4 = 127;
        byte value4_1 = (byte) 128; // 에러발생! 바이트 사이즈 초과
        System.out.println(value4); // 127
        System.out.println(value4_1); // -128 오류 (타입캐스팅의 강제성)
        int value5 = (int)3.5; // 소숫점 이하 자리를 없앨 목적으로 사용함
        System.out.println(value5); //3

        /*
        1) 업캐스팅 (가용 숫자 범위가 작은 타입에서 큰 타입으로의 변환)
        byte < short < int < long < float < double
        : 일반적으로 안전하며 자동으로 타입변환이 발생한다.
        (주의) float의 경우에는 값에 오류가 발생할 가능성이 있음. double 사용 권장
        2) 다운캐스팅 (업캐스팅의 반대)
        : 일반적으로 자동 타입변환이 안됨.
        : 명시적인 타입변환이 요구되나 오류의 가능성이 높음.
         */
    }
}
