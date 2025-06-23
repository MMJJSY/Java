package a5_calss;

public class Book {
//    필드
//    제목 (title)
//    저자 (author)
//    가격 (price)
    String title;
    String author;
    int price;

//    생성자 : 기본생성자와 모든필드를 포함한 생성자

    public Book() {
    }

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
//    메서드 : 책의 정보를 출력하는 메서드
//    printBookInfo()
//    "제목 by 저자, 가격원" - 해리포터 by J.K.롤링, 14000원
    public String printBookInfo() {
        return title + " by " + author +", " + price + "원";
    }

}
