package return1;

public class ReturnType1 {
	
	public int test()
	{
		int a =50;
		int b =60;
		int c =60;
		int d= a+b-c;
		return d;
		
	}
	public static void main(String[] args)
	{
		ReturnType1 s = new ReturnType1();
	    int f = s.test();
       System.out.println(f);
	  
	}

}
