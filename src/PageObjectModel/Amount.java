package PageObjectModel;

class Amount 
{

		
		//Declaration
		private int amnt;
		
		//initialization
		public Amount(int n)
		{
			
			amnt=n;
		}
		
		//utilization
		public int getamnt()
		{
			return amnt;
			
		}		

	public static void main(String [] args)
	{
		Amount dinga=new Amount(25000);
		int d=dinga.getamnt();
		System.out.println(d);//25000
		
		Amount dingi=new Amount(20000);
		int di = dingi.getamnt();
		System.out.println(di);//20000
		
	}
	
}	