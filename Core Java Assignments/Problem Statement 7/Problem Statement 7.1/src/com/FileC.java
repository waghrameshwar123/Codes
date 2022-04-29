package com;

import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
	    FileReader fileReader = null; 
	    FileWriter fileWriter = null; 
	    try { 
	        String file1=args[1]; 
	        fileReader = new FileReader(file1); 
	        String file2=args[1];

	        File f2=new File(file2); 
	        if(!f2.exists()) { 
	            fileWriter = new FileWriter(file2); 
	            f2.createNewFile(); 
	            int c = fileReader.read(); 
	            while(c!=-1) { 
	                fileWriter.write(c); 
	                c = fileReader.read(); 
	            } 
	            fileReader.close();
	            System.out.println("File copied successfully"); 
	        } else { 

	            System.out.println("Do you want to overwrite? enter 'yes' or 'no'...:"); 
	            char ans = sc.next().charAt(0);

	            if(ans=='N'||ans=='n') { 
	                fileReader.close();
	            //  fw.close();
	                System.out.println("Could not enter data"); 
	            } else { 
	                  fileWriter = new FileWriter(file2); 
	                int c = fileReader.read(); 
	                while(c!=-1) { 
	                    fileWriter.write(c); 
	                    c = fileReader.read(); 
	                } 
	                fileReader.close();
	                System.out.println("File updated successfully"); 
	            } 
	        } 
	    } catch(IOException e) { 
	        System.out.println("File coudn't be found!!!"); 
	    } finally { 
	        close(fileReader); 
	        close(fileWriter); 
	    } 
	} 
	public static void close(Closeable stream) { 
	    try { 
	        if (stream != null) { 
	            stream.close(); 
	        } 
	    } catch(IOException e) {
	        e.printStackTrace();
	        } 

	}

}
