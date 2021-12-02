package CRUD;

import ENTIDADES.PessoaJuridica;
import java.util.Scanner;

public class GerenciaPJuridica {

    Scanner sc;
    PessoaJuridica pj;
    private PessoaJuridica pesj[];

    public GerenciaPJuridica(PessoaJuridica pesjs[]) {
        pesj = pesjs;
        sc = new Scanner(System.in);
    }

    public void cadastrojuridico() {
        int i = 0;
        String nome, cnpj, endereco, telefone;
        while ((i < pesj.length) && (pesj[i] != null)) {
            i++;
        }
        if (i < pesj.length) {
            System.out.println("*----");
            System.out.println("NOME: ");
            nome = sc.nextLine();
            System.out.println("CNPJ: ");
            cnpj = sc.nextLine();
            System.out.println("ENDEREÇO: ");
            endereco = sc.nextLine();
            System.out.println("TELEFONE: ");
            telefone = sc.nextLine();
            pesj[i] = new PessoaJuridica(nome, cnpj, endereco, telefone);
        } else {
            System.out.println("Vetor cheio.");
        }
    }

    public void alterarjuridica() {
        int id = 0, pos, resp;
        String nome, cnpj, endereco, telefone = "";

        System.out.println("--==[Alteração de Pessoa juridica]==--");
        System.out.println("Qual posição deseja alterar? ");
        pos = sc.nextInt();
        sc.skip("\n");
        if (pesj[pos] != null) {
            System.out.println("-=[Dados]=-");
            System.out.println("Nome atual: " + pesj[pos].getNome());
            System.out.println("Alterar? (1-sim/2-não");
            resp = sc.nextInt();
            sc.skip("\n");
            if (resp == 1) {
                System.out.println("Digite o novo nome: ");
                nome = sc.nextLine();
                pesj[pos].setNome(nome);
            }
            System.out.println("C.N.P.J Atual: " + pesj[pos].getCnpj());
            System.out.println("Alterar? (1-Sim/2-Não");
            resp = sc.nextInt();
            sc.skip("\n");
            if (resp == 1) {
                System.out.println("Digite novo C.N.P.J:");
                cnpj = sc.nextLine();
                pesj[pos].setCnpj(cnpj);
            }
            System.out.println("Endereço Atual: " + pesj[pos].getEndereco());
            System.out.println("Alterar? (1-Sim/2-Não");
            resp = sc.nextInt();
            sc.skip("\n");
            if (resp == 1) {
                System.out.println("Digite novo Endereço:");
                endereco = sc.nextLine();
                pesj[pos].setEndereco(endereco);
            }
            System.out.println("Telefone Atual: " + pesj[pos].getTelefone());
            System.out.println("Alterar? (1-Sim/2-Não)");
            resp = sc.nextInt();
            sc.skip("\n");
            if (resp == 1) {
                System.out.println("Digite novo Telefone:");
                telefone = sc.nextLine();
                pesj[pos].setTelefone(telefone);

            }

        }
    }

    public void consultar() {
        int pos;
        System.out.println("--==[Alteração de Pessoa Juridica]==--");
        System.out.println("Qual posição deseja consultar? ");
        pos = sc.nextInt();
        sc.skip("\n");
        if (pesj[pos] != null) {
            System.out.println("-=[Dados da Pessoa Juridica]=-");
            pesj[pos].imprimir();
        } else {
            System.out.println(" Pessoa Juridica não existe.");
        }
    }

    public void excluir() {
        int pos, resp;
        System.out.println("--==Excluir==--");
        System.out.println("Qual posição deseja excluir?");
        pos = sc.nextInt();
        sc.nextInt();
        if (pesj[pos] != null) {
            System.out.println("-=Dados Pessoa Juridica==--");
            pesj[pos].imprimir();
            System.out.println("Deseja excluir?");
            resp = sc.nextInt();
            if (resp == 1) {
                pesj[pos] = null;
                System.out.println("Exclusão efetuada!");
            }
            System.out.println("Exclusão não efetuada!");
        }
    }

    public void relatorio() {
        int pos = 0;
        System.out.println("--== Relatório de Pessoas Juridica ==--");
        while (pos < pesj.length) {
            if (pesj[pos] != null) {
                pesj[pos].imprimir();
                System.out.println("*-------------*");
            }
            pos++;
        }
    }

}
