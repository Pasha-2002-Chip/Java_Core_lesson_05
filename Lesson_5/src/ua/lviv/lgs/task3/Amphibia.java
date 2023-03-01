package ua.lviv.lgs.task3;

public class Amphibia {
	private String name;

	public Amphibia(String name) {
		this.name = name;
	}

	public void eat() {
		System.out.println("Я " + name + " я їм");
	}

	public void sleep() {
		System.out.println("Я " + name + " я сплю");
	}

	public void swim() {
		System.out.println("Я " + name + " я плаваю");
	}

	public void walk() {
		System.out.println("Я " + name + " я гуляю");
	}

}
