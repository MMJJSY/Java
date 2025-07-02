package a9_inheritance;
import a9_inheritance.Album;
/*
학생의 정보와 성적을 관리하는 Student 클래스를 설계하세요.
요구사항:
 학번 (studentId) - 문자열
 이름 (name) - 문자열
 학년 (grade) - 정수

 다음 메소드들을 구현하세요:
 생성자(기본생성자, 모든 필드를 매개변수로 가지는 생성자)
 각 필드의 getter/setter 메소드
 */



class Student {

    private String studentID;
    private String name;
    private int grade;

    public Student() {
    }

    public Student(String studentID, String name, int grade) {
        this.studentID = studentID;
        this.name = name;
        this.grade = grade;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "student{" +
                "studentID='" + studentID + '\'' +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}





public class Example1 {
    public static void main(String[] args) {
        Student s1 = new Student("victory0219","Victory",2);
        //s1.grade = 2; // 오류 grade가 private 이므로 참조불가
        s1.setGrade(3);
        System.out.println(s1); // student{studentID='victory0219', name='Victory', grade=3}

        Album a1 = new Album("ㅇ",2,'d');


    }


}
