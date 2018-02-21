/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaloiane;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class aula15 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please entrer with a week day (1-7)");
        int weekday = scan.nextInt();
        
        if(weekday == 1){
            System.out.println("Domingo");
        }else if (weekday == 2){
            System.out.println("Monday");
        } else if (weekday == 3){
            System.out.println("tuesday");
        }else if (weekday == 4){
            System.out.println("Wednesday");
        }else if (weekday == 5){
            System.out.println("Thursday");
        }else if (weekday == 6){
            System.out.println("Friday");
        }else if (weekday == 7){
            System.out.println("Saturday");    
        }else{
            System.out.println("It`s not a weekday");
        }    
        
        switch(weekday){
            case 1: System.out.println("Sunday"); break;
            case 2: System.out.println("Monday"); break;
            case 3: System.out.println("Tuesday"); break;
            case 4: System.out.println("Wednsday"); break;
            case 5: System.out.println("Thursday"); break;
            case 6: System.out.println("Friday"); break;
            case 7: System.out.println("Saturday"); break;
            default: System.out.println("It`s not a valid week day");
        }
    }
    
}
