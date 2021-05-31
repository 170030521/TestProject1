package vom.vm.trainig.java.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("Geetha.txt");
		FileWriter fw=new FileWriter(f);
		fw.write("hello0");
		fw.write("fcdc");
		fw.close();
		

	}

}
