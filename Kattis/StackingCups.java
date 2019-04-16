import java.util.*;

class StackingCups
{
	
	public static void main(String[] args) throws Exception
	{
		HashMap<Integer,String> hm= new HashMap<>();
		ArrayList<Integer> al= new ArrayList<>();

		String p1="";
		String p2="";
		boolean half=false;
		Scanner	sc = new Scanner(System.in);
		int cases=sc.nextInt();
		while(cases>0)
		{
			p1 = sc.next();
			p2 = sc.next();
			try
			{
				int r=Integer.parseInt(p1);
				String x=p2;
				hm.put(r/2,x);
				al.add(r/2);
			}
			catch(Exception e)
			{
				int r= Integer.parseInt(p2);
				String x = p1;
				hm.put(r,x);
				al.add(r);
			}
			cases--;
		}
		Map<Integer,String> sortedMap = new TreeMap<Integer,String>(hm);
		Collections.sort(al);
		    for (int i = 0; i < al.size(); i++)
				System.out.println(sortedMap.get(al.get(i)));

		//System.out.println(al);

	}
}