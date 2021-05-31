package vom.vm.trainig.java.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BuffereReaderDEmo {
	public static void main(String[] args) throws IOException
	{
		FileReader fw=new FileReader("Geetha.txt");
		BufferedReader bw=new BufferedReader(fw);
		System.out.println(bw.readLine());
		
		
	}

}
