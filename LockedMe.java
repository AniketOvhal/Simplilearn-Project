package simplilearnProject;

import java.io.File;

import java.io.FileWriter;

import java.util.Scanner;

public class LockedMe 
{
static final String projectFilePath="C:\\Users\\Ofdradm\\Simplilearn\\LockedMeFiles";
	public static void getMenu()
	{
		System.out.println("__________________________________________________________________________");
		System.out.println("\t\t\tWelcome to LockedMe App Prototype");
		System.out.println("\t\tDeveloped by : Aniket, Java Developer");
		System.out.println("__________________________________________________________________________");
		System.out.println("\t1). Display all the files.");
		System.out.println("\t2). Add a new file.");
		System.out.println("\t3). Delete a file. ");
		System.out.println("\t4). Search file. ");
		System.out.println("\t5). Exit. ");
		
	 }
	
	public static void getAllFiles()
	{
		File folder = new File(projectFilePath);
		File[] listofFiles = folder.listFiles();
		
		if(listofFiles.length>0)
		{
			System.out.println("List of Files are as follows:\n");
			for(var l:listofFiles)
			{
				System.out.println(l.getName());
			}
			
		 }
		else
		{
			System.out.println("the Folder is empty");
		}
				
	  }
	
	//Method to Create Files//
	
  public static void createFiles() 
	  {
		 
		  
	  try 
	  {
		  Scanner obj = new Scanner(System.in);
		  String fileName;
		  System.out.println("Enter the file name: ");
		  fileName = obj.nextLine();
		  
		  int linesCount;
		  
		  System.out.println("How many lines you want in the file:");
		  linesCount = Integer.parseInt(obj.nextLine());
		  
		  FileWriter fw = new FileWriter(projectFilePath+"\\"+fileName);
		  
		  for (int i=1; i<=linesCount; i++)
		  	{
		  		System.out.println("Enter file line: ");
		  		fw.write(obj.nextLine()+"\n");
		  	 }
		  	System.out.println("File Created Successfully");
		  	fw.close();
	   }
	  	catch (Exception e)
	  {
	  		//Handle Exception//
	  }
	  	
	   }
  
  		//Method to Delete Files//
  
  public static void deleteFiles()
  	{
	  Scanner obj = new Scanner(System.in);
	  String fileName;
	  System.out.println("Enter the file name you want to delete:");
	  fileName=obj.nextLine();
	  File f = new File(projectFilePath+"\\"+fileName);
	  if (f.exists())
	  {
		  f.delete();
		  System.out.println("File Deleted Successfully");
	  }
	  else
	  {
		  System.out.println("File not found.");
	  }
  	}
  
  		//Method to Search Files//
  
  public static void searchFiles()
  {
	  Scanner obj = new Scanner(System.in);
	  String searchName;
	  System.out.println("Enter the filename you want to search: ");
	  searchName=obj.nextLine();
	  File f = new File(projectFilePath+"\\"+searchName);
	  if (f.exists())
	  {
		 f.canRead();
		 	System.out.println("File found successfully.");
		  
	  }
	  else
	  {
		  System.out.println("The file does not exists.");
	  }
	  
   }
	  
	
}
