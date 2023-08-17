
package org.data;

public class C1 extends A2 implements I3{
	public void companyName()
	{
		System.out.println("company name is :max");
		
		super.placeName();
	}
	
	public void companyId()
	{
		System.out.println("company id is: 134");
		this.companyId();
		this.companyName();
	}
	
	@Override
	public void jobName() {
		System.out.println("job name is IT");
		this.jobName();
		
		
	}
	@Override
	public void workId() {
		System.out.println("work id is 321");
		this.workId();
	}
	@Override
	public void jobId() {
		System.out.println("job id is 564");
		this.jobId();
	}
	@Override
	public void studentName() {
		System.out.println("student name akash");
		this.studentName();
	}
	@Override
	public void studentId() {
		System.out.println("student id is 444");
		this.studentId();
		
}
	@Override
	public void teacherName() {
		System.out.println("teacher name is akalia");
		this.teacherName();
	}
	@Override
	public void teacherId() {
		System.out.println("teacher id is 234");
		
	
		
	}

	@Override
	public void greensName() {
		System.out.println("green name is greens technolgy");
		this.greensName();
	}
	@Override
	public void greensId() 
	{
		System.out.println("greens id is 765");
		this.greensId();
	}
	
		}
		