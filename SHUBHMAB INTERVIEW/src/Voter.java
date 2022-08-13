import java.util.HashMap;

public class Voter {
	public static void main(String[] args) {
		Character [] c1= {'a','b','c','b','a'};
		Character []c2= {'x','x','y','y'};
		HashMap<Character, Integer> m=new HashMap<>();
		for(int i=0;i<c1.length;i++)
		{
			if(m.containsKey(c1[i]))
			{
				int count =m.get(c1[i]);
				m.put(c1[i], ++count);
			}
			
			else
			{
				m.put(c1[i], 1);
			}
		}
		for(int i=0;i<c2.length;i++)
		{
			if(m.containsKey(c2[i]))
			{
				int count =m.get(c2[i]);
				m.put(c2[i], ++count);
			}
			else
			{
				m.put(c2[i], 1);
			}
		}
		
		
		System.out.println(m);
	}
}
