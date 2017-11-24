package studentDiary;

import java.io.Serializable;
import java.util.Scanner;

public class EndSemesterMark implements Mark, Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	int mark;
	
    Scanner s = new Scanner(System.in);

    public EndSemesterMark(){
        mark = 0;
    }
    
    public void setMark(int mark){
        this.mark = mark;
    }
    
    public int getMark(){
        return mark;
    }
    
    public void addMark(){
        System.out.println("Enter end semester marks");
        this.mark = s.nextInt();

    }
    
    public void printMark(){
        System.out.println("End Semester marks:" + mark);
    }

    public String toString(){
        return "End Semester marks:" + this.mark + '\n';
    }
    
}
