package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
//import org.hibernate.sql.ordering.antlr.Factory;
import beans.Student;

public class Fetch
{
public static void main(String[] args)
{
//	Student s=new Student();
//	s.setId(3);
//	s.setEmail("dhanush206@gmail.com");
//	s.setMarks(900);
//	s.setName("Sagooo");

	// s object state is transient here 
	
	Configuration cfg=new Configuration();
	
	cfg.configure("resources/hibernate.cfg.xml");
	SessionFactory sf=cfg.buildSessionFactory();
	Session ss=sf.openSession();
	Transaction t=ss.beginTransaction();
	Object o=ss.load(Student.class,3);
	Student s=(Student)o;
	System.out.println(s.getEmail());
	//s.setName("Siyam");
	
	//System.out.println("Before Flushing");
	//Transaction t=ss.beginTransaction();
	
	//ss.flush();
	//int pk=(int) ss.save(s);
	//System.out.print(pk);
	// Student object state is persistent here
	//System.out.println("After Flushing");
	//Transaction t=ss.beginTransaction();
	//System.out.println("Before Commit");

	
	//s.setName("Siyam");
 //ss.save(s);
// System.out.println("After Saving");
// ss.flush();
 t.commit();
 //s.setName("Siyam");
 Transaction t1=ss.beginTransaction();
 //ss.update(s);
 t1.commit();
	//t.commit();
	// Student object moves to the DataBase and it attains permanent Storage
	//System.out.println("After Commiting");
	//ss.flush();
	
	//ss.evict(s);
	//Here Student object will  be removed from persistent state and gc collects object
	ss.close();
//	Session session = sf.openSession();
//	Object o= (Student)session.load(Student.class, new Integer (1));
//	System.out.println(((Student) o).getName());
sf.close();
}
}
