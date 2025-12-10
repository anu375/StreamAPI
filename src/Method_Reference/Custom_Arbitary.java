package Method_Reference;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Custom_Arbitary 
{

	public static void main(String[] args) 
	{
		List<Book> list=Arrays.asList(new Book(1,29.40,"abc"),new Book(2,30.4,"abcd"),
				new Book(3,49.4,"abcde"));
		
		
		list.stream().map(Book::sendre)
		.forEach(System.out::println);
		
		
		Book book1=new Book(12,67.89,"shamchi aai");
		
		Function<String, Integer> fun=book1::gettotal;
		
		System.out.println(fun.apply("hello brother!"));

	}

}

class Book
{
	int id;
	double price;
	String name;
	
	public Book(int id, double price, String name) 
	{
		this.id = id;
		this.price = price;
		this.name = name;
	}
	
	public int gettotal()
	{
		return this.id+(int)price+this.name.length();
		
	}
	
	public  int gettotal(String str)
	{
		return str.length()+1;
	}
	
	public int sendre()
	{
		return 100;
	}
}