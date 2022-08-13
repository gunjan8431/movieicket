import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class Student
{
	private int sid;
	private String sname;
	
	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	@Override
	public int hashCode() {
		return Objects.hash(sid, sname);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return sid == other.sid && Objects.equals(sname, other.sname);
	}
	

	public static void main(String[] args) {
		Student s=  new Student();
		s.setSid(1);
		s.setSname("gunjan");
		
		Student s1=new Student();
		s1.setSid(2);
		s1.setSname("kanchan");
		
		Student s2=new Student();
		s2.setSid(3);
		s2.setSname("kathale");
		
		Student s3=new Student();
		s3.setSid(4);
		s3.setSname("oops");
		
		Student s4=new Student();
		s4.setSid(4);
		s4.setSname("oops");
		
		
		//************
	//collection concept	
		//Student e[] =new Student[3];
		
	List<Student> l=new ArrayList<>();
		
		l.add(s);
		l.add(s1);
	    l.add(s2);
	    l.add(s3);
		l.add(s4);
		
		
		
		for (Student stu : l) {
			System.out.println("sid :"+ stu.getSid());
			System.out.println("sname :"+stu.getSname());
		}
		
		
		
		
		System.out.println("******set*********");
		Set<Student>f=new HashSet<>();
		f.add(s4);
		f.add(s3);
		for (Student student : f) {
			System.out.println(student.getSid());
			System.out.println(student.getSname());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		//Map<Integer, Character> swapped = charCount.entrySet().stream()
				      //      .collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey));
		
		
		
		
		
		
		
		
		
		
		
		
//		
//		l.add(1);
//		l.add(4);
//		l.add(1);
//		l.add(6);
//		l.add(7);
//		l.add(8); //[0,1,2,3,4,5]
//		l.add(7);
		System.out.println();
		System.out.println(l);
		
		
		List<Integer>l1 =new LinkedList<>();
		l1.add(4);
		l1.add(50);
		l1.add(50);
		l1.add(4);
		l1.add(1);
		System.out.println(l1);
		System.out.println(l1.get(1));
	}
}
//1 insertion order maintain
//2 duplicate allowed

