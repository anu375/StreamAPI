package Intermediate_Terminal_Operation;

import java.util.List;
import java.util.ArrayList;
import java.util.function.Consumer;

public class Custom2 {

	public static void main(String[] args) {
		
		List<Integer>list_1 = new ArrayList<Integer>();
		list_1.add(10);
		list_1.add(20);
		list_1.add(30);
		
		List<Integer>list_2 = new ArrayList<Integer>();
		list_2.add(40);
		list_2.add(50);
		list_2.add(60);
		
		List<Integer>list_3 = new ArrayList<Integer>();
		list_3.add(70);
		list_3.add(80);
		list_3.add(90);
		
		List<Integer>list_4 = new ArrayList<Integer>();
		list_4.add(100);
		list_4.add(110);
		list_4.add(120);
		
		List<List<Integer>>List_1_D = new ArrayList<>();
		List_1_D.add(list_1);
		List_1_D.add(list_2);
		
		List<List<Integer>>List_1D = new ArrayList<>();
		List_1D.add(list_3);
		List_1D.add(list_4);
		
		List<List<List<Integer>>>List_2_D =new ArrayList<>();
		List_2_D.add(List_1_D);
		List_2_D.add(List_1D);
		
//		List_2_D.stream()
//		.forEach((i)->{i.stream()
//		.forEach((j)->{j.stream()
//		.forEach((k)->{System.out.println(k*3);});});});
//		
		List_2_D.stream()
		.forEach(new Three_D());
	}
}

class Three_D implements Consumer<List<List<Integer>>>
{
	public void accept(List<List<Integer>> t) {
		t.stream().forEach(new Two_d());
		System.out.println("*****************");
	}
}

class Two_d implements Consumer<List<Integer>>
{
	public void accept(List<Integer> t)
	{
		t.stream().forEach(new One_d());
		System.out.println("#####################");
	}
}

class One_d implements Consumer<Integer>
{
	public void accept(Integer t)
	{
		System.out.println(t*3);
	}
}