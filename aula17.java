
package javaloiane;


public class aula17 {

    
    public static void main(String[] args) {
        
        
        for(int i=0; i < 5; i++){
            System.out.println("The value of i " + i);
        }
        
        for(int i=5; i >= 0; i--){
            System.out.println("The value of i " + i);
    }
        
        for(int i=0, j=10; i<j; i++, j--){
            System.out.println("i = " + i + "j = " + j);
        }
        
        int count = 0;
        for( ; count < 10; ){
            System.out.println("The value of count " + count);
            count += 2;
        }
        
        for(int cont =0; cont <10; cont +=2){
            System.out.println("Value of cont " + cont);
        }
        
        int sum = 0;
        for(int i=1; i<5; sum += i++);
        System.out.println("The value of the sum is " + sum);
    
}
}
