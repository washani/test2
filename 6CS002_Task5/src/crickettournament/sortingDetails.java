package crickettournament;


import crickettournament.cricketSystem;

import java.util.List;
import java.util.Arrays;
import java.util.OptionalInt;

public class sortingDetails {

	public void lowest(){
		List<cricketSystem> table = (List<cricketSystem>) Arrays.asList(
				new cricketSystem(1, "SriLanka", 12,20,10,1002),
				new cricketSystem(2, "India   ", 12,15,5,1500),
				new cricketSystem(3, "Pakistan", 12, 16,12,1200),
				new cricketSystem(4, "America", 12, 20, 15,1000)
				
			//new cricketSystem(1, "SriLanka", 22, 16, 1, 5, 621, 400, 221, 75, 41, 8, 2, 76, 4, 67,67,22,45,32,12),
			//new cricketSystem(2, "India", 22, 16, 1, 5, 621, 400, 221, 75, 41, 8, 2, 76, 4, 67,67,22,45,32,12),
			//new cricketSystem(3, "Pakistan", 22, 16, 1, 5, 621, 400, 221, 75, 41, 8, 2, 76, 4, 67,67,22,45,32,12)
		);
		
		OptionalInt min = table.stream().mapToInt(cricketSystem::getWonTestMatched).min();
	if (min.isPresent()) {
	System.out.printf("Lowest number of points is %d\n", min.getAsInt());
	} else {
	System.out.println("min failed");
	}
	
	System.out.println("Several Teams have 1000 points");
	 table.stream().filter(cricketSystem -> cricketSystem.getTotalTestPoints() == 1000)
	 .forEach(System.out::println);

	 System.out.println();
	 System.out.println("Teams with 1500 points");
	 table.stream().filter(cricketSystem -> cricketSystem.getTotalTestPoints() == 1500)
	 .forEach(System.out::println);
 }
}