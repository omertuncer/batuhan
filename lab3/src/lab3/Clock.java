package lab3;


public class Clock {
	private String hours;
	private String minute;
	public Clock(String hours, String minute) {
		
		this.hours = hours;
		this.minute = minute;
	}
	public String getHours() {
		return hours;
	}
	public void setHours(String hours) {
		this.hours = hours;
	}
	public String getMinute() {
		return minute;
	}
	public void setMinute(String minute) {
		this.minute = minute;
	}
	public String Display(){
		return "hour: "+this.hours+" minute: "+this.minute;
	}
	public String convert(){
		int hour=Integer.parseInt(hours);
		if(hour>12){
			
			hour=hour-12;
			return "Hour: "+String.valueOf(hour)+" m�nute: "+minute+" pm";
		}
		else{
			return "Hour: "+hours+" m�nute: "+minute+" am";
		}
		
		
	}
	

}
