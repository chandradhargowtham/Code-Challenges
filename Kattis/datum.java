import java.util.*;
import java.time.*;

class datum
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);	
		int d=sc.nextInt();
		int m=sc.nextInt();
		LocalDate date=LocalDate.of(2009,m,d);
		System.out.println(date.getDayOfWeek().toString().toLowerCase());
	}
}