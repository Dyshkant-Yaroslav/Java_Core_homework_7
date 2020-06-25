package ua.lviv.desctop;

public class AirplaneControl   {
	void moveUp() {
		System.out.println("The plane is moving up on "+(Math.random()*101)+" miles");
	}
	void moveDown() {
		System.out.println("The plane is moving down on "+(Math.random()*101)+" miles");
	}
	void moveLeft() {
		System.out.println("The plane is moving left on "+(Math.random()*101)+" miles");
	}
	void moveRight() {
		System.out.println("The plane is moving right on "+(Math.random()*101)+" miles");
	}
}
