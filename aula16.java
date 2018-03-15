
package javaloiane;

public class aula16 {

    
    public static void main(String[] args) {
       
        int i = 1;
        int max = 10;
        
        System.out.println("Count until " + max);
        
        while(i < max){
            System.out.println("The value of i: " + i);
            i++;
        }
        
        System.out.println(i);
        
        do{
            i++;
            System.out.println("Value of i " + i);
        }while(i < 15);
        
        System.out.println(i);
    }
    
}
