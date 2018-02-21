
package javaloiane;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class aula14 {
    
    public static void main(String[] args){
     
        Scanner scan = new Scanner(System.in);
        
        System.out.println("What is your age? ");
        int age = scan.nextInt();
        
        if(age >= 18){
            System.out.println("You are over age");
        }else{
            System.out.println("You are abouve age");
        }
        
          System.out.println("Enter with a value: ");
            double value = scan.nextDouble();
            
            if(value <=10){
                System.out.println("It`s cheap buy it");
            }else if (value > 10 && value <15){
                System.out.println("Please ask for discount");
            }else if (value >=15 && value <17){
                System.out.println("should looking for something with better price");
            }else{
                System.out.println("very expensive");
            }
    }
    
    
  
    
}
