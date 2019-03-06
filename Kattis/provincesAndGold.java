import java.util.*;

class provincesAndGold
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int g=sc.nextInt();
		int s=sc.nextInt();
		int c=sc.nextInt();

		int money=g+s+c;
		int buypower=g*3+s*2+c*1;
		

		if(buypower>=8){
			System.out.print("Province");
			//buypower-=8;
		}
		else if(buypower>=5 && buypower<8){
			System.out.print("Duchy");
			//buypower-=5;
		}
		else if(buypower>=2 && buypower<5){
			System.out.print("Estate");
			//buypower-=2;
		}
		if(buypower>=2)
			System.out.print(" or ");
		if(buypower>=6){
			System.out.print("Gold");
			//buypower-=6;
		}
		else if(buypower>=3){
			System.out.print("Silver");
			//buypower-=3;
		}
		else{
			System.out.print("Copper");
			//buypower-=0;
		}

	}
}