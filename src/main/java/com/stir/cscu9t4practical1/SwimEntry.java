package com.stir.cscu9t4practical1;

   public class SwimEntry extends Entry {


	   
   private String where;


   
   
   public SwimEntry (String n, int d, int m, int y, int h, int min, int s, float dist, String whe) {

   super( n, d, m, y, h, min, s, dist); 
   this.where=whe;
}

   
   
   public String getpool() {
	
	return where;	
}
   public void setpool(String whe) {
this.where= whe;
}

   
   
	 public String getEntry () {
		   String result = getName()+" ran " + getDistance() + " km in "
		             +getHour()+":"+getMin()+":"+ getSec() + " on "
		             +getDay()+"/"+getMonth()+"/"+getYear()+"\n"+getpool()+ ":";
		   return result;
		  } 
	

}