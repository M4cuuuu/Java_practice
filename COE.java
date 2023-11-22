import java.util.Scanner;

 class student {
    
    public String full_name;
    public int age;
    public String student_id;
    public String block;
    public String program = "BSIS";
    public String college = "CICT";
    public String address;
    public int year;
    public String birthdate;

}

 class Course {
     
     public String courseName;
     public String courseCode;
     public double units;
     public String instructor;
     public double lab;
     public double tf;

     public Course(String courseName,String courseCode,double units,double lab,double tf,String instructor) {

        this.courseName =courseName;
        this.courseCode = courseCode;
        this.lab = lab;//lab units
        this.tf = tf;//tf units
        this.units = lab + tf;//total units
        this.instructor = instructor;

        
     }
 }

 public class COE {

    void header() {

       
        String school = "Catanduanes State University";
        String school_address = "Virac, Catanduanes";
        String coe = "CERTIFICATE OF ENROLMENT";
        String sy = "2019-2020";

                System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("\t\t\t\t\t\t\t\t" + school);
        System.out.println("\t\t\t\t\t\t\t\t      " + school_address );
        System.out.println("\t\t\t\t\t\t\t\t  " + coe);
        System.out.println("\t\t\t\t\t\t\t\t\t " + sy);
                System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------");


        
    }
    
 
public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
         Course[] course = new Course[8];
        student student1 = new student();
        COE head = new COE();

        //Student Details
        String name = "Name:";
        String age = "Age:";
        String stud_id = "Student ID:";
        String bl = "Block:";
        String year = "Year:";
        String clg = "College:";
        String prog = "Program:";
        String add = "Address:";

        //COE Details
        String cc = "Course Code";
        String cn = "Course Name";
        String u = "Units";
        String tf ="TF";
        String lb = "Lab";
        String s = "Schedule";
        String ins = "Instructor";
        String sec = "Section";

        

        // Course array
        course[0] = new Course("Computer Programming 2", "CC103", 0,2.0,3.0, "Dr. Jose Rizal");
        course[1] = new Course("Fundamentals of Information System", "IS211", 0,2.0,2.0, "Prof. Stephen Hawkins");
        course[2] = new Course("Organization and Management Concept", "IS212", 0,0.0,3.0, "Mr. Carlo \"Kuku\" Palad");
        course[3] = new Course("Art Appreciation", "GEC6", 0, 0.0,3.0, "Mr. Vincent Van Gogh");
        course[4] = new Course("Science Technology and Society", "GEC7", 3.0,0,3.0, "Mr. Elon Musk");
        course[5] = new Course("Reading Visual Art", "GEC8", 0,0.0,2.0,"Mr. Leonardo Da Vinci");
        course[6] = new Course("Self Defense", "PE2", 0,0.0,3.0, "Mr. Chuck Norris");
        course[7] = new Course("National Service Training Program 2", "NSTP2", 0,0.0,3.0, "Mr. Rodrigo Roa Du30");

        String [] timeSchedA = new String[8];
        String [] timeSchedB = new String[8]; // fix this next
        String [] day = {"M/Th","T/F","M/Th","T/F","M/Th","T/F","T/F","Sat"};


        timeSchedA[0] = "7:30am-9:30am";  
        timeSchedA[1] = "9:30am-10:30am";
        timeSchedA[2] = "1:00pm-2:30pm";
        timeSchedA[3] = "10:30am-12:00";
        timeSchedA[4] = "9:30am-10:30am";
        timeSchedA[5] = "1:00pm-2:30pm";
        timeSchedA[6] = "7:30am-9:30am";
        timeSchedA[7] = "7:30am-9:30am";

        
        // extracts the student's details
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
        System.out.printf(" %s\t%-50s %s %s\n",name,student1.full_name,prog , student1.program);
        System.out.printf(" %s \t%-50d %s %s \n",age,student1.age, stud_id,student1.student_id);
        System.out.printf(" %s\t%-50s %s %s\n",bl,student1.block,clg, student1.college);
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------");
    // Prints inforamtion units
    String formattedUnits = String.format("\t%s\t\t%s\t\t       %s  %s  %s \t%s\t\t    %s\t\t%s",cc,cn,u,tf,lb,s,ins,sec);
    String section = student1.program + student1.block;
    System.out.println(formattedUnits);
    
    
                // Prints all the schedules and information regrading courses enrolled
                
                for (int i = 0; i < course.length; ++i) {
                    double unitsWithDecimal = (double) course[i].units; // Convert units to double
                    String formattedOutput = String.format("\t%-8s\t%-35s\t%-10.1f\t%s%s\t%s\t%-70s", course[i].courseCode, course[i].courseName, unitsWithDecimal, timeSchedA[i], day[i], course[i].instructor, section);
                    System.out.println(formattedOutput);
                }
                
                
                
                

                
             System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------");



scanner.close();

    }

    
    
  }
     

