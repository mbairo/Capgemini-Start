package Interfaces;

public class InterfaceUso {

	public static void main(String[] args) {

		// Mamífero
		System.out.println("\n *** Mamífero ***");
		Animal animal = new Bovino();
		animal.animalNome();
		animal.animalCategoria();
		animal.animalSom();
		animal.animalComer();

		// Réptil
		System.out.println("\n*** Réptil ***");
		Animal reptil = new Reptil();
		reptil.animalNome();
		reptil.animalCategoria();
		reptil.animalSom();
		reptil.animalComer();
		
	}
}