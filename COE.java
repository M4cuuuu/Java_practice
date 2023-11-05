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
 

    //course object
    public courses(String courseName, String courseCode, String sched) {
      
      //array object initialization
      courses [] course = new courses[7];

      course[0].courseName = "Computer Programming 2";
      course[0].courseCode = "CC103";
      
      course[1].courseName = "English";
      course[1].courseCode = "ASDF123";
      
      course[2].courseName = "Math";
      course[2].courseCode = "ADW12";
      
      course[3].courseName = "Computer Programming";
      course[3].courseCode = "CC103";
      
      course[4].courseName = "Computer Programming";
      course[4].courseCode = "CC103";
      
      course[5].courseName = "Computer Programming";
      course[5].courseCode = "CC103";
      
      course[6].courseName = "Computer Programming";
      course[6].courseCode = "CC103";
      
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

public void a() {


}
  
public void b() {


}

public class COE {
 

       
     public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        
      
      if(block === a || A) {

        a();
      } if else (block === b || B){

        b();//for block b COE Scheds
      } else {

        System.out.println("Put valid Block nigga!");

      }

       
      
    }



  }
}
