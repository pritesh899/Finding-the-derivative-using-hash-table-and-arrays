import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class Derivative 
{
	
	public static void main(String[] args)
	{
		Functions functions = new Functions();
			 
		int str;
		int result_coeffient, result_exponent;
			 
		// Creating a Hashtable instance
		Hashtable<Integer, Integer> hashtable = new Hashtable<Integer, Integer>();
			 
	  
		/*for(int i =1 ;i<=100;i++)
		{
	    hashtable.put(i, i);
		}*/
		hashtable.put(1, 3);
		hashtable.put(3, 2);
		hashtable.put(5, 1);
		hashtable.put(6, 0);
		
	    System.out.println("Hashtable contains:");
			
	    Set<Integer> keys = hashtable.keySet();
			 
	    //Obtaining iterator over set entries
		Iterator<Integer> itr = keys.iterator();
			 
		//Displaying Key and value pairs
		
		while (itr.hasNext())
		{ 
			// Getting Key
			str = itr.next();
			int exponent = hashtable.get(str);
			System.out.println("("+str+"Y)^"+hashtable.get(str));
			result_coeffient = functions.new_coefficent(str,exponent);
			result_exponent = functions.exponent_reduction(exponent);
			System.out.println("Answer : ("+result_coeffient+"Y)^"+result_exponent);
	    } 
	
			 
			
	}//end of main

}//end of class