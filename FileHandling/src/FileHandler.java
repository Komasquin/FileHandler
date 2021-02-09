import java.io.File;
import java.util.Scanner;

public class FileHandler {
	public static void main(String[] args) {
		//file object with the file name 
		File file = new File("fileHandler.txt");
		//a scanner object to grab user based input
		Scanner in = new Scanner(System.in);
		//an object from my 'FileOperations' class
		FileOperations oper = new FileOperations();
		//a 'String' object to hold the values the user supplies
		String input = "";
		//asking for input and storing the user input into the variable 'input'
		System.out.println("What do you want to enter into the file: ");
		input = in.nextLine();
		//try-catch for any problems you may face
		try {
			//check if the file exists: if it does call to the 'append()' method in my 'FileOperations' class
			if(file.exists()) {
				//call to the 'append()' method, and to the 'read()' method 
				oper.append(input.getBytes() , file);
				oper.read(file, input.getBytes());	
			}else {
				//if the file does exist just write to it, and call to the 'read()' method for testing
				oper.write(input.getBytes(), file);
				oper.read(file, input.getBytes());
			}//end of 'if statement'
		}catch(Exception ex) {
			//print any errer that may be caught: there are two specific exceptions used but just in case there are more
			System.out.println(ex.getMessage());
		}//end of 'try-catch' block
		//close the 'Scanner' object
		in.close();
	}//end of main method
}
