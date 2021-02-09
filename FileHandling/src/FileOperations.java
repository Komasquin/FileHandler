import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOperations {
	public void write(byte[] input, File file) {
		//making an object from the 'FileOutputStream' class
		FileOutputStream outPutFile;
		try {
			//instantiating the 'FileOutputStream' class
			outPutFile = new FileOutputStream(file);
			//calling the 'write()' method from the 'FileOutputStream' class
			outPutFile.write(input);
			//cleaning up and closing 
			outPutFile.flush();
			outPutFile.close();
		}catch(Exception ex) {
			//print any errors you might find
			System.out.println(ex.getMessage());	
		}//end of 'try-catch' block
	}//end of method 'write'
	
	public void read(File file, byte[] param) {
		//making an object from the 'FileInputStream' class
		FileInputStream input;
		try {
			//instantiating the 'FileOutputStream' class
			input = new FileInputStream(file);
			//reading the passed info
			System.out.print((char)input.read());
			//closing 
			input.close();
		}catch(Exception ex) {
			//print any errors you might find
			System.out.println(ex.getMessage());
		}//end of 'try-catch' block
	}//end of method 'read'
	
	public void append(byte[] param, File file) {
		//making an object from the 'FileOutputStream' class
		FileOutputStream put;
		try {
			//instantiating the 'FileOutputStream' class
			put = new FileOutputStream(file, true);
			//calling the 'write()' method from the 'FileOutputStream' class
			put.write(param);
			//test print
			for(int i = 0 ; i < param.length; i++) {
			System.out.print((char)param[i]);
			}//end of for loop
			//cleaning up and closing 
			put.flush();
			put.close();
		}catch(Exception ex) {
			//print any errors you might find
			System.out.println(ex.getMessage());
		}//end of 'try-catch' block
	}//end of method 'append'
}
