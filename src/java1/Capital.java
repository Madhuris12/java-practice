package java1;

import java.util.Scanner;
import java.lang.String;

public class Capital {
    public static void main(String[] args){
        int i=0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a character");
        String str= s.nextLine();
        char ch=str.charAt(i);


        if(ch>=97 && ch<=122)
            System.out.println("lowercase");

        else if(ch>=65 && ch<=90)
            System.out.println("uppercase");

        else
            System.out.println("special characters");

    }
}
