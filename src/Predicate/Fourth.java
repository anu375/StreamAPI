package Predicate;

import java.util.function.Predicate;

public class Fourth {

	public static void main(String[] args) {
		Predicate<Double>pred1=(d)->{return d%2.0==0;};
		Predicate<Double>pred2=(d)->{return d%2.0!=0;};
		
		Predicate<Double>pred3 = pred1.and(pred2);
		System.out.println("AND : "+pred3.test(21.0));
		
		Predicate<Double>pred4 = pred1.or(pred2);
		System.out.println("OR : "+pred4.test(11.0));
		
		Predicate<Double>pred5=pred1.negate();
		System.out.println("NEGATE : "+pred5.test(12.0));
	}

}
