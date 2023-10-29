/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MainModel;

import java.util.ArrayList;

/**
 *
 * @author dipenpatel
 */
public class StudentDirectory {
    private ArrayList<StudentClass> StudentDirectory;

    public StudentDirectory(){
        this.StudentDirectory=new ArrayList<StudentClass>();
    }
    
    public ArrayList<StudentClass> getStudentList() {
        return StudentDirectory;
    }

    public void setStudentList(ArrayList<StudentClass> StudentList) {
        this.StudentDirectory = StudentList;
    }
    
    public StudentClass addStudent(StudentClass student){
        //StudentClass student=new StudentClass();
        StudentDirectory.add(student);
        return student;
    }
    
    public void deleteStudent(StudentClass studentclass){
        StudentDirectory.remove(studentclass);
    }
    
    public StudentClass searchStudentName(String FirstName){
        for(StudentClass studentclass:StudentDirectory){
            if(studentclass.getFirstName().equals(FirstName)){
                return studentclass;
            }
        }
        return null;
    }
    
    public StudentClass addCourse(StudentClass student){
        StudentDirectory.add(student);
        return student;
    }
    
    public StudentClass searcStudentNameandpassword(String UserName,String Password){
        for(StudentClass studentclass:StudentDirectory){
            if(studentclass.getUserID().equals(UserName) && studentclass.getPassword().equals(Password)){
                return studentclass;
            }
        }
        return null;
    }
//    public Course searchCourse(){
//        
//    }
    
}
