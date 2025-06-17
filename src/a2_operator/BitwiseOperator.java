package a2_operator;

public class BitwiseOperator {
    public static void main(String[] args) {
        // 비트연산자
        int data = 13;
        System.out.println(Integer.toBinaryString(data)); // 1101 Integer는 class, toBinaryString은 메서드
        System.out.println(Integer.toOctalString(data)); // 15
        System.out.println(Integer.toHexString(data)); // d
        System.out.println();

        System.out.println(Integer.parseInt("1101" , 2)); // 13
        System.out.println(Integer.parseInt("15" , 8)); // 13
        System.out.println(Integer.parseInt("d" , 16)); // 13
        System.out.println();

        System.out.println(13); //13
        System.out.println(0b1101); // 13 2진수를 표기할때는 0b를 앞에 붙인다
        System.out.println(015); // 13 8진수를 표기할때는 0을 붙인다
        System.out.println(0xd); // 13 16진수는 0x를 붙인다
        System.out.println();

        // &
        // 논리연산자 (&&)와 다르게 & 한개를 사용한다
        // 두개의 비트가 모두 1인 경우에만 결과가 1
        System.out.println(3 & 10); // 2
        //0000 0011 = 3
        //0000 1010 = 10
        // ---------------
        //0000 0010 = 2

    }
}
