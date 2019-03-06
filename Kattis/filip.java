import java.util.*;

class filip
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int	a=s.nextInt();
		int	b=s.nextInt();

		StringBuilder x=new StringBuilder();
		x.append(a);
		x.reverse();
		StringBuilder y=new StringBuilder();
		y.append(b);
		y.reverse();
		String p=x.toString();
		String q=y.toString();
		int a1=Integer.parseInt(p);
		int b1=Integer.parseInt(q);
		
		System.out.println(Math.max(a1,b1));
	}
}