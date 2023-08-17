package org.data;

public class C2 extends C1{
	public void empName()
	{
		System.out.println("company name is :jack");
		this.empId();
		super.companyName();
	}
	public void empId() {
		System.out.println("id is :12345");
}
	public static void mai(String[] args)
	{
		C2 a=new C2();
		a.empName();
	}
}
