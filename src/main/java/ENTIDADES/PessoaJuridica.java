package ENTIDADES;

public class PessoaJuridica extends Pessoa {

    String nome, cnpj, endereco, telefone;

    public PessoaJuridica(String nome, String cnpj, String endereco, String telefone) {
        super(nome, endereco, telefone);
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("C.N.P.J : " + cnpj);
    }
}
