package Method_Reference;

import java.util.Arrays;
import java.util.List;

public class Fourth 
{

	public static void main(String[] args)
	{
		List<String>list = Arrays.asList("neha"," ","nisha","nirav","","nishant","nitin");
		
		list.stream()
		.map(String::toUpperCase)
		.forEach(System.out::println);
	}

}
