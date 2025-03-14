
import java.util.Scanner;


public class GreatestCommonDivisor {
 
    public static void main(String[] args) {
         
        Scanner input = new Scanner (System.in);
        
        System.out.println("Please Enter Number1");
        int n1 = input.nextInt();
        System.out.println("Please Enter Number2 ");
        int n2 = input.nextInt();
        
        int GCD = 1 ; 
        for (int i = 1 ;i <= n1 && i <= n2 ;  i++) {
            
            if(n1 % i == 0 && n2 % i == 0){
                GCD = i ;
            }
            
        }
        System.out.println("The Greatest Common Divisor is :" + GCD);
    }
    
}
