package package1;

public class Course {
     //course details
     public String courseName;
     public String courseCode;
     public int units;

public Course(String courseName, String courseCode, int units) {

        this.courseName = courseName;
        this.courseCode = courseCode;
        this.units = units;


}



public static void main(String[] args) {
    // Create an array of courses
    Course[] course = new Course[8];
   


    course[0] = new Course("Computer Programming 2", "CC103", 4);
    course[1] = new Course("Fundamentals of Information System", "IS211", 3);
    course[2] = new Course("Organization and Management Concept", "IS212", 3);
    course[3] = new Course("Art Appreciation", "GEC6", 2);
    course[4] = new Course("Science Technology and Society", "GEC7", 3);
    course[5] = new Course("Reading Visual Art", "GEC8", 2);
    course[6] = new Course("Self Defense", "PE2", 3);
    course[7] = new Course("National Service Training Program 2", "NSTP2", 3);

    // Print course names
    for (int i = 0; i < course.length; i++) {
        System.out.println(course[i].courseName);
    }
  

         }       
    
        }   
