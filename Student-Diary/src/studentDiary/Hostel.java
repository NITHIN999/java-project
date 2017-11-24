package studentDiary;

import java.io.Serializable;
import java.util.Scanner;

public class Hostel implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	String hostelName;
    int roomNo;

	private Scanner s;
    public void addRecords(){
        s = new Scanner(System.in);

        System.out.println("Enter hostel name and room no");
        hostelName = s.nextLine();
        roomNo = s.nextInt();
    }
    
    public void setHostel(String h){
        hostelName = h;
    }
    
    public void setRoomNo(int r){
        roomNo = r;
    }
    
    public String toString(){
        return "Hostel Name: " + hostelName + "\nRoom no: " + roomNo + "\n";
    }
    
    public void print(){
        System.out.println(this.toString());
    }
}

