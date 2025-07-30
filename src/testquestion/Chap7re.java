package testquestion;

public class Chap7re {

    int m = 3;
    int n = 5;
    void abc(int m, int n) {
        m= this.m;
        n=n;
        System.out.println(m);
        System.out.println(n);
    }


        public static void main(String[] args) {

        Chap7re re = new Chap7re();
        re.abc(7,8);
            System.out.println(re.m);
            System.out.println(re.n);

            // 3 8 3 5



    }



 }




