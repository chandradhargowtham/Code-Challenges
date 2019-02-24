import java.util.*;

class quadrant
{
public static void main(String[] args) 
	{
		int a,b; //quadrant points
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		
		if(a>0)
			if(b>0)
				System.out.println(1);
			else
				System.out.println(4);
		else if(b>0)
				System.out.println(2);
			else
				System.out.println(3);
		

	}

}