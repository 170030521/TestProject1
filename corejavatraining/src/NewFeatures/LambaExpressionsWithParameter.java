package NewFeatures;

@FunctionalInterface
interface Calculate1
{
	void addition(int a, int b);
}
interface Calculate2
{
	//method has return type
	int multiplication(int a,int b);
}
interface Large
{
	int findLargest(int a, int b);
}
public class LambaExpressionsWithParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculate1 c1=(a,b)->System.out.println(a+b);
		c1.addition(2, 40);
		Calculate2 c2=(a,b)->a*b;
		System.out.println("multiplication is"+ c2.multiplication(4, 5));
		Large large = (a,b)->
		{
			if(a>b)
				return a;
			else
				return b;
		};
		
		System.out.println("larest number"+ large.findLargest(30, 40));
		

	}
}