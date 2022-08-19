package org.singleton;

public class SingEmp {
	//declare your object for the class (global level)
	public static SingEmp a;
	//declare one constructor as private
	private SingEmp() {
		
	}
	//create a method for oject creation
	public static SingEmp createobject() {
		
		if(a==null) {
			a=new SingEmp();
		}
		return a;
		
		}
	//create all methods you want
	public void empid() {
		System.out.println("908");
	}
	public void empname() {
		System.out.println("jill");
	}
	public static void main(String[] args) {
		SingEmp c=createobject();
		c.empname();
		c.empid();
		System.out.println("syterm.identyHashCode(c)");
		SingEmp d=createobject();
		d.empid();
		d.empname();
		System.out.println("systerm.identyHashCode(d)");
	
	}
	

}
