package a5_calss;

public class MyClass {
    public static void main(String[] args) {
        // 학생클래스의 객체 생성
        Student steve = new Student("Steve",25);
        Student tom = new Student(); // 기본생성자
        Student sam = new Student("Sam", 29, "대전", "남자", 100,90,80);
        // 객체생성후에 개별적으로 필드를 수정할 수 있음
        tom.setName("tom");
        tom.name = "Tom";
        tom.age = 21;
        System.out.println(tom.name + " " + tom.age);
        System.out.println(steve.name); // Steve
        System.out.println(tom.name); // null : 문자의 0의 개념
        System.out.println(sam.gender); // 남자

        // 성적조회
        double sumScoreSam = sam.sumScore(); // 메서드의 호출
        System.out.println(sumScoreSam); // 270
        double averageScoreSam = sam.averageScore();
        System.out.println(averageScoreSam);
        // 중요!
        // Sam의 성적을 알고 싶으면 Sam의 정보를 담고 있는 객체의 메서드를 호출 해야함

        Book b1 = new Book("해리포터", "J.K.롤링",14000);
        System.out.println(b1.printBookInfo());



    }
}
