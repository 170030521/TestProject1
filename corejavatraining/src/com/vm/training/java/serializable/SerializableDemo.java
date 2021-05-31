package com.vm.training.java.serializable;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializableDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
  Employee e=new Employee(1,"geetha");
    FileOutputStream fis=new FileOutputStream("Geetha.txt");
    ObjectOutputStream oos=new ObjectOutputStream(fis);
    oos.writeObject(e);
    System.out.println("done");
    
	}

}
