package nameandaddress;

import java.util.Scanner;
import javax.swing.JOptionPane;  // Needed for JOptionPane

/**
 *@Mo Rahman
 * 3/16/2016 18:50
 */
public class NameAndAddress 

{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    
    {
        // TODO code application logic here
        
        String FirstName, LastName, MiddleName,
                StreetAndStreetNumber,City,State, ZipCode;
        
        JOptionPane.showMessageDialog(null,"This program will store and display your name and address.");
        
            FirstName = JOptionPane.showInputDialog("What is your first name? ");
            
            LastName = JOptionPane.showInputDialog("What is your last name? ");
            
            MiddleName = JOptionPane.showInputDialog("What is your middle name? (if you have one) ");
            
            StreetAndStreetNumber = JOptionPane.showInputDialog("What is your address's street number and street?");
            
            City = JOptionPane.showInputDialog("What is your address's city?");
            
            State = JOptionPane.showInputDialog("What is your state?");
          
            ZipCode = JOptionPane.showInputDialog("What is your US Postal Zipcode?");
            
            JOptionPane.showMessageDialog(null,"Greetings " + FirstName +" "+ MiddleName +" "+ LastName +"\nIt is nice to meet you!");
            
            JOptionPane.showMessageDialog(null,"Your address is: \n" + StreetAndStreetNumber +"\n"+ City +"\n"+State+ZipCode);
            
            System.out.println(FirstName);
        
    }
    
}
