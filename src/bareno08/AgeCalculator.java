
package bareno08;

import java.util.Scanner;

public class AgeCalculator {
    
    public void getAge(){
        
        Scanner input = new Scanner(System.in); 
                
        String fname;
        int byear;
        
        System.out.print("Enter your name: ");
        fname = input.nextLine();
        System.out.print("Enter Birthyear: ");
        byear = input.nextInt();
         
        System.out.print("Hello\t"+fname+"\nYour Age is "+(2024-byear));
        
            
    }
    
}
