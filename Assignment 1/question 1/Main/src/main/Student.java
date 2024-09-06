
package main;


public class Student {
    private String studentId;
    private String name;
    private int age;
    private String email;
    private String course;

    // Constructor
    public Student(String studentId, String name, int age, String email, String course) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.email = email;
        this.course = course;
    }

    // Getters and Setters 
    public String getStudentId() {
        return studentId;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public String getEmail() {
        return email;
    }
    
    public String getCourse() {
        return course;
    }

   
}

