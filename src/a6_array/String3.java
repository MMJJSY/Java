package a6_array;

import java.util.Arrays;

public class String3 {
    public static void main(String[] args) {
        // 5. 문자열 수정
        // 대소문자 변경
        String str1 = "Java Study";
        System.out.println(str1.toLowerCase()); // java study
        System.out.println(str1.toUpperCase()); // JAVA STUDY
        // 문자열 교체 replace
        System.out.println(str1.replace("Study","공부")); // Java 공부
        // 예)010-1111-2222 를 010 1111 2222로 바꿀때 사용

        // substring 중요!!
        System.out.println(str1.substring(0,5)); // Java (0이상 5미만)
        String text = "2024-10-28";
        String year = text.substring(0,4);
        String month =text.substring(5,7);
        String day = text.substring(8); // 두번째 매개변수 없으면 끝까지
        System.out.println(year); // 2024
        System.out.println(month); // 10
        System.out.println(day); // 28
        String filename ="document.pdf";
        String extention = filename.substring(filename.indexOf('.')+1);
        System.out.println(extention); //pdf

        // split
        // 예제설명 : sample 안의 /, -,  , 를 기준으로 나눠서 배열에 담는 방법
        // [abc, def, ghi, jkl]
        String sample = "abc/def-ghi jkl";
        String[] strarray = sample.split(" |-|/" );
        System.out.println(Arrays.toString(strarray)); // [abc, def, ghi, jkl]
        System.out.println();
        // 정규표현식 (regex = regular expression)
        // 특정패턴을 가진 문자열을 찾거나 조작하기 위한 문자열
        // 주로 문자열 검색, 추출, 치환과 같은 작업에 사용됨
        // 정규표현식을 통해 패턴을 효율적으로 찾고 원하는 부분을 추출 변경 가능함.

        // 이메일주소를 검증하는 정규표현식More actions
        // ^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}$
        String email1 = "text@example.com";
        boolean isValid = email1.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}$");
        System.out.println(isValid); // true
        String email2 = "textsdfkjdsak";
        isValid = email2.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}$");
        System.out.println(isValid); // false
        System.out.println();

        // 한국휴대폰 유효성검사
        // ^01([0|1|6|7|8|9])-\\d{3,4}-\\d{4}$
        // 숫자로만 이루어진 문자열 검사
        // ^\\d+$
        // 알파벳 대소문자 및 숫자로만 이루어진 ID (6~12자리)
        // ^[a-zA-Z0-9]{6,12}$
        // 날짜 형식 검사 (YYYY-MM-DD)
        // ^\\d{4}-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|3[01])$

        // <중요> 유저로부터 위와 같은 정보를 입력받을 때 유효성 검사가 필요함
        // 이때 if~else로 코드를 구현하면 지나치게 복잡하므로
        // 간단하게 정규표현식을 이용하자!!!!
        // 정규표현식은 https://regexr.com/에서 생성 가능 (또는 GPT 이용)

        // trim 공백제거 (단어의 앞뒤에 있는 공백)
        // 단어 안의 공백은 제거되지 않음
        String msg = "    abc    ";
        System.out.println(msg.trim()); // abc
        System.out.println();

        // 6. 문자열의 내용 비교 <중요!!>
        String str2 = new String("Java");
        String str3 = new String("Java");
        String str4 = new String("java");
        System.out.println(str2 == str3); // false
        System.out.println(str3 == str4); // false
        System.out.println(str2.equals(str3)); // true
        System.out.println(str3.equals(str4)); // false
        System.out.println(str3.equalsIgnoreCase(str4)); // true

        String str11 = "내 이름은 [홍길동]입니다. 나이는 [15]살 입니다.";
        String name;
        int age;
        int index;
        int firstname = str11.indexOf("[")+1 ;
        int lastname = str11.indexOf("]");
        name = str11.substring(firstname,lastname);

        int firstage = str11.lastIndexOf("[") + 1;
        int lastage = str11.lastIndexOf("]");
        age = Integer.parseInt(str11.substring(firstage,lastage));




        System.out.println(name);
        System.out.println(age);



    }
}
