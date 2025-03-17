package com.mycompany.schoolmanagementsystem;
/**
 *
 * @author supan
 */
import java.util.ArrayList;
import java.util.List;
class Teacher{
    private String name;
    private String subject;
    
    public Teacher(String name, String subject){
        this.name = name;
        this.subject = subject;
    }
    
    public void displayTeacherInfo(){
        System.out.println("Teacher's Name: "+name);
        System.out.println("Teacher's Subject: "+subject);
    }
}

class Classroom{
    private String className;
    private Teacher teacher;
    
    public Classroom(String className, Teacher teacher){
        this.className = className;
        this.teacher = teacher;
    }
    public void displayClassroomInfo(){
        System.out.println("Classroom: "+className);
        teacher.displayTeacherInfo();
    }
}

class School{
    private String schoolName;
    private List<Classroom> classrooms;
    
    public School(){
        classrooms = new ArrayList<>();
    }
    public void setSchoolName(String name){
        this.schoolName = name;
    }
    public void displaySchoolName(){
        System.out.println("School Name: "+schoolName);
    }
    
    public void addClassroom(Classroom classroom){
        classrooms.add(classroom);
    }
    
    public void displayAllClassrooms(){
        for(Classroom classroom : classrooms){
            classroom.displayClassroomInfo();
        }
    }
}

public class SchoolManagementSystem {

    public static void main(String[] args) {
        
        //Create Teachers
        Teacher teacher1 = new Teacher("Mr. Sagar", "English");
        Teacher teacher2 = new Teacher("Mr. Pranto", "Mathematics");
        
        //Create Classrooms and assign Teachers
        Classroom class1 = new Classroom("65_D", teacher1);
        Classroom class2 = new Classroom("65_M", teacher2);
        
        //Create School and set name
        School school = new School();
        school.setSchoolName("Downtown Legends Academy");
        
        //Add classrooms to school
        school.addClassroom(class1);
        school.addClassroom(class2);
        
        //Display INFO
        school.displaySchoolName();
        System.out.println("\nClassrooms and Teachers: ");
        school.displayAllClassrooms();
    }
}
