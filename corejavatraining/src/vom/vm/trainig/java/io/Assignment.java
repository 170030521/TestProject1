package vom.vm.trainig.java.io;

import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Assignment {

	public static void main(String[] args) {
		try {
			String s ="";
			File f = new File("Geetha.txt");
			FileReader fr = new FileReader(f);
			int r = fr.read();
			while(r!= -1)
			{
				s=s+(char)r;
				r=fr.read();
			}
			fr.close();
			StringBuffer sb = new StringBuffer(s);
			String s1 = sb.reverse().toString();
			FileWriter fw = new FileWriter(f);
			fw.write(s1);
			fw.flush();
			fw.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		
		
		

	}


