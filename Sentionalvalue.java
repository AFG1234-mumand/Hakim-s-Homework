
import java.util.Scanner;

 
public class Sentionalvalue {
 
    public static void main(String[] args) {
      
        int sum = 0 ;
        while (true){
            System.out.println("enter a number");
            Scanner input = new Scanner (System.in);
            int value = input.nextInt();
            sum = sum + value ;
            if (value == 0){
                break ;
            }
        }
        System.out.println("the sum value is :" + sum);
    }
    
}
