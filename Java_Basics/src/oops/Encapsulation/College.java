package oops.Encapsulation;


public class College {
public static void main(String[] args) {
	Student s = new Student();
	
	s.setName("AADESH");
	s.getName();
	s.setAge(22);
	
	System.out.println(s.getName());
	System.out.println(s.getAge());
}	
}
