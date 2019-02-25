import java.util.*;

class TakeTwoStones
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);	
		int n=s.nextInt();
		n=n%2;

		if(n==0)	
			System.out.println("Bob");
		else
			System.out.println("Alice");
	}
}