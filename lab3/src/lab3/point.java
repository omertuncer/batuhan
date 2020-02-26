package lab3;


public class point {
	private int x;
	private int y;
	public point(int x, int y) {
		
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public double calculation(int x1,int y1,int x2,int y2){
		double result=0;
		result=Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2);
	
		result=Math.pow(result, 0.5);
		
		return result;
		
	}
	public String display(){
		
		
		return "X: "+String.valueOf(this.getX())+" Y: "+String.valueOf(this.getY());
	}
	

}
