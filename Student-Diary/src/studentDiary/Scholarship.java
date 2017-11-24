package studentDiary;

import java.io.Serializable;
import java.util.Scanner;

public class Scholarship implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	int percent;

    Scanner s = new Scanner(System.in);

    public Scholarship(){
        percent = 0;
    }
    public void addPercentage(){
        System.out.println("Enter percentage");
        percent = s.nextInt();
    }

    public void print(){
        System.out.println("Scholarship percent: " + percent);
    }
}
