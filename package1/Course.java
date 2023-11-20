package package1;

public class Course {
     
     public String courseName;
     public String courseCode;
     public int units;
     public String instructor;

public Course(String courseName, String courseCode, int units, String instructor) {

        this.courseName = courseName;
        this.courseCode = courseCode;
        this.units = units;
        this.instructor = instructor;


}


//test print details array
public static void main(String[] args) {
    // Create an array of courses
    Course[] course = new Course[8];
   


        course[0] = new Course("Computer Programming 2", "CC103", 4, "Dr. Jose Rizal");
        course[1] = new Course("Fundamentals of Information System", "IS211", 3, "Prof Stephen Hawkins");
        course[2] = new Course("Organization and Management Concept", "IS212", 3, "Mr. Carlo Kuku Palad");
        course[3] = new Course("Art Appreciation", "GEC6", 2, "Mr. Vincent Van Gogh");
        course[4] = new Course("Science Technology and Society", "GEC7", 3, "Mr. Elon Musk");
        course[5] = new Course("Reading Visual Art", "GEC8", 2, "Leonardo Da Vinci");
        course[6] = new Course("Self Defense", "PE2", 3, "Mr. Chuck Norris");
        course[7] = new Course("National Service Training Program 2", "NSTP2", 3, "Mr. Rodrigo Roa Du30");





    
                // test Print course names and codes

                for (int i = 0; i < course.length; ++i) {
                    String formattedOutput = String.format("\t%-8s\t%-40s\t%-4d", course[i].courseCode, course[i].courseName, course[i].units);
                    System.out.println(formattedOutput);
                }
         }       
    
        }   

