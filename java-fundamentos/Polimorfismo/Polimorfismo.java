public class Polimorfismo {
    public static void main(String[] args) {

        Mamifero elefante = new Elefante();
        System.out.println("\nCota diária de leito do Elefante: " + elefante.cotaDiariaLeite());


        Mamifero rato = new Rato();
        System.out.println("Cota diária de leito do Rato: " + rato.cotaDiariaLeite());

        
        
    }    
}