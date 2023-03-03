/*
 * Activity 4.9.7
 */ 
public class Student 
{ 
  private String name = "";  
  private String id;
  private int year;

  // Constructor 
  Student(String inputName, String id, int year) 
  { 
    name = inputName;
    this.id = id;
    this.year = year;
  } 

  public String toString(){
    return name + " " + id + " " + year;
  }

  public boolean equals(Student compare){
    if(this.id.equals(compare.id)){
        return true;
    } else {
        return false;
    }
  }

} 