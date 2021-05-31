package vom.vm.trainig.java.io;

import java.io.File;
import java.io.IOException;

public class CreateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("Geetha.txt");
		File f1=new File("C:\\Users\\Phanidra Reddy\\Desktop\\geetha\\4-1");
		if(f1.exists())
		{
			System.out.println("file is created");
		}
		else
		{
			System.out.println("not");
			try {
				f1.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("created");
		}

	}

}
