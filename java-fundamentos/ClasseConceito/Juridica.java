public class Juridica extends Pessoa {

    public String cnpj;
    public String inscSocial;
    @Override
    public String toString() {
        return "Nome: " + nomePessoa + "\nCnpj: " + cnpj + "\nSituação: " + situacaoPessoa;
    }
}
