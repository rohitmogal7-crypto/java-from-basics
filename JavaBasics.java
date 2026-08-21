//Write a program to find the factorialof any number entered by the user.
import java.util.*;

public class JavaBasics {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int fact = 1;
        System.out.print("Enter num for factorial:");
        int num = sc.nextInt();
        for(int i=1; i<=num;i++){
            fact*=i;
        }
        System.out.print("factorial for "+ num + " is " + fact);
        
    
    }   
}