package lab3;


public class main {

	public static void main(String[] args) {
		point abc=new point(2,1);
		point abc2	=new point(6,4);
		double k=abc.calculation(abc.getX(),abc.getY(), abc2.getX(), abc2.getY());
		System.out.println(abc.display());
		System.out.println(k);
		

	}

}
