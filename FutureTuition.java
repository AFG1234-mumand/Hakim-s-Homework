
public class FutureTuition {

    public static void main(String[] args) {
        
        int currentTuition = 10000 ;
        int year = 0 ;
        while (true){
            
            if (currentTuition > 20000){
                System.out.println("the tuition fee after " + year + " year will become double");
                break ;
            }
            currentTuition += 700 ;
            year++;
        }
    }
    
}
