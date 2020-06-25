package ua.lviv.desctop;

public class Su_27 extends Plane implements SpecialAbilities {

	AirplaneControl a = new AirplaneControl();
	double maxSpeed;
	String color;

	public Su_27() {
		super(20.5, 8.7, 3.6);
		this.maxSpeed = 500.00;
		this.color = "black";
	}

	@Override
	public void turboAcceleration() {

		System.out.println("Turbo speed is : " + (Math.random() * 1500 + 501) + " km/h");
	}

	@Override
	public void stelsTechnology() {
		System.out.println("Plane is invisible " + (Math.random() * 100) + " seconds");

	}

	@Override
	public void nuclearStrike() {
		System.out.println("Plane dumps " + ((int) (Math.random() * 11)) + " nuclear bombs");

	}

	void up() {
		a.moveUp();
	}

	void down() {
		a.moveDown();
		;
	}

	void left() {
		a.moveLeft();
	}

	void right() {
		a.moveRight();
	}
}
