package ua.lviv.lgs.task1;

public class Cow extends Pet {

	public Cow(String name) {
		super(name);
	}

	@Override
	void voice() {
		System.out.println("Я " + super.getName() + " - Мууу-Мууу");
	}

}
