package studentDiary;

import java.io.Serializable;
import java.util.Scanner;

public class Finance implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	Dues library;
    Dues department;
    int fees;
    int cd =5000;
    
    Scanner s = new Scanner(System.in);

    public Finance(){
        library = new Dues();
        department = new Dues();
        fees = 0;
        cd = 0;
    } 
    
    public Finance(int fees, int cd){
        library = new Dues();
        department = new Dues();
        this.fees = fees;
        this.cd = cd;
    }
    
    public void addFinanceDetail(){
        System.out.println("Enter fee amount");
        this.fees = s.nextInt();
    }
    
    public void addLibraryDue(){
        if(library.getFine()==0)
            library.addDues();
        else{
            System.out.println("Enter fine amount");
            int fine = s.nextInt();
            fine += library.getFine();
            library.setFine(fine);

        }
    }
    
    public void addDepartmentDues(){
        if(department.getFine()==0)
            department.addDues();
        else{
            System.out.println("Enter fine amount");
            int fine = s.nextInt();
            fine += department.getFine();
            department.setFine(fine);

        }
    }
    
    public String toString(){
        return "Fee amount:" + fees + "\nCaution Deposit:" + cd + library.toString() + department.toString();
    }
    
    public void printFinancials(){
        System.out.println(this.toString());
    }
    
    public int calculateScholarship(Scholarship s){
        return fees * s.percent / 100;
    }
    

}
