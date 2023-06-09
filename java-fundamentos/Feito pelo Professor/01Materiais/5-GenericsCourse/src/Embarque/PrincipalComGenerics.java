package Embarque;
import java.util.Scanner;

import Controle.Aeronaves;
import Controle.AeronavesComGenerics;

/*
 * Informar a quantidade de aeronaves no p�tio, o nr dos v�os por ordem de chegada. 
 * A ordem de decolagem � FIFO, o primeiro que entra � o primeiro que sai. 
 * Mostrar qual o primeiro v�o � decolar
 */
public class PrincipalComGenerics {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		AeronavesComGenerics<Integer> air = new AeronavesComGenerics<>();
		System.out.println("Informe o nr de aeronaves");
		int nrAeronaves = sc.nextInt();
		
		// adicionando voos
		for (int i = 0; i < nrAeronaves; i++) {
			Integer nrVoo = sc.nextInt();
			air.addVoo(nrVoo);
		}
		air.primeiroVoo();
		Integer x = (Integer) air.primeiroVoo();
		System.out.println("O primeiro a decolar � o voo :" + x);
		sc.close();
	}
}