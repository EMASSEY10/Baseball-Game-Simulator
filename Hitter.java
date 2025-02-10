public class Hitter 
{

	//instance variables
	private final String name;
	private double avg;
	
	
	
	//full constructor
	public Hitter(String name) 
	{
		this.name = name;
		avg = Math.random() / 3;
	}
	//get average function
	
	public double average() 
	{ 
		avg = Math.random()/3;
		return avg;
	}
	//function to determine outs
	//1-hitting average /3
	public boolean Outs() 
	{ 
		if(Math.random() < avg) 
		{ 
			return true;
		}
		else; 
		{ 
			return false;
		}
	}
	@Override
	public String toString() 
	{ 
		String str = "Name: " + name + "Average: " + avg;
		return str;
	}
}
