
package bareno08;

import java.util.Scanner;

public class Reciept {

    public void getReciept(){
    
 Scanner input = new Scanner (System.in);
 
 String name;
 String lname;
 String prodname;
 int qua;
 int price;
 double cash;
 
   System.out.print("Enter Name: ");
   name = input.nextLine();
   
   System.out.print("Enter Last Name: ");
   lname = input.nextLine();
   
   System.out.print("Product Name: ");
   prodname = input.nextLine();
   
   System.out.println("Quality: ");
   qua = input.nextInt();
   
   System.out.println("Price: ");
   price = input.nextInt();
   
   System.out.println("Cash: ");
   cash = input.nextDouble();
   
   System.out.println("\n|----------------------------------------------------|");
        System.out.println("\n Receipt");
   System.out.println("\n|----------------------------------------------------|");
    
        System.out.println("Name: "+name);
        System.out.println("Last Name "+lname);
        System.out.println("Item "+prodname);
        System.out.println("Quantity: "+qua);
        
  System.out.println("\n|----------------------------------------------------|");
  
        System.out.println("Total Due: "+(qua*price));
        System.out.println("Cash: "+(cash));
        
   System.out.println("\n|----------------------------------------------------|");
        System.out.println("Change: "+(cash-(qua*price)));
   System.out.println("\n|----------------------------------------------------|");
     
   
    }  
}
