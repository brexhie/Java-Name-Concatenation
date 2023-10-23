/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nameconcatenate;
import java.util.Scanner;
/**
 *
 * @author brett
 */
public class NameConcatenate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String firstMember, secondMember, thirdMember, fourthMember;
        
        Scanner firstEntry = new Scanner(System.in);
        System.out.println("Enter your first family member's name: ");
        firstMember = firstEntry.nextLine();
        
        Scanner secondEntry = new Scanner(System.in);
        System.out.println("\nEnter your second family member's name: ");
        secondMember = secondEntry.nextLine();
        
        Scanner thirdEntry = new Scanner(System.in);
        System.out.println("\nEnter your third family member's name: ");
        thirdMember = thirdEntry.nextLine();
        
        Scanner fourthEntry = new Scanner(System.in);
        System.out.println("\nEnter your fourth family member's name: ");
        fourthMember = fourthEntry.nextLine();
        
        String concatenatedNames = firstMember + secondMember + thirdMember + fourthMember;
        int length = concatenatedNames.length();
        
        System.out.println("\nThis is their names concatenated together: " + concatenatedNames );
        System.out.println("This is the length of their names together: " + length);
    }
    
}
