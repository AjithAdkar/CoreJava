package com.java.clone;

public class Student implements Cloneable {
public String name;
public String mailID;
public int age;

public Student(String name,String mailID,int age) {
	this.name= name;
	this.mailID=mailID;
	this.age= age;
}

@Override
public String toString() {
	
	return "  Name: "+name+"\n  Mailid: "+mailID+"\n  Age: "+age;
	
}
@Override
public Object clone()throws CloneNotSupportedException {
	return super.clone();
}
	 
	public static void main(String[] args) throws CloneNotSupportedException {
		Student obj= new Student("trump", "trump@usa.com", 18);
		Student obj1=(Student) obj.clone();
		System.out.println(obj1.toString());

	}

}
