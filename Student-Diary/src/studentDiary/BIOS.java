package studentDiary;

import java.util.Scanner;

public class BIOS {
    Student s;
    boolean member;
    String team;
    String url;
    String field;
    
    Scanner sc = new Scanner(System.in);
    
    BIOS(){
        member = false;
    }
    
    public void addDetail(){
        System.out.println("Enter team, project link and field");
        member = true;
        team = sc.next();
        url = sc.next();
        field = sc.next();
    }
    
    public void addStudent(Student s){
        this.s = s;
    }
    
    public String toString(){
        return "Active member: " + member + "\nProject url: " + url + "\nField of Expertise: " + field + "\n";
    }
    
    public void print(){
        System.out.println(this.toString());
    }
    
}
