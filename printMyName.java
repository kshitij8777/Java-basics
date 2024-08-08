package java_basics;

import java.util.*;

public class printMyName {
    public  static void printMyname(String name){
        System.out.println(name);
        return;
    }

    public static void main(String[]args){
        Scanner sc =new Scanner(System.in) ;
        System.out.println("enter your name");
        String name=sc.next();

      
      printMyname(name);
    

    }

    
}
