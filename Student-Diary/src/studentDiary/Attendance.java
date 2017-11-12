package studentDiary;

import java.io.Serializable;
import java.util.Scanner;

public class Attendance implements Serializable {
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    Scanner s = new Scanner(System.in);

	String date;
    boolean att;
    
    public Attendance() {
        date = "";
        att = false;
    }
    
    public void addAttendance() {
        System.out.println("Enter date");
        this.date = s.nextLine();
        this.att = true;
    }
    
    public String toString(){
        return " " + date + "\t" + att + "\n";
    }
    
    public void print(){
        System.out.println(this.toString());
    }
    
}
