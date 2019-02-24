import java.util.*;

class trik
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char input[]=new char[s.length()];
		int a=1,b=0,c=0;
		for(int i=0;i<input.length;i++)
		{
			input[i]=s.charAt(i);
		}

		for(int i=0;i<input.length;i++)
		{
			int temp=0;
			if(input[i]=='A')
			{
				temp=a;
				a=b;
				b=temp;
				//System.out.println("A typed");
			}
			if(input[i]=='B')
			{
				temp=b;
				b=c;
				c=temp;
				//System.out.println("B typed");
			}
			if(input[i]=='C')
			{
				temp=a;
				a=c;
				c=temp;
				//System.out.println("C typed");
			}
		}
		if(a==1)
			System.out.println(1);
		else if(b==1)
			System.out.println(2);
		else if(c==1)
			System.out.println(3);

	}


}