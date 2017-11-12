package studentDiary;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentDiary implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	ParentDetail pd;
    Academics ac;
    ArrayList<Attendance> att;
    Finance finance;
    Library lib;
    Scholarship scholarship;
    Event ev;
    Hostel h;
    
    Scanner s = new Scanner(System.in);

    public StudentDiary(){
        pd = new ParentDetail();
        ac = new Academics();
        att = new ArrayList<Attendance>();
        finance = new Finance();
        lib = new Library();
        scholarship = new Scholarship();
        ev = new Event();
        h = new Hostel();
    }
    
    public void addStudentDetails() {
        pd.newParentDetail();
    }
    
    public void addAcademics() {
        ac.addCDetail();
        ac.addSem();
    }
    
    public void addFinancialDetails() {
        finance.addFinanceDetail();
    }
    
    public void print() {
        pd.printAll();
        ac.print();
        finance.printFinancials();
        ev.print();
        h.print();
    }
    
}

