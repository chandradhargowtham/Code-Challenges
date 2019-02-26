import java.util.*;

class isithalloween
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		String m=sc.nextLine();
		//System.out.println(n);
		if((m.contains("OCT")&&m.contains("31"))||(m.contains("DEC")&&m.contains("25")))
				System.out.println("yup");
		else
				System.out.println("nope");
			
			
	}
}