public class Hitter 
{

	//instance variables
	private String name;
	private double avg;
	
	
	
	//full constructor
	public Hitter(String name) 
	{
		this.name = name;
		avg = average();
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
	public String toString() 
	{ 
		String str = "Name: " + name + "Average: " + avg;
		return str;
	}
}