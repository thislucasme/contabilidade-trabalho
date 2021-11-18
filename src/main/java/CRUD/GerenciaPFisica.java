package CRUD;

import ENTIDADES.PessoaFisica;
import java.util.Scanner;

public class GerenciaPFisica {

    Scanner sc;
    PessoaFisica pf;
    private PessoaFisica pesf[];

    public GerenciaPFisica(PessoaFisica pesfs[]) {
        pesf = pesfs;
        sc = new Scanner(System.in);
    }

    public void cadastrofisico() {
        int id = 0, i = 0;
        String nome, cpf, endereco, telefone, rg = "";
        while ((i < pesf.length) && (pesf[i] != null)) {
            i++;
        }
        if (i < pesf.length) {
            System.out.println("*----");
            System.out.println("NOME: ");
            nome = sc.nextLine();
            System.out.println("CPF: ");
            cpf = sc.nextLine();
            System.out.println("ENDEREÇO: ");
            endereco = sc.nextLine();
            System.out.println("TELEFONE: ");
            telefone = sc.nextLine();
            pesf[i] = new PessoaFisica(id, nome, endereco, telefone,
                    cpf, rg);
        } else {
            System.out.println("Vetor cheio.");
        }
    }

    public void alterarfisica() {
        int id = 0, pos, resp;
        String nome, cpf, endereco, telefone, rg = "";

        System.out.println("--==[Alteração de Pessoa Física]==--");
        System.out.println("Qual posição deseja alterar? ");
        pos = sc.nextInt();
        sc.skip("\n");
        if (pesf[pos] != null) {
            System.out.println("-=[Dados]=-");
            System.out.println("Nome atual: " + pesf[pos].getNome());
            System.out.println("Alterar? (1-sim/2-não");
            resp = sc.nextInt();
            sc.skip("\n");
            if (resp == 1) {
                System.out.println("Digite o novo nome: ");
                nome = sc.nextLine();
                pesf[pos].setNome(nome);
            }
            System.out.println("C.P.F. Atual: " + pesf[pos].getCpf());
            System.out.println("Alterar? (1-Sim/2-Não");
            resp = sc.nextInt();
            sc.skip("\n");
            if (resp == 1) {
                System.out.println("Digite novo C.P.F.:");
                cpf = sc.nextLine();
                pesf[pos].setCpf(cpf);
            }
            System.out.println("Endereço Atual: " + pesf[pos].getEndereco());
            System.out.println("Alterar? (1-Sim/2-Não");
            resp = sc.nextInt();
            sc.skip("\n");
            if (resp == 1) {
                System.out.println("Digite novo Endereço:");
                endereco = sc.nextLine();
                pesf[pos].setEndereco(endereco);
            }
            System.out.println("Telefone Atual: " + pesf[pos].getTelefone());
            System.out.println("Alterar? (1-Sim/2-Não)");
            resp = sc.nextInt();
            sc.skip("\n");
            if (resp == 1) {
                System.out.println("Digite novo Telefone:");
                telefone = sc.nextLine();
                pesf[pos].setTelefone(telefone);

            }
            System.out.println("Rg Atual: " + pesf[pos].getRg());
            System.out.println("Alterar? (1 - Sim/2 - Não");
            resp = sc.nextInt();
            sc.skip("\n");
            if (resp == 1) {
                System.out.println("Digite o novo Rg:");
                rg = sc.nextLine();
                pesf[pos].setRg(rg);
            }
        }
    }

    public void consultar() {
        int pos;
        System.out.println("--==[Alteração de Pessoa Física]==--");
        System.out.println("Qual posição deseja consultar? ");
        pos = sc.nextInt();
        sc.skip("\n");
        if (pesf[pos] != null) {
            System.out.println("-=[Dados da Pessoa Física]=-");
            pesf[pos].imprimir();
        } else {
            System.out.println(" Pessoa Física não existe.");
        }
    }

    public void excluir() {
        int pos, resp;
        System.out.println("--==Excluir==--");
        System.out.println("Qual posição deseja excluir?");
        pos = sc.nextInt();
        sc.nextInt();
        if (pesf[pos] != null) {
            System.out.println("-=Dados Pessoa Física==--");
            pesf[pos].imprimir();
            System.out.println("Deseja excluir?");
            resp = sc.nextInt();
            if (resp == 1) {
                pesf[pos] = null;
                System.out.println("Exclusão efetuada!");
            }
            System.out.println("Exclusão não efetuada!");
        }
    }

    public void relatorio() {
        int pos = 0;
        System.out.println("--== Relatório de Pessoas Físicas ==--");
        while (pos < pesf.length) {
            if (pesf[pos] != null) {
                pesf[pos].imprimir();
                System.out.println("*-------------*");
            }
            pos++;
        }
    }

}
