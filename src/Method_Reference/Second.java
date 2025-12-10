package Method_Reference;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Second 
{

	public static void main(String[] args) 
	{
		Consumer<String>display = Demo :: demo;
		display.accept("HELLO");
		
		Function<String, Integer> fun = Demo :: demo2;
		System.out.println(fun.apply("abcdefghijklmnop,a;,,we;are"));
		
		Supplier<Long> supplier = Demo :: demo3;
		System.out.println(supplier.get());
	}

}

class Demo
{
	public static void demo(String t1)
	{
		System.out.println(t1);
	}
	
	public static void demo(int t1)
	{
		System.out.println("A");
		System.out.println(t1*2);
	}
	
	public static int demo2(String t2)
	{
		System.out.println("From the method reference..");
		return t2.length();
	}
	
	public static long demo3()
	{
		double d = Math.random()*1000;
		System.out.println("D : "+d);
		long l = (long)d*10;
		System.out.println(l);
		return l;
	}
	
	public static boolean checkBigger(int i)
	{
		return i > 10;
	}
}