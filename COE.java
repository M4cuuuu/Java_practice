import java.util.Scanner;

//class declaration
class student {

  String firstName;
  String lastName;
  int age;
  String program;
  char block;
  int yearLvl;

  //student object
 public student( String firstName, String lastName, int age, String program, char block, int yearLvl) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.program = program;
        this.block = block;
        this.yearLvl = yearLvl;
}

 
}

//list of courses for different block
class courses {

  
}

public class COE {
 

       
     public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String school = "Catanduanes State University";
        String schoolAdd = "Virac, Catanduanes";
        String cert = "CERTIFICATE OF ENROLMENT";
        
      


        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("\t\t\t\t\t\t\t\t\t\t"+ school);
        System.out.println("\t\t\t\t\t\t\t\t\t\t      " + schoolAdd);
        System.out.println("\t\t\t\t\t\t\t\t\t\t  "+ cert);
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
      
    }



}
