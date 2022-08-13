import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class B {
	public void m1() throws InvaidAgeException 
	
	{
		Voter v=new Voter();
		v.setVoterage(15);
		if(v.getVoterage()>18)
		{
			System.out.println("he can vote");
		}
		else
		{
			throw new InvaidAgeException("tu allowed nahi voting sati");
		}
		
	}

}
