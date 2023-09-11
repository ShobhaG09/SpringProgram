
class Student1 {

	private String stuName;
	private Integer stuAge;
	
	public Student1(String stuName,Integer stuAge)
	{
		this.stuName=stuName;
		this.stuAge=stuAge;
	}
	public String toString()// Example of Overridden toString 
	{
		return "Student name="+stuName+" Student Age="+stuAge;
	}
}
class Main2
{
	public static void main(String a[])
	{
		Student1 s1=new Student1("Shobha",21);
		Student1 s2=new Student1("Sona",25);

		System.out.println(s1);
		System.out.println(s2.toString());
	}
}



