package Consumer;

import java.util.function.Consumer;

public class First {

	public static void main(String[] args) {
		Consumer<String>consumer=(c)->{System.out.println("Hello "+c);};
		Consumer<String>consumer1=(c)->{System.out.println(c.length());};
		consumer.accept("Anushka");
		consumer1.accept("Anushka");
		
		consumer.andThen(consumer1);
			}

}
