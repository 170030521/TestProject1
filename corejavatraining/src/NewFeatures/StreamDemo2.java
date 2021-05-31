package NewFeatures;

import java.util.ArrayList;



public class StreamDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<Employee> ar=new ArrayList();

		ar.add(new Employee(1,"asri","cse",21,260000));
		ar.add(new Employee(2,"siri","dev",27000,28));
		ar.add(new Employee(3,"krishna","ece",30000,32));
		ar.add(new Employee(4,"john","test",32000,45));
		ar.add(new Employee(5,"sanvi","hr",80000,40));

		ar.forEach(System.out::println);

		long count=ar.stream().count();
		System.out.println("count of employees is :"+count);

		System.out.println(" print only developer");
		ar.stream().filter(s->s.getDept().equalsIgnoreCase("dev")).forEach(s->System.out.println(s));


		System.out.println("print the details that starts with s");

		ar.stream().filter(s->s.getName().startsWith("s")).forEach(s->System.out.println(s));
		
		System.out.println("count the employees salary greater than 50000");
		
		System.out.println(ar.stream().filter(s->s.getSalary()>50000).count());

	}

}
