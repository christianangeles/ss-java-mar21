/**
 * 
 */
package com.ss.wk1.d3.charcount;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Class to perform fileIO related operations.
 * @author Christian Angeles
 */
public class FileOperations {
	/**
	 * Counts the number of time a character appears in a file. Returns character count.
	 * @param filePathName
	 * @param letter
	 * @return
	 */
	public Integer countChar(String filePathName, String letter) throws IOException {
		int charCount = 0;
		
		try(FileInputStream fileIn = new FileInputStream(filePathName)){
			int charByte;
			while((charByte = fileIn.read()) != -1) {
				if(charByte == letter.getBytes()[0]) {
					charCount += 1;
				}
			}
		}
		return charCount;
	}
	/**
	 * Append text to a text file.
	 * @param filePathName
	 * @param addText
	 */
	public void appendToFile(String filePathName, String addText) throws IOException {
		try(FileWriter fileWrite = new FileWriter(filePathName, true)){
			fileWrite.append(addText);
		}
	}
	/**
	 * Returns string array of the file/directory names of given path.
	 * @param path
	 * @return
	 */
	public String[] listFileDir(String path) throws Exception {
		File dir;
		if(path.isEmpty()) {
			dir = new File(".");
		}
		else {
			dir = new File(path);
		}
		
		return dir.list();
	}
}
