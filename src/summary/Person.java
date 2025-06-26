package summary;

public class Person {
    String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;  // 왼쪽은 필드, 오른쪽은 매개변수
    }



    public static void main(String[] args) {

        Person a = new Person("SEYONG");
        System.out.println(a.name); // SEYONG



    }
}
