package studentDiary;

import java.util.Scanner;

public class ContinuousEvaluationMark {
    int mark;
    
    Scanner sc = new Scanner(System.in);

    public ContinuousEvaluationMark() {
        mark = 0;
    }
    
    public ContinuousEvaluationMark(int mark) {
        this.mark = mark;
    }
    
    public void setMark(int mark) {
        this.mark = mark;
    }
    
    public int getMark() {
        return mark;
    }
    
    public void addMark(){
        System.out.println("Enter continuous evaluation marks");
        this.mark = sc.nextInt();
    }
    
    public void printMark(){
        System.out.println("Continuous evaluation marks:" + mark);
    }

    public String toString(){
        return "Continuous Evaluation Mark:" + this.mark + '\n';
    }
    
}
