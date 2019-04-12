package lekce10;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Writer {
	
	public static void writeToExistingFile(String pathToFile, String contentToWriteToFile) {
		BufferedWriter bw = null;
		FileWriter fw = null;		
		try {
			fw = new FileWriter(pathToFile, true);
			bw = new BufferedWriter(fw);
			bw.write("\n"+contentToWriteToFile);
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if (bw != null)
					bw.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
	
	public static void writeToNewFile(String pathToFile, String somethignToWrite) {
		BufferedWriter writer = null;
		try {
		    writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(pathToFile), "utf-8"));
		    writer.write(somethignToWrite);
		} catch (IOException ex) {
		    ex.getLocalizedMessage();
		} finally {
		   try {
			   writer.close();
		   }catch(IOException e) {
               System.out.println("Unable to close file: " + pathToFile);
           }catch(NullPointerException ex) {
        	   System.out.println("File was never opened. ");
           }
		}
	}
}
