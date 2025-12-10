package Method_Reference;

import java.util.Arrays;
import java.util.List;

public class Logic_1 
{

	public static void main(String[] args) 
	{
		List<String>list = Arrays.asList("abcd","abcde","abcdef");	
		
		list.stream()
		.map(String::length)
		.map(SquareDecider::square)
		.forEach(System.out::println);
	}

}

class SquareDecider
{
	public  static Integer square(Integer i)
	{
		return i*i;
	}
}