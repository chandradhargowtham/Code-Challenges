import java.util.*;

class autori
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);	
		String input=sc.next();
		StringBuilder ip=new StringBuilder(input);
		StringBuilder output=new StringBuilder();
		output.append(ip.charAt(0));
		int c=0;
		int i=0;
				while(ip.indexOf("-")!=-1)
				{
					c=ip.indexOf("-");
					output.append(ip.charAt(c+1));
					ip.deleteCharAt(c);
				}


		System.out.println(output.toString());
		//System.out.println(c);

	}
}