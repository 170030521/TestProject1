
package vom.vm.trainig.java.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileReader fw=new FileReader("Geetha.txt");
		BufferedReader br=new BufferedReader(fw);
		
		int readChar =fw.read();
		while(readChar !=-1)
		{
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(readChar);
			readChar=fw.read();
		}
	}

}
