package ENTIDADES;

public class Fornecedor {

    String RazaoSocial, nomeFantasia, inscricaoEstadual, cnpj, telefone, email;

    public Fornecedor(String RazaoSocial, String nomeFantasia, String inscricaoEstadual, String cnpj,
            String telefone, String email) {
        this.RazaoSocial = RazaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.inscricaoEstadual = inscricaoEstadual;
        this.cnpj = cnpj;
        this.telefone = telefone;
        this.email = email;
    }

    public String getRazaoSocial() {
        return RazaoSocial;
    }

    public void setRazaoSocial(String RazaoSocial) {
        this.RazaoSocial = RazaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void imprimir() {

        System.out.println("Razão Social: " + RazaoSocial);
        System.out.println("Nome Fantasia: " + nomeFantasia);
        System.out.println("Inscrição Estadual: " + inscricaoEstadual);
        System.out.println("C.N.P.J.: " + cnpj);
        System.out.println("Telefone: " + telefone);
        System.out.println("E-mail: " + email);

    }

}
