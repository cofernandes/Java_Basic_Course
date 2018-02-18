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
public class aula12 {

 
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Type your full name:");
        String fullName = scan.nextLine();
        System.out.println("Your full name is: " + fullName);
        
        System.out.println("Type your first name:");
        String firstName = scan.next();
        System.out.println("Your first name is:  " + firstName);
        
        System.out.println("Type your age");
        int age = scan.nextInt();
        System.out.println("Your age is: " + age);
    }
    
}
