import java.util.*;
<<<<<<< HEAD


 class toilet 
 {
    String[] seq;
    ArrayList<Integer> result;
    
    public static void main(String args[]) {
    new toilet();
    }

    public toilet() {
    readData();
    analyzeData();
    printResult();
    }
    // Tried the Array of chars instead of String.charAt() or String.contains()

     void readData() {
    //String input=sc.nextLine().toUpperCase();
    Scanner scan = new Scanner(System.in);
    seq = scan.nextLine().split("");
    scan.close();
    }

     void analyzeData() {
    result = new ArrayList<Integer>();
    One();
    Two();
    Three();
    }
    // Third Condition - AS IT IS
     void Three() {
    int changes = 0;
    for (int i = 1; i < seq.length; i++) {
        if (!seq[i - 1].equals(seq[i])) {
        changes += 1;
        }
    }
    result.add(changes);
    }
    // Second Condition - ALL DOWN
     void Two() {
    int changes = 0;
    for (int i = 1; i < seq.length; i++) {
        if (i == 1) {
        if (seq[0].equals("D") && seq[1].equals("U")) {
            changes += 2;
        }
        if (seq[0].equals("U")) {
            changes += 1;
        }
        } else if (seq[i].equals("U")) {
        changes += 2;
        }
    }
    result.add(changes);
    }
    // First Condition - ALL UP
     void One() {
    int changes = 0;
    for (int i = 1; i < seq.length; i++) {
        if (i == 1) {
        if (seq[0].equals("U") && seq[1].equals("D")) {
            changes += 2;
        }
        if (seq[0].equals("D")) {
            changes += 1;
        }
        } else if (seq[i].equals("D")) {
        changes += 2;
        }
    }
    result.add(changes);

    }

     void printResult() {
    for (Integer integer : result) {
        System.out.println(integer);
    }
    }
=======
class toilet
{
	
	public static void main(String args[])
	{
	Scanner sc= new Scanner(System.in);
	String input=sc.nextLine().toUpperCase();
	int l=input.length();
	

	// First Condition - ALL UP
	int u=0;
	if(input.charAt(0)=='D')
		{
			u++;
		}
	for(int i=1;i<l;i++)
	{
		if(input.charAt(i)=='D')
		{
			u+=2;
		}
	}
	System.out.println(u);
	

	// Second Condition - ALL DOWN
	int d=0;
		if(input.charAt(0)=='U')
		{
			d++;
		}
	for(int i=1;i<l;i++)
	{
		if(input.charAt(i)=='U')
		{
			d+=2;
		}
	}
	System.out.println(d);

	// Third Condition - AS IT IS
	int x=0;
	for(int i=0;i<l-1;i++)
	{
		if(input.charAt(i)!=input.charAt(i+1))
		{
			x++;
		}
	}
	System.out.println(x);
	}
>>>>>>> 8fbd3af10828d95ca1d686ea89599fd28b5f5e6c
}