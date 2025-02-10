public class Pitcher 
{
	//instance variables
	private String name;
	private double average;
	
	
	
	public Pitcher(String name) //full constructor
	{ 
		this.name = name;
		this.average = Math.random();
		
	}
	//getters and setters
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public double getAverage() 
	{
		return average;
	}
	public void setAverage(double average) 
	{
		this.average = average;
	}
	//toString function
	@Override
	public String toString() 
	{ 
		String str = "Name: " + name + "Average: " + average;
		return str;
	}
	public boolean Outs() 
	{ 
		return (Math.random() < average);
	}
}
