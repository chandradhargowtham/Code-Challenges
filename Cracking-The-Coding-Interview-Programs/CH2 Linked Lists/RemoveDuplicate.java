// Doesn't work for head or tail. will sort middle elements. Also uses a buffer
import java.util.*;

class RemoveDuplicate
{
	public static void main(String[] args) 
	{
		LinkedList<Integer> lili=new LinkedList<Integer>();	
		lili.add(7);
		lili.add(1);
		lili.add(2);
		lili.add(3);
		lili.add(3);
		lili.add(5);
		lili.add(6);
		System.out.println("Linked List: ");
		System.out.println(lili);
		List<Integer> arr=new ArrayList<>();
		for(int i=0;i<lili.size();i++)
		{
			if(!arr.contains(lili.get(i)))
				arr.add(lili.get(i));

		}
		
		for(int i=0;i<lili.size();i++)
		if(!(arr.get(i)==lili.get(i)))
			lili.remove(i);
		System.out.println("After Removing Duplicates: ");
		System.out.println(lili);
	}
}