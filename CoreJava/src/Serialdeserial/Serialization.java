package Serialdeserial;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
 Student obj= new Student(26, "AJith Kumar A G", "ajithadkar1996@gmail.com", "8105486334");
 
 FileOutputStream fout= new FileOutputStream("E:\\obj.ser");
 ObjectOutputStream Objout=new  ObjectOutputStream(fout);
 Objout.writeObject(obj);
 Objout.close();
 fout.close();
  
 FileInputStream fin= new FileInputStream("E:\\obj.ser");
 ObjectInputStream objin= new ObjectInputStream(fin);
 Student obj1=(Student) objin.readObject();
 objin.close();
 fin.close();
System.out.println( obj1.toString());
obj1.getName();
	}

}
