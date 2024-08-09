package java_basics;
import java.util.Scanner;

public class Factorial {
    public static void calcFact(int a){
        int fact=1;
        for(int i=a ; i>0 ; i--){
            fact = fact*i;
        }
       
            System.out.println(fact);
       
            return ;

       
    }

        public static void main(String [] args){
            Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int a=sc.nextInt();

        calcFact(a);

      sc.close();

    }
    
}
