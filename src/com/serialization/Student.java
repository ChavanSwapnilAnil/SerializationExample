package com.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Student implements Serializable
{
	
	public static final int serialVersionUID= 12345 ;
			
  int id=10  ;
 String name= "abc";
 
 
 
 public Student(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}


public static void main(String[] args) throws ClassNotFoundException 
 {
	 
        Student S1 = new Student (10,"aks");
		String file = "abc.txt" ;
		
		try {
			FileOutputStream Fo = new FileOutputStream(file);
			ObjectOutputStream Out = new ObjectOutputStream(Fo);
			Out.writeObject(S1);
			System.out.println(S1.id);
			
			
			
			
			  FileInputStream in = new FileInputStream(file); ObjectInputStream o_in = new
			  ObjectInputStream(in); Student S2=(Student)o_in.readObject();
			  System.out.println(S2.name+" "+S2.id+" "+serialVersionUID);
			 
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
   

	




}




	
}
