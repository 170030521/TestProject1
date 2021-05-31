package NewFeatures;
@FunctionalInterface
interface StringReverse{
	String Reverse(String s);
	
}

public class LengthDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		StringReverse  stringreverse =(s)->
	    {
	    	StringBuilder s1=new StringBuilder(s);
	    	
	    	s=s1.reverse().toString();
	    	
	    	return s+","+"length is "+s.length();
	    };
	    System.out.println("reverse of string is "+stringreverse.Reverse("geetha"));
	}
}
