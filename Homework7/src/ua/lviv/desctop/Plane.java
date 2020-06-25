package ua.lviv.desctop;

public abstract class Plane {

	double width;
	double height;
	double mass;

	void engineStart() {
		System.out.println("To starting left: " + ((Math.random() * 69 + 20)) + " seconds");
	}

	void planeUp() {
		System.out.println("The distance with full tank: " + (Math.random() * 101) + " kilometers");
	}

	void planeDown() {
		System.out.println("The plane is going to down");
	}

	public Plane(double width, double height, double mass) {
		super();
		this.width = width;
		this.height = height;
		this.mass = mass;
	}
}
