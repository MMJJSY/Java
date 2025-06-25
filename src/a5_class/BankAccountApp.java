package a5_class;

public class BankAccountApp {
    public static void main(String[] args) {
        BankAccount bankObject = new BankAccount("111-222-333", "steve", 10000);
        BankAccount mybank = new BankAccount("356-1447-2872-83","erune",600000);
        System.out.println(bankObject);
        // 정상 입금
        if (bankObject.deposit2(2000)) {
            System.out.println("입금성공");
            System.out.println(bankObject);
        } else {
            System.out.println("입금실패");
        }
        // 예외 상황
        if (bankObject.deposit2(0)) {
            System.out.println("입성공");
            System.out.println(bankObject);
        } else {
            System.out.println("입금실패");
        }
        // 정상출금
        if (bankObject.withdraw2(3000)) {
            System.out.println("출금 성공");
            System.out.println(bankObject);
        } else {
            System.out.println("출금실패");
        }
        // 예외상황 (잔액 보다 많은 출금)
        if (bankObject.withdraw2(20000)) {
            System.out.println("출금 성공");
            System.out.println(bankObject);
        } else {
            System.out.println("출금실패");
        }

    }
}