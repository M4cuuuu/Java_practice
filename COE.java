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

}//method for student details this include the information regarding the student object

 
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

  
  

 
}
public class coe {
 
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

 void a() {


}
  
 void b() {


}
       
     public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        coe head = new coe();
        coe blockA = new coe();
        coe blockB = new coe();
       
        
      
      if(block == "a" || "A") {
        head.header();
        blockA.a();//for block a COE scheds details
      } if else (block == "b" || "B"){
        head.header();
        blockB.b();//for block b COE Scheds details
      } else {

        System.out.println("Put valid Block nigga!");

      }

       
      
    }



  }

