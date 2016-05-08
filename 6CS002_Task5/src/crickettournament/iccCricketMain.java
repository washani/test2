package crickettournament;

import java.util.List;
import java.util.Arrays;

public class iccCricketMain{
public static void main(String[] args){
	List<cricketSystem> table = (List<cricketSystem>) Arrays.asList(
		new cricketSystem(1, "SriLanka", 22, 16, 1, 5, 621, 400, 221, 75, 41, 8, 2, 76, 4, 67,67,22,45,32,12),
		new cricketSystem(2, "India", 22, 16, 1, 5, 621, 400, 221, 75, 41, 8, 2, 76, 4, 67,67,22,45,32,12),
		new cricketSystem(3, "Pakistan", 22, 16, 1, 5, 621, 400, 221, 75, 41, 8, 2, 76, 4, 67,67,22,45,32,12)
	);
	  
	  table.forEach(x -> System.out.println(x));
	 table.stream().forEach(x -> System.out.println(x));
	  System.out.println();
	/*  table.parallelStream().forEach(System.out::println);*/

  }
}