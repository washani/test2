package crickettournament;

import java.awt.event.ActionEvent;
import java.util.List;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;

public class iccCricketMain{

	
	
	
public static void main(String[] args){
	List<cricketSystem> table = (List<cricketSystem>) Arrays.asList(
			new cricketSystem(1, "SriLanka", 12,20,10,1222),
			new cricketSystem(2, "India   ", 12,15,5, 1000),
			new cricketSystem(3, "Pakistan", 12, 16,12, 1200),
			new cricketSystem(4, "America", 12, 20, 15, 1500),
			new cricketSystem(5, "Englend", 12, 25, 20, 1700) 
			
		
	);
	  System.out.println("No" +"  "+ "Name"+"         "+ "Players" + "     " + "Matches" + "  " + "wonTestMatched"+" "+"totalTestPoints");
	  //table.forEach(x -> System.out.println(x));
	 table.stream().forEach(xy -> System.out.println(xy));
	  System.out.println();
	  
	  sortingDetails asd = new sortingDetails();
	  asd.lowest();
	

  }
}