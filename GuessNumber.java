
import java.util.Scanner;

 
public class GuessNumber {
 
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
       int rand1 = (int)(Math.random() * 100);
       int rand2 = (int)(Math.random() * 100);
       
      int sum = rand1 + rand2 ; 
      
        System.out.println("Random1 :" + rand1);
        System.out.println("Random2 :" + rand2);
        System.out.println("what is the Result of : " +rand1 +" + "+ rand2 +  " = " ); 
        int ans = input.nextInt();
        
        while (ans != sum){
            System.out.println("your answer is wrong please try again");
            ans = input.nextInt();
      
            
            
        }
       if (ans == sum){
           System.out.println("your answer is correct");
           
       }
    }
    
}
