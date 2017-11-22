package studentDiary;

import java.io.Serializable;
import java.util.Scanner;

public class PersonalDetail extends Student implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	long phno;
	String address;
	String email;
	
	Scanner sc = new Scanner(System.in);

	public PersonalDetail() {
		super();
		phno = 0;
		address = "";
		email = "";
	}

	
	public void newPersonalDetail() {
	try {	
			this.newStudent();
			System.out.println("Enter student personal details");
			System.out.println("Enter address");
			address = sc.nextLine();
			System.out.println("Enter email");
			email = sc.next();
			String s = "@";
			if(!email.contains(s)) throw new InvalidEmailException();
			System.out.println("Enter phone number of Student");
			phno = sc.nextLong();
			int length=0; 
			long n = phno;
			while(n != 0) {
				n = n/10;
				length++;
			}
			if(length != 10) throw new InvalidPhoneNumberException();
			
	}catch(InvalidPhoneNumberException e) {
		System.out.println(e);
		System.exit(0);
			
	}catch(InvalidEmailException n) {
		System.out.println(n);
		System.exit(0);
	}
	}

	public void printPDetail() {
		System.out.println("Personal Details");
		System.out.println("----------------");
		System.out.println("Phone no:"+ this.phno +"\n" + "Address:"+ this.address + "\n" + "Email:" + this.email);
		
	}


}
