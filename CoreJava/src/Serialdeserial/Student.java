package Serialdeserial;

import java.io.Serializable;

public class Student implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
public Student(int age ,String name, String number, String mailid) {
	this.age= age;
	 this.name= name;
	  this.mailid= mailid;
	  this.number= number;
}
 int age;
 transient String name;
 String number;
 String mailid;
 protected static long getSerialversionuid() {
	return serialVersionUID;
}
protected int getAge() {
	return age;
}
protected String getName() {
	return name;
}
protected String getNumber() {
	return number;
}
protected String getMailid() {
	return mailid;
}
@Override 
  public String toString() {
	 return name+" "+number+" "+mailid+" "+age;
 }

}
