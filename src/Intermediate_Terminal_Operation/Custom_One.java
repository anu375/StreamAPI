package Intermediate_Terminal_Operation;

import java.util.List;
import java.util.ArrayList;
import java.util.function.Consumer;

public class Custom_One {

	public static void main(String[] args) {
		
		List<Integer>list1 = new ArrayList<Integer>();
		
		list1.add(10);
		list1.add(20);
		
		List<Integer>list2 = new ArrayList<Integer>();
		
		list2.add(30);
		list2.add(40);
		
		List<Integer>list3 = new ArrayList<Integer>();
		
		list3.add(50);
		list3.add(60);
		
		List<List<Integer>> list4 = new ArrayList<List<Integer>>();
		
		list4.add(list3);
		list4.add(list2);
		list4.add(list1);
		
		list4.stream().forEach(new Two_D_List());
	}
}

class Two_D_List implements Consumer<List<Integer>>
{
	public void accept(List<Integer> t) {
		t.stream().forEach(new One_d_List());
		System.out.println("********************");
	}
}

class One_d_List implements Consumer<Integer>
{
	public void accept(Integer t) {
		System.out.println(t*2);
	}
}