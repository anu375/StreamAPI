package Method_Reference;

import java.util.Arrays;
import java.util.List;

public class Fifth 
{

	public static void main(String[] args) 
	{
		
		List<String>list = Arrays.asList("16","25","169","400");
		
		list.stream()
		.map(String::length)
		.map(Math::sqrt)
		.forEach(System.out::println);
		
		list.stream()
		 .map(Double::parseDouble)
		 .map(Math::sqrt)
		 .forEach(System.out::println);
		  
		  
		  
		  StringBuilder sb=new StringBuilder("hello");
		  
		  List<String> list2=Arrays.asList("abc","ced","edked");
		  
		  list2.stream()
		  .map(StringBuilder::new)
		  .map(StringBuilder::reverse)
		  .map(StringBuilder::toString)
		  .map(String::toUpperCase)
		  .map(StringBuilder::new)
		  .map(sb::append)
		  .forEach(System.out::println);
		  
	}

}
