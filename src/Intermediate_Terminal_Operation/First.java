package Intermediate_Terminal_Operation;

import java.util.List;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;


public class First 
{

	public static void main(String[] args) 
	{
		
		List<Integer>numbers=new ArrayList<Integer>();
		
		Consumer<Integer>cons=(i)->{System.out.println(i*2);};
		Predicate<Integer>pred=(i)->{return i>=120;};
		
		numbers.add(123);
		numbers.add(456);
		numbers.add(800);
		numbers.add(111);
		numbers.add(112);
		
		numbers.stream()
		.filter(pred)
		.forEach(cons);
	}

}
