package ua.lviv.lgs.task1;

public abstract class Pet {

	private String name;

	public Pet(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	abstract void voice();

}
