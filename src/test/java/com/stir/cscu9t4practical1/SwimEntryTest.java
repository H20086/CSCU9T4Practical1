package com.stir.cscu9t4practical1;

public class SwimEntry extends Entry{
	
private boolean pool;
	
	public SwimEntry(String n, int d , int m , int y , int min , int h , int s , float dist, boolean pool)
	 {
		super (n,d,m,y,h,min,s,dist);
		this.pool= pool;
	}
	
	public boolean getpool()
	{
		return pool;
	}
	
	public String getEntry()
	{
		String result = getName()+" ran " + getDistance() + "km in" +
	            getHour()+":"+ getMin()+":"+getSec()+"on"
				+getDay()+"/"+getMonth()+"/"+getYear()+""+getpool()+"";
		return result;
				
	}

}
