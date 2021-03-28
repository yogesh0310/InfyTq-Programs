class SelectionControlStructure2 {
	public static void main(String[] args) {
		// Implement your code here 
		int a=1;
		int b=4;
		int c=6;
		float d=0.0f;
		d=(b*b)-4*a*c;
		float root= (-b + d)/2*a;
		if(d == 0)
		{
		    System.out.println("The root is "+root);
		}
		else if( d > 0)
		{
		    System.out.println(root);
		}
		else 
		{
		    System.out.println("The equation has no real root");
		}
	}
}

