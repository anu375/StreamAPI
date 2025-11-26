package Predicate;

import java.util.function.Predicate;
public class Second {

	public static void main(String[] args) {
	
		Predicate<String>predicate=(s)->{return s.length()>10;};
		
		System.out.println(predicate.test("Anushka"));
		System.out.println(predicate.test("Anushka Jadhav"));
	}
}
