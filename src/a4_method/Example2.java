package a4_method;

public class Example2 {
    public static void main(String[] args) {
        // 주어진 숫자가 양수인지 음수인지 확인하는 메서드
        String str = chekPositiveOrNegative(10);
        System.out.println(str);
        str = chekPositiveOrNegative(-5);
        System.out.println(str);
        str = chekPositiveOrNegative(0);
        System.out.println(str);
    }

    public static String chekPositiveOrNegative(int num) {
        // 매개변수 num이 양수이면 " 양수", 음수이면 "음수", 0이면 "0"을
        // 반환하도록 코드를 작성하세요.
        String result;
        if(num >0) {
            result = "양수";
        } else if ( num < 0) {
            result = "음수";
        } else {
            result = "0";
        }
        return result;

//        if (num > 0) {
//            result = "양수";
//        }else if (num < 0) {
//            result = "음수";
//        }else {
//            result = "0";
//        }
//        return result;



//        if (num > 0) {
//            System.out.println("양수");
//        } else if (num < 0) {
//            System.out.println("음수");
//        } else {
//            System.out.println("0");
//        }
//        return "";

    }



}
