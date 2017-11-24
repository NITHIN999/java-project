package studentDiary;

import java.io.Serializable;
import java.util.Scanner;

public class Event implements Serializable {
    /**
	 * 
	 */
		private static final long serialVersionUID = 1L;

		String eventName;
		String prize;



	Scanner s = new Scanner(System.in);

	public Event(){
		eventName = "";
		prize = "";
	}

	public void addEvent(){
		System.out.println("Enter event name and prize");
		this.eventName = s.next();
		this.prize = s.next();
	}

	public String toString(){
		return eventName + ":  " + prize + "\n";
	}

	public void print(){
		System.out.println(this.toString());
	}

}
