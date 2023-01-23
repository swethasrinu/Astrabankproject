package Oops.Abstract;

public  abstract class hp implements laptop{
	
	public void keyboard() {
		System.out.println("keyboard");
	}
	
	public void mouse() {
		System.out.println("mouse");
	}
	
	
	abstract public void speaker();
	abstract public void monitor();
	

}
