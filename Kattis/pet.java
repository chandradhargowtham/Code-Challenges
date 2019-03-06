import java.util.*;

class pet
{
public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);	
		int[] p1= new int[4];
		int[] p2= new int[4];
		int[] p3= new int[4];
		int[] p4= new int[4];
		int[] p5= new int[4];
		int sum1=0,sum2=0,sum3=0,sum4=0,sum5=0;
		int max=0,p=0;

		for(int i=0;i<4;i++)
		{
			p1[i]=sc.nextInt();
		}
		for(int i=0;i<4;i++)
		{
			p2[i]=sc.nextInt();
		}
		for(int i=0;i<4;i++)
		{
			p3[i]=sc.nextInt();
		}
		for(int i=0;i<4;i++)
		{
			p4[i]=sc.nextInt();
		}
		for(int i=0;i<4;i++)
		{
			p5[i]=sc.nextInt();
		}
		for(int i=0;i<4;i++)
		{
			sum1=sum1+p1[i];
		}
		for(int i=0;i<4;i++)
		{
			sum2=sum2+p2[i];
		}
		for(int i=0;i<4;i++)
		{
			sum3=sum3+p3[i];
		}
		for(int i=0;i<4;i++)
		{
			sum4=sum4+p4[i];
		}
		for(int i=0;i<4;i++)
		{
			sum5=sum5+p5[i];
		}
		if(sum1>max)
		{
			max=sum1;
			p=1;
		}
		if(sum2>max){
			max=sum2;
			p=2;
		}
		if(sum3>max){
			max=sum3;
			p=3;
		}
		if(sum4>max){
			max=sum4;
			p=4;
		}
		if(sum5>max){
			max=sum5;
			p=5;
		}
		System.out.println(p+" "+max);

	}	
}