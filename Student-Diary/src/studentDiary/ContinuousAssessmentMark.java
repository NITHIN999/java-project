package studentDiary;

import java.io.Serializable;
import java.util.Scanner;

public class ContinuousAssessmentMark implements Serializable {
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	Scanner s = new Scanner(System.in);

	int mark;
	
    public ContinuousAssessmentMark() {
        mark = 0;
    }
    
    public int getMark() {
        return mark;
    }
    
    public void addMark() {
        System.out.println("Enter continuous assessment marks");
        this.mark = s.nextInt();
    }

    public String toString() {
        return "Continuous Assessment Mark:" + this.mark + '\n';
    }
    
}
