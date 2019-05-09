import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();    
        
        while(n>0)
        {
        	String even="";
        	String odd="";
        	String str=sc.nextLine();
        	char c[]=str.toCharArray();
        	for(int i=0;i<c.length;i++)
        	{
        	
        		if(i%2==0 )
            	{
					  even+=c[i];      			
        		}else odd+=c[i];
        	

        	}
        n--;	
        System.out.println(even+" "+odd);
    	}
        
    }
}

