package Method_Reference;

import java.util.Arrays;
import java.util.List;

public class Third 
{
	public static boolean checkBigger(int i)
	{
		return i > 10;
	}
	
	public static void main(String[] args) 
	{
		List<Integer>list = Arrays.asList(12,45,67,54,22,34,1,2,3,4,5);
		System.out.println(list);
		list.forEach(Demo::demo);
		
		System.out.println("***********");
		
		list.stream().filter(Third::checkBigger).forEach(Demo::demo);
	}
	
}
