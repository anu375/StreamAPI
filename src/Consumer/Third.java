package Consumer;

import java.util.function.Consumer;

public class Third {

	public static void main(String[] args) {
	
		Consumer<String>cons1=(s)->{System.out.println(s.toUpperCase());};
		Consumer<String>cons2=(s)->{System.out.println(s.toLowerCase());};
		
		Consumer<String>cons3 = cons1.andThen(cons2);
		cons3.accept("Anushka Jadhav");
	}
}
