package Intermediate_Terminal_Operation;

import java.util.List;
import java.util.ArrayList;

public class Map {

	public static void main(String[] args) {
		
	List<Integer>list = new ArrayList<Integer>();
	
	list.add(123);
	list.add(456);
	list.add(789);
	list.add(11);
	list.add(900);
	list.add(13);
	
	list.stream()
	.map((i)->("A"+i))
	.filter((i)->{return i.length()>3;})
	.forEach((i)->{System.out.println(i);});
	}
}
