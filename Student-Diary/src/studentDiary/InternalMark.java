package studentDiary;

import java.io.Serializable;

public class InternalMark implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	float mark;
    public InternalMark(){
        mark = 0;
    }

    public void setMark(FirstPeriodicalMark fpm, SecondPeriodicalMark spm, ContinuousAssessmentMark cam) {

        this.mark = fpm.getMark() * 15 / 50 +  spm.getMark() * 15 / 50 + cam.getMark();
    }
    public float getMark(){
        return mark;
    }
    public String toString(){
        return "\nInternals:" + mark + '\n';
    }
    public void printDetail(){
        System.out.println(toString());
    }
}
