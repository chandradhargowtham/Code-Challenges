import java.util.*;
class StringPermutation
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);	
		String s1=sc.next();
		String s2=sc.next();
		
		if(s1.length()!=s2.length())
			{
				System.out.println("Not a Permutation");
				System.exit(0);
			}
		char arr1[]=new char[s1.length()];
		char arr2[]=new char[s1.length()];
		
		for(int i=0;i<s1.length();i++)
		{
			arr1[i]=s1.charAt(i);
			arr2[i]=s2.charAt(i);
		}

		Arrays.sort(arr1);
		Arrays.sort(arr2);



		for(int i=0;i<s1.length();i++)
		{
			if(arr1[i]!=arr2[i])
			{
				System.out.println("Not a Permutation");
				System.exit(0);
			}


		}
		System.out.println("Permutation");
	}
}