package Intermediate_Terminal_Operation;

import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.function.Consumer;

public class Third
{

	public static void main(String[] args)
	{
		
		List<String>list=new ArrayList<String>();
//		Predicate<String>pred=(p)->{return p.startsWith("A");};
//		Consumer<String>cons=(p)->{System.out.println(p+" ");};
		
		list.add("Anushka");
		list.add("Sunita");
		list.add("Amit");
		list.add("Aarohi");
		list.add("Ram");
		
//		list.stream().filter(pred).forEach(cons);
		list.stream().filter((p)->{return p.startsWith("A");})
		.forEach((p)->{System.out.println(p+" ");});
	}

}
