import java.util.*;

class ladder
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);	
		int h= sc.nextInt();
		int v= sc.nextInt();
		double rad=Math.toRadians(v);
		System.out.println((int)(Math.ceil((h/Math.sin(rad)))));
	}
}