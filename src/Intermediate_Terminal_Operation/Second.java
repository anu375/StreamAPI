package Intermediate_Terminal_Operation;

import java.util.List;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Second {

	public static void main(String[] args) {
		
		List<String>list=new ArrayList<String>();
		
		Consumer<String>cons=(s)->{System.out.println(s+"");};
		Predicate<String>pred=(s)->{return s.length()>5;};
		
		list.add("Anushka");
		list.add("Sneha");
		list.add("Madhuri");
		list.add("Madhavi");
		list.add("Sweta");
		
		list.stream().filter(pred).forEach(cons);
	}

}
