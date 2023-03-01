package ua.lviv.lgs.task1;

public class Cat extends Pet {
	public Cat(String name) {
		super(name);
	}

	@Override
	void voice() {
		System.out.println("Я " + super.getName() + " - Мяууу-Мяууу");
	}
}
