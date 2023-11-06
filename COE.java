import java.util.Scanner;

//class declaration
class student {

  String firstName;
  String middleName;
  String lastName;
  int age;
  String program;
  char block;
  int yearLvl;

  //student object
 public student( String firstName, String middleName, String lastName, int age, String program, char block, int yearLvl) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
        this.program = program;
        this.block = block;
        this.yearLvl = yearLvl;
}

void studentD () {

  System.out.printf("Student name: %s %s \n", firstName,lastName);
  System.out.printf("age: %f",age);
  System.out.println();

}//method for student details this include the information regarding the student object



 
}

//list of courses 
class courses {

  //course details
  String courseName;
  String courseCode;
  int units;
 

    //course object
    public courses(String courseName, String courseCode, int units) {
      
      //arrays of object course initialization
      courses [] course = new courses[8];

      //course object and it's values
      course[0].courseName = "Computer Programming 2";
      course[0].courseCode = "CC103";
      course[0].units = 4;
      
      course[1].courseName = "Fundamentals of Information System";
      course[1].courseCode = "IS211";
      course[1].units = 3;
      
      course[2].courseName = "Organization and Management Concept";
      course[2].courseCode = "IS212";
      course[2].units = 3;
      
      course[3].courseName = "Art Appreciation";
      course[3].courseCode = "GEC6";
      course[3].units = 2;
      
      course[4].courseName = "Science Technology and Society";
      course[4].courseCode = "GEC7";
      course[4].units = 3;
      
      course[5].courseName = "Reading Visual Art";
      course[5].courseCode = "GEC8";
      course[5].units = 2;
      
      course[6].courseName = "Self Defense";
      course[6].courseCode = "PE2";
      course[6].units = 3;

      course[7].courseName = "National Service Training Program 2";
      course[7].courseCode = "NSTP2";
      course[7].units = 3;
      
    }

  
  

 
}
public class COE {
 
void header() {

        String school = "Catanduanes State University";
        String schoolAdd = "Virac, Catanduanes";
        String cert = "CERTIFICATE OF ENROLMENT";


         System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("\t\t\t\t\t\t\t\t\t\t"+ school);
        System.out.println("\t\t\t\t\t\t\t\t\t\t      " + schoolAdd);
        System.out.println("\t\t\t\t\t\t\t\t\t\t  "+ cert);
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
}

  void schedGenerator() {

    COE head = new COE();

   if( == "a" || "A") {
        head.header();
        
      } if else (block == "b" || "B"){
        head.header();
        
      } else {

        System.out.println("Put valid Block nigga!");

      }
     

}
  

       
     public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        
        COE scheds = new COE();

        scheds.schedGenerator();
       
        

       
       
      
    }



  }

