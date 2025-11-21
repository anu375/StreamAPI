package Collections_class;

public class First {

	public static void main(String[] args) {
		
		//Lambda Function ==>  Functional Interface (only one Abstract Method)
		
		Addition<String>add1 =(i,j)->{return i+j;};
		System.out.println(add1.add("12", "13"+" "+"HELLO"));
		System.out.println("************************");
		
		Multiplication<Integer> mul = (r,s)->{return r*s;};
		System.out.println(mul.multiply(12,13));
		System.out.println("??????????????????????????????");
		
		Division<Double> div1 = (s,t)->{return s/t;};
		System.out.println(div1.division(12.0,2.0));
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		
		Modulus<Integer> mod =(q,t)->{return q%t;};
		System.out.println(mod.modulus(12,2));
		System.out.println("#########################");
		
		Substraction<Float> sub =(d,e)->{return d-e;};
		System.out.println(sub.substraction(12.0f, 2.0f));
	}
}

@FunctionalInterface

interface Addition<T>
{
	public T add(T i,T j);
}

interface Multiplication<R>
{
	public R multiply(R r, R s);
}

interface Division<S>
{
	public S division(S s, S t);
}

interface Modulus<Q>
{
	public Q modulus(Q q,Q t);
}

interface Substraction<D>
{
	public D substraction(D d,D e);
}