package Interfaces;

public class Bovino implements Animal {
	
	@Override
	public void animalNome() {
		System.out.println("Boi");
	}

	@Override
	public void animalCategoria() {
		System.out.println("Mamífero");
	}

	@Override
	public void animalSom() {
		System.out.println("Muuuu");
	}

	@Override
	public void animalComer() {
		System.out.println("Capim");	
	}

}