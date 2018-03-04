import java.util.Scanner;

public class Derivative_array {

	private static Scanner sc;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		
		Functions functions = new Functions();
		String [] signs = new String[10] ;
		signs[0] = "";
		int [] coeffOriginal = new int[10];
		int [] ExpoffOriginal = new int[10];
		int [] resultCoOriginal = new int[10];
		int [] resultExpoOriginal = new int[10];
		
		
		//input data
		System.out.print("Enter the variables polynomial (upto 10):");
		int number = sc.nextInt();
		signs[number] = "";
		System.out.print("\nEnter the polynomial :");
		for(int i = 0; i < number ;i++)
		{
			System.out.print("\nEnter coeffient "+(i+1)+":");
			coeffOriginal[i] = sc.nextInt();
			System.out.print("\nEnter exponent "+(i+1)+":");
			ExpoffOriginal[i] =sc.nextInt();
			if(i < number-1)
			{
				System.out.print("\nEnter sign :");
				signs[i+1] = sc.next();
			}
		}
		
		//displaying original polynomial
		System.out.print("\nPolynomial :");
		for(int i = 0; i < number ;i++)
		{
			System.out.print("\t("+coeffOriginal[i]+"Y)^"+ExpoffOriginal[i]+"\t"+signs[i+1]);
		}
		
		//performing dervations
		for(int i = 0; i < number ;i++)
		{
			resultCoOriginal[i] = functions.new_coefficent(coeffOriginal[i],ExpoffOriginal[i]);
			resultExpoOriginal[i] = functions.exponent_reduction(ExpoffOriginal[i]);
			
		}
		
		//Displaying derivation
		System.out.print("\n");
		System.out.print("\nDerivation :");
		for(int i = 0; i < number ;i++)
		{
			System.out.print("\t("+resultCoOriginal[i]+"Y)^"+resultExpoOriginal[i]+"\t"+signs[i+1]);
		}

	}

}
