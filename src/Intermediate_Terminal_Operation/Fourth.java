package Intermediate_Terminal_Operation;

import java.util.List;
import java.util.LinkedList;
import java.util.function.Predicate;
import java.util.function.Consumer;

public class Fourth 
{

	public static void main(String[] args) 
	{
		
		List<String>list = new LinkedList<String>();
		
//		Predicate<String>pred=(p)->{return true;};
//		Consumer<String>cons=(p)->{System.out.println(p.toUpperCase());};
		
		list.add("Anushka");

//		list.stream().filter(pred).forEach(cons);

		list.stream().filter((p)->{return true;}).
		forEach((p)->{System.out.println(p.toUpperCase());});
	}

}
