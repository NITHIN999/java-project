package studentDiary;

import java.io.Serializable;
import java.util.ArrayList;

public class SGPA implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	float sgpa;
    
    SGPA(){
        sgpa = 0;
    }
    
    public void setSGpa(ArrayList<Course> c){
        for(Course i:c){
            sgpa += i.gpa.getGpa();
        }
        sgpa =  sgpa/c.size();
    }

    public float getSgpa(){
        return sgpa;
    }
    
    public String toString(){
        return "\nSemester GPA:" + sgpa;
    }
    
    public void print(){
        System.out.println(toString());
    }
    
}