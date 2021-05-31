package NewFeatures;



		// TODO Auto-generated method stub
	interface Test
	{
		void display();
	}
	public class LamdaExpression {

		public static void main(String [] args)
		{
			Test t= ()->
			{
				System.out.println("hello");
				System.out.println("java");
				
			};
			
			t.display();
			
			
			Test t1=()->System.out.println("Hello sinlge line body");
			t1.display();
		}
	}


