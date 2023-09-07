package Chapter23TaskWithInterface;

public class Driver {
	public static void main(String[] args) {
		
		CalciVer1Imp c1=new CalciVer1Imp();
		System.out.println(c1.add(10, 20));
		System.out.println(c1.sub(0, 0));
		System.out.println(c1.power(2,3));
		
		System.out.println("---------------------");
		
		CalciVer2Imp c2=new CalciVer2Imp();
		c2.add(0, 0);
		c2.sub(0, 0);
		c2.square(0);
		c2.cube(0);
		
	
	}

}
