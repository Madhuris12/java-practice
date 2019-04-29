package java1;
import java.util.*;

public class Match {
    public static void main(String[] args){
        int target=50;
        Scanner scan=new Scanner(System.in);
        while(true)
        {
            System.out.println("enter the number");
            int n=scan.nextInt();
            if(n>target){
                System.out.println("Number is greater");
            }
            else if(n<target){
                System.out.println("number is lesser");
            }
            else{
                System.out.println("number is matched");
                break;
            }
        }
    }
}
