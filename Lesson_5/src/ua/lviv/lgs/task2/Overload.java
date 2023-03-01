package ua.lviv.lgs.task2;

public class Overload {

	int a;
	double b;
	int c;

	public Overload(int a) {
		this.a = a;

	}

	public Overload(int a, double b) {
		this(a);
		this.b = b;

	}

	public Overload(int a, double b, int c) {
		this(a, b);
		this.c = c;

	}

}
