package crickettournament;


import crickettournament.cricketSystem;

import java.util.List;
import java.util.Arrays;
import java.util.OptionalInt;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class sortingDetails {

	public void lowest(){
		List<cricketSystem> table = (List<cricketSystem>) Arrays.asList(
				new cricketSystem(1, "SriLanka", 12,20,10,1222),
				new cricketSystem(2, "India   ", 12,15,5, 1000),
				new cricketSystem(3, "Pakistan", 12, 16,12, 1200),
				new cricketSystem(4, "America", 12, 20, 15, 1500),
				new cricketSystem(5, "Englend", 12, 25, 20, 1700)	
		);
	
	// Lowestnumber of the Team	
		
	OptionalInt min = table.stream().mapToInt(cricketSystem::getWonTestMatched).min();
	if (min.isPresent()) {
	System.out.printf("Lowest number of points is %d\n", min.getAsInt());
	} else {
	System.out.println("min failed");
	}
	
	// 1000 total point for test matches and 1500 total points tesms
	
	System.out.println("Several Teams have 1000 points");
	 table.stream().filter(cricketSystem -> cricketSystem.getTotalTestPoints() == 1000)
	 .forEach(System.out::println);

	 System.out.println();
	 System.out.println("Teams with 1500 points");
	 table.stream().filter(cricketSystem -> cricketSystem.getTotalTestPoints() == 1500)
	 .forEach(System.out::println);
	 
	 
     //Print math random
	 
	 Supplier<Double> s = () -> Math.random();
	  System.out.println(s.get());
	  
	  Stream.generate(s).limit(10).forEach(System.out::println);

 }
}