package testquestion;

public class TestQuestion3 {
    public static void main(String[] args) {
       int a =5;
       int b = a++;
        System.out.println(a); //6
        System.out.println(b); //6
        System.out.println(++a); //7
        System.out.println(b++); //5
        System.out.println(a++ + --b); //12
        System.out.println(a); // 8


        System.out.println(Integer.toBinaryString(-7));
        // 1111 1001 = -7
        // 1111 1110 = -2
    }
}
