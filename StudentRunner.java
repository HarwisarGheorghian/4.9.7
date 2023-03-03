/*
 * Activity 4.9.7
 */ 
public class StudentRunner
{ 
  public static void main(String args[]) 
  { 
    Student s = new Student("TestName", "43241", 2014); 
    Student t = new Student("Testname", "43241", 2005);
    Student r = new Student("New Name", "432145", 2850);

    // Below two statements are equivalent 
    System.out.println(s.equals(t)); 
    System.out.println(s.equals(r)); 
  } 
} 