package vom.vm.trainig.java.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw=new FileWriter("Geetha.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("gvhgv");
		bw.newLine();
		bw.write("ygjhgh");
		bw.flush();
		bw.close();
		
		
		
		

	}

}
