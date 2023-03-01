package ua.lviv.lgs.task1;

public class Main {
	public static void main(String[] args) {

		Cat cat = new Cat("Кіт");
		Dog dog = new Dog("Пес");
		Cow cow = new Cow("Корова");
		cat.voice();
		dog.voice();
		cow.voice();
	}
}
