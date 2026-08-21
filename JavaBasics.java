import java.util.*;
public class JavaBasics{
    /**
    
     */
    public static void main(String args[]){
        //System.out.println("Write a program that reads a set of integers, and then prints the sum of the even and odd integers.");
        Scanner sc= new Scanner (System.in);
        
        int sumeven=0;
        int sumodd=0;
        int choice;
        
            do{
                System.out.println("Enter your number n:");
                int n=sc.nextInt();
                
                if(n%2==0){
                    sumeven=sumeven + n;

                }
                
                else{
                    sumodd=sumodd +n;
                }

                System.out.println("Press 1 to continue and Press 0 to exit");
                choice = sc.nextInt();

                
            }while(choice==1);

            System.out.println("sum of the even nos is:"+sumeven);
             System.out.println("sum of the odd nos is:"+sumodd);
        }
         

    }
