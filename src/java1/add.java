package java1;

import java.util.Scanner;

public class add {
        public static void main(String[] args)
        {
            int  total = 0,count=0;
            int number;
            System.out.println("Enter the number: ");
            Scanner s = new Scanner(System.in);
            number=s.nextInt();

            System.out.println("Enter the elements: ");
            int n;
            Scanner s1=new Scanner(System.in);

            /*  n=s1.nextInt();*/
            while ((n = s1.nextInt()) !=0)
            {
                total += n;
                count++;


            }
            System.out.println("The total is " + total);

        }
    }

