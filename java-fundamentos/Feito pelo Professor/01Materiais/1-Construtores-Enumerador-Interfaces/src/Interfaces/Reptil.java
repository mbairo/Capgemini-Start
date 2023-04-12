package Interfaces;

public class Reptil implements Animal{


	@Override
	public void animalNome() {
		System.out.println("Lagarto");
	}

	@Override
	public void animalCategoria() {
		System.out.println("Reptil");
	}

	@Override
	public void animalSom() {
		System.out.println("ssssssss");
	}

	@Override
	public void animalComer() {
		System.out.println("Ovos");	
	}

}