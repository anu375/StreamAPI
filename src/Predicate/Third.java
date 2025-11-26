package Predicate;

import java.util.function.Predicate;

public class Third {

	public static void main(String[] args) {
	
		Predicate<Integer>pred1=(i)->{return i>20;};
		Predicate<Integer>pred2=(i)->{return i<20;};
		
		Predicate<Integer>pred3=pred1.and(pred2);
		System.out.println("AND : "+pred3.test(21));
		
		Predicate<Integer>pred4=pred1.or(pred2);
		System.out.println("OR : "+pred4.test(12));
		
	}
}
