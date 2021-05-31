package com.vm.training.java.serializable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializableDemo {

	public static void main(String [] args) throws ClassNotFoundException, IOException
	{
		FileInputStream fis=new FileInputStream("Geetha.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);


		Employee e=(Employee) ois.readObject();
		System.out.println(e.id+" "+e.name);
		ois.readObject();
	}


}
