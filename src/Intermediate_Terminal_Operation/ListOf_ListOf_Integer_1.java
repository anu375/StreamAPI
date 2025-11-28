package Intermediate_Terminal_Operation;

import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.function.Consumer;

public class ListOf_ListOf_Integer_1 {

	public static void main(String[] args) {
		
		List<List<Integer>>list = new ArrayList<>();
		
		List<Integer>l1 = new ArrayList<>();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		
		List<Integer>l2 = new ArrayList<>();
		l2.add(4);
		l2.add(5);
		l2.add(6);
		
		List<Integer>l3 = new ArrayList<>();
		l3.add(7);
		l3.add(8);
		l3.add(9);
		
		list.add(l1);
		list.add(l2);
		list.add(l3);
		
		Predicate<Integer>pred = (p)->{return p>5;};
		Consumer<Integer>cons = (p)->{System.out.println("Value : "+p);};
		
		list.stream()
		.map(p->p)
		.forEach(p->{p.stream()
		.filter(pred)
		.forEach(cons);});
		

	}

}
