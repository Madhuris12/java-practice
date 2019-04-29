package java1;

import java.util.Scanner;

public class consonents {
    public static void main(String[] args) {
        int i=0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a character");
        char ch = s.next().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println("vowel");
        } else {
            System.out.println("consonent");
        }

    }
}