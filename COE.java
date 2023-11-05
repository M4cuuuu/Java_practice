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

//list of courses 
class courses {

  String courseName;
  String courseCode;
  String sched;

    //course object
    public courses(String courseName, String courseCode, String sched) {
      
      //array object initialization
      courses [] course = new courses[7];

      course[0].courseName = "Computer Programming";
      course[0].courseCode = "CC103";
      course[0].sched = "T / F";
      course[1].courseName = "Computer Programming";
      course[1].courseCode = "CC103";
      course[1].sched = "T / F";
      course[2].courseName = "Computer Programming";
      course[2].courseCode = "CC103";
      course[2].sched = "T / F";
      course[3].courseName = "Computer Programming";
      course[3].courseCode = "CC103";
      course[3].sched = "T / F";
      course[4].courseName = "Computer Programming";
      course[4].courseCode = "CC103";
      course[4].sched = "T / F";
      course[5].courseName = "Computer Programming";
      course[5].courseCode = "CC103";
      course[5].sched = "T / F";
      course[6].courseName = "Computer Programming";
      course[6].courseCode = "CC103";
      course[6].sched = "T / F";
    }

  }


public void header() {
  
        String school = "Catanduanes State University";
        String schoolAdd = "Virac, Catanduanes";
        String cert = "CERTIFICATE OF ENROLMENT";


         System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("\t\t\t\t\t\t\t\t\t\t"+ school);
        System.out.println("\t\t\t\t\t\t\t\t\t\t      " + schoolAdd);
        System.out.println("\t\t\t\t\t\t\t\t\t\t  "+ cert);
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
}
  
public void b() {


}

public class COE {
 

       
     public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        
      


       
      
    }



}
