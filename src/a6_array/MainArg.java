package a6_array;

import java.util.Arrays;

public class MainArg {
    public static void main(String[] args) {
        // 메인 메서드의 매개변수를 활용하는 방법
        // (인텔리제이) 오른쪽 위의 ... 버튼 클릭
        // Run with parameeters 클릭
        // program arguments 창에 매개변수를 차레로 입력하고
        // 예시) hello 100 true 3.14
        // Run 버튼 클릭
        System.out.println(args.length); // 4
        System.out.println(args[0]); // hello
        System.out.println(args[1]); // 100
        System.out.println(args[2]); // true
        System.out.println(args[3]);// 3.14
        System.out.println(Arrays.toString(args));

          method(100); // 100은 파라미터
    }
    public static void method(int x) { //int x는 arg

    }
}
