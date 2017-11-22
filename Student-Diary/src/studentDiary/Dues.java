package studentDiary;

import java.io.Serializable;

import java.util.Scanner;
public class Dues implements Serializable {
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	int fine;
    String remark;
    
    Scanner s = new Scanner(System.in);

    public Dues() {
        fine = 0;
        remark = "";
    }

    public void setFine(int fine) {
        this.fine = fine;
    } 
    
    public int getFine() {
        return fine;
    }

    public void addDues(){
        System.out.println("Enter fine amount in rupees");
        fine = s.nextInt();
        System.out.println("Enter remarks");
        remark = s.next();
    }
    public  String toString(){
        return '\n' + "Fine:" + fine + "\nRemarks:" + remark;
    }
}
