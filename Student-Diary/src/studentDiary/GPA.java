package studentDiary;

import java.io.Serializable;

public class GPA implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	float gpa;
	
    GPA(){
        gpa = 0;
    }
    
    public void setGpa(InternalMark im, EndSemesterMark esm){
        gpa = (im.getMark() + esm.getMark()/2)/10;
    }
    
    public float getGpa(){
        return gpa;
    }
    
    public String toString(){
        return "\nGPA:" + gpa;
    }
    
    public void print(){
        System.out.println(toString());
    }
}

