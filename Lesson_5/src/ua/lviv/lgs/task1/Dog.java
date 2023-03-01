package ua.lviv.lgs.task1;

public class Dog extends Pet {

	public Dog(String name) {
		super(name);
	}

	@Override
	void voice() {
		System.out.println("Я " + super.getName() + " - Гаууу-Гаууу");

	}

}
