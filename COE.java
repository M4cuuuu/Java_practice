import java.util.Scanner;

import package1.Course;
import package1.student;
 

 public class COE {

    
public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Course[] course = new Course[8];
        student student1 = new student();


        System.out.println("Please input the first name: ");
        student1.first_name = scanner.nextLine();
        System.out.println("Please input the last name: ");
        student1.last_name = scanner.nextLine();
       
        String school = "Catanduanes State University";
        String school_address = "Virac, Catanduanes";
        String coe = "CERTIFICATE OF ENROLMENT";
        String sy = "2019-2020";
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t\t\t\t\t\t\t" + school);
        System.out.println("\t\t\t\t\t\t\t\t\t\t      " + school_address );
        System.out.println("\t\t\t\t\t\t\t\t\t\t  " + coe);
        System.out.println("\t\t\t\t\t\t\t\t\t\t  " + sy);
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        System.out.printf("Student Name: %s %s \n",student1.first_name,student1.last_name);

        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                course[0] = new Course("Computer Programming 2", "CC103", 4);
                course[1] = new Course("Fundamentals of Information System", "IS211", 3);
                course[2] = new Course("Organization and Management Concept", "IS212", 3);
                course[3] = new Course("Art Appreciation", "GEC6", 2);
                course[4] = new Course("Science Technology and Society", "GEC7", 3);
                course[5] = new Course("Reading Visual Art", "GEC8", 2);
                course[6] = new Course("Self Defense", "PE2", 3);
                course[7] = new Course("National Service Training Program 2", "NSTP2", 3);

    
    
        
   if(student1.block == "a" || student1.block == "A") {
        

    } else if (student1.block == "b" || student1.block == "B") {


    }
    
    
                // Print course names and codes

                for (int i = 0; i < course.length; ++i) {
                    System.out.println(course[i].courseCode+ "\t\t\t\t"+course[i].courseName);
                }

                





    }

    
    
  }
     

