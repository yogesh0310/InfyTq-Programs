class SelectionControlStructure {
	public static void main(String[] args) {
		// Implement your code here 
		int num1=9;
		int num2=7;
		int num3=10;
		
		if(num1 > num2)
		{
		    if(num1 > num3)
		    {
		        System.out.println(num1);
		    }
		    else
		    {
		        System.out.println(num3);
		    }
		}
		else if (num2 > num1)
		{
		    if(num2 > num3)
		    {
		        System.out.println(num2);
		    }
		    else
		    {
		        System.out.println(num3);
		    }
		}
	}
}

