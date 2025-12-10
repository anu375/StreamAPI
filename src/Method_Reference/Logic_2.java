package Method_Reference;

import java.util.Arrays;
import java.util.List;

public class Logic_2
{

	public static void main(String[] args) 
	{
		List<String>list = Arrays.asList("a","ab","abc","abcd","abcde");
		
		list.stream()
		.map(String::length)
		.map(Cube::cube)
		.forEach(System.out::println);
	}

}

class Cube
{
	public static int cube(Integer i)
	{
		return i*i*i;
	}
}