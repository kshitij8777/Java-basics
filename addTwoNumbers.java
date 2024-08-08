package java_basics;
import java.util.*;

public class addTwoNumbers {
    public static void addNumber(int a, int b){
        int sum= a+b;
        System.out.println(sum);
        return;

    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number:");
        int a=sc.nextInt();
        System.out.println("enter the second number:");
        int b=sc.nextInt();

        addNumber(a,b);
        

    }
    
}
