package oop.inheritance.polymorphism.ex1;

public class Staff extends User {
	public void printUserType() {
		System.out.println("Staff");
	}
	public void postAReview() {
		System.out.println("Staff: Post a review");
	}
}
