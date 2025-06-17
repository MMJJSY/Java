package summary;

public class TestQuestion3 {
    public static void main(String[] args) {
       int a =5;
       int b = a++;
        System.out.println(a);
        System.out.println(b);
        System.out.println(++a);
        System.out.println(b++);
        System.out.println(a++ + --b);

        System.out.println(Integer.toBinaryString(-7));
        // 1111 1001 = -7
        // 1111 1110 = -2
    }
}
