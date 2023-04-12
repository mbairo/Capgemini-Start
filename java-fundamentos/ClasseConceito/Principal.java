public class Principal {

    public static void main(String[] args) {
        // Pessoa pessoa = new Pessoa();

        Fisica fisica = new Fisica();
        
        fisica.nomePessoa = "Marcos Bairo";
        fisica.cpf = "123123";
        fisica.identidade = "2342512111";
        fisica.situacaoPessoa = "A";
    
        Juridica juridica = new Juridica();
        
        juridica.nomePessoa = "Nome da Empresa";
        juridica.cnpj = "651231";
        juridica.inscSocial = "1781312311222";
        juridica.situacaoPessoa = "B";

        System.out.println("\n*** Pessoa física ***");
        System.out.println(fisica.toString());

        System.out.println("\n*** Pessoa juridica ***");
        System.out.println(juridica.toString());







        // pessoa.nomePessoa = "Marcos";
        // pessoa.idadePessoa = 32;
        // pessoa.mostraDados(pessoa.nomePessoa, pessoa.idadePessoa);

        // Outro modo de se fazer
        // String nomePessoa = "Marcos";
        // int idadePessoa = 32;
        // pessoa.mostraDados(nomePessoa, idadePessoa);

        // pessoa.setNomePessoa("Marcos Bairo");
        // pessoa.setIdadePessoa(32);

    }
}