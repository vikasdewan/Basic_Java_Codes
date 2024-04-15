//STATIC KEYWORD. 

class Student { 
    String name;
    static String school ;//as school name for all the student is same so we use static


}

public class OOPS5 {
    
    public static void main(String[] args) {
        Student.school = "abc";
        Student student1 = new Student();
        student1.name = "vikas dewangan";
        System.out.println(student1.name);
    
    }
}
