package testquestion;

import java.util.Arrays;

public class chap5 {
    public static void main(String[] args) {
        double[] a = {1.2, 3.4, 5.6};
        double[] b = a;
        b[0] = 7.8;
        System.out.println(Arrays.toString(a)); // [7.8, 3,4 5,6]
        System.out.println(Arrays.toString(b)); // [7.8, 3,4 5,6]


        int[] c = new int[]{1, 2, 3, 4, 5};

        for (int data : c) {
            System.out.println(data);
        }

        int[][] d = new int[2][];
        d[0] = new int[]{1, 3, 5};
        d[1] = new int[]{7, 9};

        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d[i].length; j++) {
                System.out.println(d[i][j]);
            }

        }


    }
}

