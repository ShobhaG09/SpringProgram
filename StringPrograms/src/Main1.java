class Student {

	private String stuName;
	private Integer stuAge;
	
	public Student(String stuName,Integer stuAge)
	{
		this.stuName=stuName;
		this.stuAge=stuAge;
	}
	public void display()
	{
		System.out.println("Student name="+stuName);
		System.out.println("Student Age="+stuAge);
	}
}
class Main1
{
	public static void main(String a[])
	{
		Student s1=new Student("Shobha",21);
		Student s2=new Student("Sona",25);
		s1.display();
		s2.display();
	}
}


