package a5_class;

public class BankAccount {
    // 필드
    // accountNumber 계좌번호
    // ownerName 예금주 이름
    // balance 잔액
    String accountNumber; // 연산에 쓰지 않기 때문에 보통 String으로 사용
    String ownerName;
    double balance;


    // 생성자

    public BankAccount() {
    }

    public BankAccount(String accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }
    //메서드
    //deposit(입금할 금액) : 돈을 입금하는 메서드 (양수만 가능)
    public double deposit(double a) {
        if (a <= 0) {
            System.out.println("입금액에 오류가 있습니다");
            return -1;
        } else {System.out.println("입금성공");
            this.balance = this.balance + a;
            return this.balance;

        }
    }
    public boolean deposit2(double amount) {
        if (amount <= 0 ) {
            System.out.println("입금액에 오류가 있습니다");
            return false;
        } else {
            this.balance = this.balance + amount;
            return true;
        }
    }

    //withdraw(출금할 금액) : 돈을 출금하는 메서드 (잔액보다 출금액이 많으면 경고표시)
    // 현재잔액 - 매개변수 = 최종잔액
    public double withdraw(double b) {
        if (b <= 0) {
            System.out.println("출금액에 오류가 있습니다.");
            return -1;
        }else if (b > this.balance){
            System.out.println("잔액 부족");
            return -1;
        } else {
            System.out.println("출금 성공");
            this.balance = this.balance - b;
            return this.balance;
            }
        }
        public boolean withdraw2(double amount) {
        if (amount <= 0) {
            System.out.println("출금액에 오류가 있습니다.");
            return false;
        } else if (amount > this.balance) {
            System.out.println("출금액이 잔액보다 큽니다.");
            return false;
        }else {
            this.balance = this.balance - amount;
            return true;
        }

        }

    //toString() : 계좌번호, 예금주이름, 잔액화면출력
    public String toString() {
        return accountNumber + ", " +ownerName +", " + balance;
    }



}
