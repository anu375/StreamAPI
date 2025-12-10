package Method_Reference;

import java.util.function.Supplier;
public class Instance_1
{

	public static void main(String[] args) 
	{
		String str = "abcd";
		Supplier<Integer> getre = str::length;
		System.out.println(getre.get());
		
		System.out.println("****************");
		
		Instance1 instance = new Instance1();
		
		Icon<String,Integer[],Double> icon = instance::demore;
		
		Integer[] i3 = icon.add("Hiiiiiiiii", 777.77d);
		System.out.println(i3[0]);
		System.out.println("***********************");
		System.out.println(i3[1]);
	}

}

@FunctionalInterface
interface Icon<T,R,U>
{
	R add(T t1, U u1);
}

class Instance1
{
	public Integer[] demore(String s,Double d)
	{
		int i1 = s.length();
		int i2 = d.intValue();
		return new Integer[] {Integer.valueOf(i1),Integer.valueOf(i2)};
	}
}