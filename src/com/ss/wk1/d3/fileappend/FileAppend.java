/**
 * 
 */
package com.ss.wk1.d3.fileappend;

import com.ss.wk1.d3.charcount.FileOperations;
import com.ss.wk1.d1.guessrng.ConsoleUserInput;

/**
 * Week 1, Day 3 - Append text to a text file.
 * @author Christian Angeles
 */
public class FileAppend {
	private FileOperations fileOps;
	private ConsoleUserInput userIn;
	
	public FileAppend() {
		fileOps = new FileOperations();
		userIn = new ConsoleUserInput();
	}
	/**
	 * Starts file appending project.
	 */
	public void start() {
		System.out.print("Enter text to append: ");
		userIn.setInput();
		try {
			fileOps.appendToFile("resources/in/hello.txt", userIn.getInput().toString());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
