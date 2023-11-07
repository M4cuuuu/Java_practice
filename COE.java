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

      public courses(String courseName, String courseCode, int units) {
      
      //arrays of object course initialization
      courses [] course = new courses[8];

                //course object values
                course[0] = new courses("Computer Programming 2", "CC103", 4);
                course[1] = new courses("Fundamentals of Information System", "IS211", 3);
                course[2] = new courses("Organization and Management Concept", "IS212", 3);
                course[3] = new courses("Art Appreciation", "GEC6", 2);
                course[4] = new courses("Science Technology and Society", "GEC7", 3);
                course[5] = new courses("Reading Visual Art", "GEC8", 2);
                course[6] = new courses("Self Defense", "PE2", 3);
                course[7] = new courses("National Service Training Program 2", "NSTP2", 3);
    }
    
         
                public static void printCourseName(courses[] courses) {
                    for (int i = 0; i < courses.length; i++) {
                        System.out.println(courses[i].courseName);
                    }
                }//prints all the course names
                public static void printCourseCode(courses[] courses) {
                    for (int i = 0; i < courses.length; i++) {
                        System.out.println(courses[i].courseCode);
                    }
                }//prints all the course codes
                public static void printCourseUnits(courses[] courses) {
                    for (int i = 0; i < courses.length; i++) {
                        System.out.println(courses[i].units);
                    }
                }//prints all the course units


  public static void header() {

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

    

     header();

  //   student details = new studentD();

  //  if( == "a" || "A") {
  //       head.header();
        
  //     } if else (block == "b" || "B"){
  //       head.header();
        
  //     } else {

  //       System.out.println("Put valid Block nigga!");

  //     }
     
  }
     }
 

 public class COE {
public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
      
      
        

       
       
      
    }



  }
     

