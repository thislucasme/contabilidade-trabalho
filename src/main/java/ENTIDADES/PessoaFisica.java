package ENTIDADES;

public class PessoaFisica extends Pessoa{

    String nome, cpf, endereco, telefone, rg;

    public PessoaFisica(int id, String nome, String endereco, String telefone, String cpf, String rg){
        super(id, nome, endereco, telefone);
        this.cpf = cpf;
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    
    public void imprimir(){
         System.out.println("C.P.F. : "+cpf);
    }
}
