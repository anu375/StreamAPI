package Function;

import java.util.function.Function;

public class First {

	public static void main(String[] args) {
		
		Function<Integer,Integer>fun1=(i)->{return i*i;};
		
		System.out.println("Square : "+fun1.apply(12));
		
		Function<String,String>fun2=(s)->{return s.toUpperCase();};
		System.out.println("UpperCase : "+fun2.apply("anushka"));
		
		Function<String,String>fun3=(s)->{return s.toLowerCase();};
		System.out.println(fun3.apply("LowerCase : "+"JADHAV"));
	}
}
