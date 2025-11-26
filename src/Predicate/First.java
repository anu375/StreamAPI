package Predicate;

import java.util.function.Predicate;

public class First {

	public static void main(String[] args) {

        Predicate<Integer> predicate = (n) ->{return n % 2 == 0;};

        System.out.println(predicate.test(10));  
        System.out.println(predicate.test(7));
	}

}
