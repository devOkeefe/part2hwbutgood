package hw2part2;
import java.util.*;
public class part2 {
	public static void main(String[] args) {
		Sphere s= new Sphere(2.5);
		Circle c = new Circle(2);
		Cube b = new Cube (2, 3.45 ,4);
		s.print();
		c.print();
		b.print();	
		}
}
interface Shape{
	public double surface();
	public double volume();
}

interface Print{
	public void print();
}
class Sphere implements Shape,Print{
	private double radius;
	public Sphere(double r) {
		radius=r;
	}
	public double surface() {
		return 12.7*radius*radius;
	}
	public double volume() {
		return 4.2*radius*radius*radius;
	}
	public void print() {
		System.out.println("radius:"+radius+" surface:"+surface()+" volume:"+volume());
	}
}
class Cube implements Shape,Print{
	private double height;
	private double length;
	private double width;
	public Cube(double h, double l, double w) {
		height=h;
		length=l;
		width=w;
	}
	public double surface() {
		return 2*(length*width+length*height+width*length);
	}
	public double volume() {
		return length*width*height;
	}
	public void print() {
		System.out.println("height:"+height+" length:"+length+" width:"+width+" surface:"+surface()+" volume:"+volume());
	}
	
}
class Circle extends Sphere{
	private double radius;
	public Circle(double r) {
		super(r);
		radius=r;
	}
	public double surface() {
		return 6.28*radius;
	}
	public double volume() {
		return 3.14*radius*radius;
	}
	public void print() {
		System.out.println("radius:"+radius+" perimeter:"+surface()+" area:"+volume());
	}
}


