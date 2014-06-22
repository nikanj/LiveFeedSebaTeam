package controllers;


public class Main {
	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			long number = (long) Math.floor(Math.random() * 9000000L) + 1000000L;
			System.out.println(number);
		}
	}
}
