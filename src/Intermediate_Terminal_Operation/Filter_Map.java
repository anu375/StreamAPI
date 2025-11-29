package Intermediate_Terminal_Operation;

import java.util.List;
import java.util.ArrayList;

public class Filter_Map {

	public static void main(String[] args) {
	
		List<String>list = new ArrayList<String>();
		
		list.add("Latur");
		list.add("Sangamner");
		list.add("Sambhaji-Nagar");
		list.add("Satara");
		list.add("Saswad");
		list.add("Surat");
		list.add("Delhi");
		
		list.stream()
		.filter((i)->{return i.startsWith("Sa");})
		.map(String::toUpperCase)
		.forEach((i)->{System.out.println(i);});
	}
}
