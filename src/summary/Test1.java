/*
두줄 주석
 */

package summary;

public class Test1 {
    public static void main(String[] args) {
        //1줄 주석
        System.out.println("콘솔 화면 출력");
        byte a = 1;
        byte b = 2;
        int c = a+b;
        //byte value1 = a+b;
        int value2 = a+b;
        double value3 =a+b;
        System.out.println(value2);
        System.out.println(value3);
        System.out.println(3+5+"방가"+4+2);

        short a1 = 130;

        System.out.println((int)5.6+3.5);
        System.out.println((int)5.6+(int)3.5);
        System.out.println((int)(5.6 +3.5));
        System.out.println(7/4);
        System.out.println((double)3 /2 );
        System.out.println((double) (3/2));

        int d = 5;
        int f = d++;
        System.out.println(d);
        System.out.println(f);
        System.out.println(++d);
        System.out.println(++f);
        System.out.println(d++ + --f);
        System.out.println(d + f);





    }
}
