package hibernat;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.Service;
import org.hibernate.service.ServiceRegistry;

public class Test {
	
	public static void main(String[] args) {
		
	
    StandardServiceRegistry registry =new StandardServiceRegistryBuilder().configure().build();
	
	MetadataSources mds=new MetadataSources(registry);
	Metadata md=mds.getMetadataBuilder().build();
	SessionFactory sf= md.getSessionFactoryBuilder().build();
	Session ss=sf.openSession();
	Student s=new Student();
	

s.setSname("sjgjsfkgjs");
s.setSid(1000);
ss.save(s);
ss.beginTransaction().commit();
//Student stu=ss.load(Student.class, 2);
//System.out.println(stu.getSname());
//System.out.println(stu.getSid());
//System.out.println(stu.getAddr());
	}
	
	

}
