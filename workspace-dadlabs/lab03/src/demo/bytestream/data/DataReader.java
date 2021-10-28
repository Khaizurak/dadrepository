package demo.bytestream.data;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DataReader {
	
	public static void main(String[] args) {
		
		String outFile ="rainfall.txt";
		
		String dates[] = {"22/10/21", "23/10/21", "24/10/21", "25/10/21", "26/10/21", "27/10/21"};
		double utilizations[] = { 0.0, 0.0, 0.0, 0.0, 0.0, 8.0 };
		
		try {
			
			DataOutputStream dos = new DataOutputStream(new FileOutputStream(outFile));
			
			for (int index = 0; index < dates.length; index++) {
				
				dos.writeUTF(dates[index]);
				dos.writeDouble(utilizations[index]);
				
				dos.flush();
				
			}
			
				dos.close();
				
		} catch (Exception ex) {
			
			ex.printStackTrace();
			
		}
		
		System.out.println("End of program. Check out " + outFile);
	}

}
