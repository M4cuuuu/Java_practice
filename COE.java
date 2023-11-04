import java.util.Scanner;

class student {
  public String firstName;
 public String lastName;
 public int age;
 public String program;
 public char block;
 public int yearLvl;
 
}
public class COE {
 

       
     public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

       

        String school = "Catanduanes State University";
        String schoolAdd = "Virac, Catanduanes";
        String cert = "CERTIFICATE OF ENROLMENT";
        
        // System.out.println("First name:");
        // firstName = scanner.nextLine();

        // System.out.println("Last name:");
        // LastName = scanner.nextLine();

        // System.out.println("Age:");
        // age = scanner.nextInt();
        // scanner.nextLine();

        // System.out.println("Block:");
        // block = scanner.nextLine();

        // System.out.println("Year level:");
        // yearLvl = scanner.nextInt();
        // scanner.nextLine();

        // System.out.println("Program: ");
        // program = scanner.nextLine();


        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("\t\t\t\t\t\t\t\t\t\t"+ school);
        System.out.println("\t\t\t\t\t\t\t\t\t\t      " + schoolAdd);
        System.out.println("\t\t\t\t\t\t\t\t\t\t  "+ cert);
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("Student Name: %s %s \t\t\t\t Program: %s", firstName,lastName,program);
        
    }



}
