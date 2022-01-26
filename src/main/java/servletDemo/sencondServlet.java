package servletDemo;

import java.awt.Color;

public class sencondServlet implements Runnable {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i =0;
		i = i++ + i;
		System.out.println("l =" +i);
		
		//String str = 'gg';
		
		Rectangle r1 = new Rectangle();
		r1.setColor("Color.blue");
		Rectangle r2 = r1;
		r2.setColor("Color.blue");
		
		System.out.println(r1.getColor());
		System.out.println(r2.getColor());
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
	
		System.out.println("running");
		
	}

}

 class Rectangle {

	 private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	 
	
	/*
	 * Thread t= new Thread();
	 * 
	 * t.run();
	 * 
	 * t.run();
	 * 
	 * t.start();
	 */
	
}