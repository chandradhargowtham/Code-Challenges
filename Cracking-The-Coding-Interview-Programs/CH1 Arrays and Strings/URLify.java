import java.util.*;

class URLify
{
	public static void main(String[] args) 
	{
		
		String s="Mr. John Smith    ";	
		String newstr=	s.trim().replace(" ","%20");
		System.out.println("Simple String Manipulation: "+newstr);
		
	}
}