
public class Functions {
	public int new_coefficent (int coefficent,int exponent)
	{
		int new_coefficent = coefficent * exponent;
		return new_coefficent;
	}
	
	public int exponent_reduction(int exponent)
	{
		if(exponent == 0)
		{
			return 0;
		}else
		{
			int new_exponent = exponent - 1;
			return  new_exponent;
		}
	}

}
