package java1;


import java.util.Scanner;

public class Iteration {
    public static void main(String[] args) {
        int i, j, n, s;
        System.out.print("Input number of rows : ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        s = n + 4 - 1;
        for (i = 1; i <= n; i++) {

            for (j = 1; j <= i; j++) {
                System.out.print(i+" ");
                s--;
            }
        }
    }

}
