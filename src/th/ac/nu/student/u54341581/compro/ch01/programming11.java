
package th.ac.nu.student.u54341581.compro.ch01;
import java.util.Scanner;
public class programming11 {

    public static void main(String[] args) {

    
    Scanner in = new Scanner(System.in);
    System.out.print("the amount due     :");
    Double amountDue = in.nextDouble();
    System.out.print(" the amount receive :");
    Double amountReceive = in.nextDouble();
  
    int pennies = (int)((amountReceive-amountDue)*100);
    int dollars = pennies/100;
    int quarters = pennies /25;          
    int dimes = pennies /10;             
    int nickels = pennies / 5;         
        pennies = pennies /1;
            
        System.out.println("dollars  :" +dollars%100);
        System.out.println("quarters :"+quarters);
        System.out.println("dimes    :" +dimes);
        System.out.println("nickels  :" +nickels);
        System.out.println("pennies  :" +pennies);
           }
}

