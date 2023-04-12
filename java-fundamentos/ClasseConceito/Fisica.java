public class Fisica extends Pessoa {

    public String cpf;
    public String identidade;

    @Override
    public String toString() {
        return "Nome: " + nomePessoa + "\n cpf=" + cpf + "\n identidade=" + identidade + "\n Situação: " + situacaoPessoa;
    }

    
}