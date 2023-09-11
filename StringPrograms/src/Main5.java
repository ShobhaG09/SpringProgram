public class Main5 {
	public static void main(String a[])
		{
			StringBuilder s=new StringBuilder();
			System.out.println(s.capacity());

			StringBuilder s1=new StringBuilder("Shobha");
			System.out.println(s1.capacity());
			
			StringBuilder s2=new StringBuilder(20);
			System.out.println(s2.capacity());
			
			s.append("Shobha");
			s.append("ShobhaGhante");
			System.out.println(s.capacity());
			
			s.reverse();
			System.out.println(s);
			StringBuilder s3=new StringBuilder("Shobha");
			System.out.println(s2);
			
			s3.append("Hello");
			System.out.println(s3);
		}
}
