package Intermediate_Terminal_Operation;

import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.function.Consumer;

public class Filter {

	public static void main(String[] args) {
		
		List<Integer>list = new ArrayList<Integer>();
		
		Predicate<Integer>pred = (p)->{return p>=110;};
		Consumer<Integer>cons = (p)->{System.out.println(p*2);};
		
		list.add(11);
		list.add(222);
		list.add(333);
		list.add(444);
		list.add(555);
		list.add(110);
		list.add(11);
		list.add(13);
		
		list.stream().filter(pred).forEach(cons);
		
		System.out.println("*****************************");
		
		list.stream().filter(new GreaterThan400()).forEach(cons);
		
	}
}

class GreaterThan400 implements Predicate<Integer>
{
	public boolean test(Integer i) {
		return i>400;
	}
}