package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  List<String> list = new ArrayList<>();
		  
		  list.add("Alex");
		  list.add("Bob");
		  list.add("Anna");
		  list.add("Marco");
		  list.add(2, "Eddie");
		  
		  for (String x : list) {
			  System.out.println(x);
		  }

		  System.out.println("-------------------------");
		  System.out.println("Index of bob " + list.indexOf("Bob") );
		 
		  
		  List<String> result = list.stream().filter(x  -> x.charAt(0) == 'A').collect(Collectors.toList());
		  for (String x : result) {
			  System.out.println(x);
		  }
	}

}
