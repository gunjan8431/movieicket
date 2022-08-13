import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;

public class A {
	
public static void main(String[] args)  
{
	B b=new B();
	try {
	b.m1();
	}
	catch (InvaidAgeException e) {
		System.out.println(e.getMessage());;
	}
}




}
