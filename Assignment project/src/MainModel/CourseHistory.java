/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MainModel;

import java.util.ArrayList;
import MainModel.ProfessorHistory;
/**
 *
 * @author dipenpatel
 */

public class CourseHistory {
    private ArrayList<Course> CourseHistory;
    
    public CourseHistory(){
        this.CourseHistory = new ArrayList<Course>();
    } 

    public ArrayList<Course> getCourseHistory() {
        return CourseHistory;
    }

    public void setCourseHistory(ArrayList<Course> CourseHistory) {
        this.CourseHistory = CourseHistory;
    }
    
    public Course createCourse(Course Course){
        //Course c = new Course();
        CourseHistory.add(Course);
        return Course;
    }
   
    public Course searchCourse(String term,String fullname){
        for(Course course:CourseHistory){
            if(course.getTerm().equals(term) && course.getProfessor().equals(fullname)){
                return course;
            }
        }
        return null;
    }

}
