import java.util.Scanner;

import package1.Course;
import package1.student;
 

 public class COE {

    void header() {

       
        String school = "Catanduanes State University";
        String school_address = "Virac, Catanduanes";
        String coe = "CERTIFICATE OF ENROLMENT";
        String sy = "2019-2020";

        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t\t\t\t" + school);
        System.out.println("\t\t\t\t\t\t\t      " + school_address );
        System.out.println("\t\t\t\t\t\t\t  " + coe);
        System.out.println("\t\t\t\t\t\t\t\t " + sy);
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");

        
    }
    
public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
         Course[] course = new Course[8];
        student student1 = new student();
        COE head = new COE();
        //COE Details
        String cc = "Course Code";
        String cn = "Course Name";
        String u = "Units";
        String s = "Schedule";
        String ins = "Instructor";

    

        course[0] = new Course("Computer Programming 2", "CC103", 4, "Dr. Jose Rizal");
        course[1] = new Course("Fundamentals of Information System", "IS211", 3, "Prof. Stephen Hawkins");
        course[2] = new Course("Organization and Management Concept", "IS212", 3, "Mr. Carlo Kuku Palad");
        course[3] = new Course("Art Appreciation", "GEC6", 2, "Mr. Vincent Van Gogh");
        course[4] = new Course("Science Technology and Society", "GEC7", 3, "Mr. Elon Musk");
        course[5] = new Course("Reading Visual Art", "GEC8", 2, "Mr. Leonardo Da Vinci");
        course[6] = new Course("Self Defense", "PE2", 3, "Mr. Chuck Norris");
        course[7] = new Course("National Service Training Program 2", "NSTP2", 3, "Mr. Rodrigo Roa Du30");

        String [] timeSchedA = new String[8];
        String [] timeSchedB = new String[8];
        String [] day = {"M/Th","T/F","M/Th","T/F","M/Th","T/F","T/F","Sat"};


        timeSchedA[0] = "7:30am-9:30am";  
        timeSchedA[1] = "9:30am-10:30am";
        timeSchedA[2] = "1:00pm-2:30pm";
        timeSchedA[3] = "10:30am-12:00";
        timeSchedA[4] = "9:30am-10:30am";
        timeSchedA[5] = "1:00pm-2:30pm";
        timeSchedA[6] = "7:30am-9:30am";
        timeSchedA[7] = "7:30am-9:30am";

        //extracts the student's details
        // System.out.println("Please input the student name: ");
        // student1.full_name = scanner.nextLine();
        // System.out.println("Please input the student age: ");
        // student1.age = scanner.nextInt();
        // scanner.nextLine();
        // System.out.println("Please input the student block: ");
        // student1.block = scanner.nextLine();
        // System.out.println("Please input the student ID: ");
        // student1.student_id = scanner.nextLine();
        
       //header
        head.header();
        System.out.printf("Student Name: %s \t\t\t\t\t\t Program: %s\n",student1.full_name,student1.program);
        System.out.printf("Age: %d \t\t\t\t\t\t\t\t Student ID: %s \n",student1.age,student1.student_id);
        System.out.printf("Block: %s \t\t\t\t\t\t\t College: %s\n",student1.block, student1.college);
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");
    // Prints inforamtion units
    String formattedUnits = String.format("\t%s \t\t%s\t\t\t      %s \t\t%s\t\t    %s",cc,cn,u,s,ins);

    System.out.println(formattedUnits);
    
    
                // Prints all the schedules and information regrading courses enrolled
                
                for (int i = 0; i < course.length; ++i) {
                    String formattedOutput = String.format("\t%-8s\t%-45s\t%-10d %s%s\t\t%s", course[i].courseCode, course[i].courseName, course[i].units,timeSchedA[i],day[i],course[i].instructor);
                    System.out.println(formattedOutput);
                }
                

                
     System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");


scanner.close();

    }

    
    
  }
     

