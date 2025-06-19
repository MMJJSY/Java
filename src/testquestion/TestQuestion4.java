package testquestion;

public class TestQuestion4 {
    public static void main(String[] args) {
        //question1
        int score = 100;
        if (score >= 80 && score < 90) {
            System.out.println("B학점");
        } else if (score >= 90) {
            System.out.println("A학점");
        } else if (score >= 70 && score < 80) {
            System.out.println("C학점");
        } else {
            System.out.println("F학점");
        }
        System.out.println("끝");

        // switch case 문은 범위조건을 구현하기에 적합하지 않음
        // 그래서 점수를 10을 나눠서 앞자리로 구분하는 방법을 사용함.

        //question2
        switch (score / 10) {

            case 10:
            case 9:
                System.out.println("A학점");
                break;
            case 8:
                System.out.println("B학점");
                break;
            case 7:
                System.out.println("C학점");
                break;
            default:
                System.out.println("F학점");

        }
        // qustion3
        for (int i = 0; ; i++) {
            if (i>10) {
                break;
            }
            if (i % 2 == 1) {
                continue;
            }
            System.out.print(i+" ");

        }
        System.out.println("끝");

        //question4 다음과 동일 기능을 수행하는 while 문 작성

//        for (int i = 10; i > 0; i -= 2) {
//            System.out.println(i); // 10 8 6 4 2
//        }

//        int i = 10;
//        while (i > 0) {
//            System.out.println(i);
//            i -= 2;
//        }

        //question5 다음 이중 for문 실행했을 때 'A'는 몇 회 출력 되는지 쓰시오.

        for (int x = 0; x < 5; x++) {
            for (int j = 0; j < 3; j++) {
                if (x == 2) {
                    continue;
                }
                if (j == 1) {
                    break;
                }
                System.out.println("A");
            }
        }
        /* x=0 이고 j가 0일때 j==1이 아니므로 A가 출력
        x  j
        0  0 A
        0  1
        1  0 A
        1  1
        2  0
        2  1
        2  2
        3  0 A
        3  1
        4  0 A
        4  1
        5  끝
        */

        int value2;
        value2 =5;
        System.out.println(value2 |=2);
        //0000 0101
        //0000 0010
        //ㅡㅡㅡㅡㅡㅡㅡ
        //0000 0111 = 7

        //question6
        for (int i=0; i<10; i++) {
            for(int j = 0; j < 5; j++) {
                if (i ==3 && j ==2) {
                    i=999;
                    break;
                }
            }
        }

        // q7 레이블
        exit:
        for (int i=0; i<10; i++) {
            for(int j = 0; j < 5; j++) {
                if (i ==3 && j ==2) {

                    break exit;
                }
            }
        }


        }

    }




