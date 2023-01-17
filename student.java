package Lab8;
 class PromSt {
private int subjectcode;
private String subjectname;
private int rollno;


PromSt(int subjectcode, String subjectname, int rollno) 
{
	this.subjectcode = subjectcode;
	this.subjectname = subjectname;
	this.rollno = rollno;
}
public int getSubjectCode() 
{
	return subjectcode;
}

public int getRollNo() 
{
	return rollno;
}

public String getSubjectName()
{
	return subjectname;
}

public void setSubjectCode(int subjectcode) 
{
	this.subjectcode = subjectcode;
 }

public void setSubjectName(String subjectname) 
{
	this.subjectname = subjectname;
 }

public void setRollno(int rollno) 
{
	this.rollno = rollno;
 }
 }

  final class FailSt {
	 final int subjectcode;
	 final String subjectname;
	 final int rollno;
		
		public FailSt(int subjectcode, String subjectname, int rollno) 
		{
			this.subjectcode = subjectcode;
			this.subjectname = subjectname;
			this.rollno = rollno;
		}
		
		public int getSubjectCode() 
		{
			return subjectcode;
		}

		public int getRollNo() 
		{
			return rollno;
		}

		public String getSubjectName()
		{
			return subjectname;
		}

  }

	
public class student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Promoted Students Details!" + '\n');
		PromSt obj = new PromSt(1034,"Artifical Intellegence", 116);
		System.out.println("Subject Code : " +obj.getSubjectCode());
		System.out.println("Course Name : " +obj.getSubjectName());
		System.out.println("Roll No : " +obj.getRollNo());
		

	 
	// update the name, this object is mutable
		obj.setSubjectCode(1035);
		obj.setSubjectName("Object Oriented Programming");
		obj.setRollno(136);
		System.out.println("Subject Code : " +obj.getSubjectCode());
		System.out.println("Course Name : " +obj.getSubjectName());
		System.out.println("Roll No : " +obj.getRollNo());
		
		System.out.println('\n');
		System.out.println("Failed Students Details!" + '\n');
		FailSt obj2 = new FailSt(1033,"Programming Foundamentals", 120);
		PromSt obj3 = new PromSt(1032,"Functional English", 140);
		System.out.println("Subject Code : " +obj2.getSubjectCode());
		System.out.println("Course Name : " +obj2.getSubjectName());
		System.out.println("Roll No : " +obj2.getRollNo());
		
		System.out.println("Subject Code : " +obj3.getSubjectCode());
		System.out.println("Course Name : " +obj3.getSubjectName());
		System.out.println("Roll No : " +obj3.getRollNo());
		

	}

}
 