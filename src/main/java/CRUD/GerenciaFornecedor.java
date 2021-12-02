package CRUD;

import ENTIDADES.Fornecedor;
import ENTIDADES.PessoaFisica;
import java.util.Scanner;

public class GerenciaFornecedor {

    Scanner sc;
    Fornecedor fr;
    private Fornecedor frn[];

    public GerenciaFornecedor(Fornecedor frnd[]) {
        frn = frnd;
        sc = new Scanner(System.in);
    }

    public void cadastrofornecedor() {
        int i = 0;
        String RazaoSocial, nomeFantasia, inscricaoEstadual, cnpj, telefone, email = "";
        while ((i < frn.length) && (frn[i] != null)) {
            i++;
        }
        if (i < frn.length) {
            System.out.println("*----");
            System.out.println("RAZÃO SOCIAL: ");
            RazaoSocial = sc.nextLine();
            System.out.println("NOME FANTASIA: ");
            nomeFantasia = sc.nextLine();
            System.out.println("INSCRIÇÃO ESTADUAL: ");
            inscricaoEstadual = sc.nextLine();
            System.out.println("CNPJ: ");
            cnpj = sc.nextLine();
            System.out.println("EMAIL: ");
            cnpj = sc.nextLine();
            System.out.println("TELEFONE: ");
            telefone = sc.nextLine();
            frn[i] = new Fornecedor(RazaoSocial, nomeFantasia, inscricaoEstadual, cnpj, email, telefone);
        } else {
            System.out.println("Vetor cheio.");
        }
    }

    public void alterarfornedor() {
        int pos, resp;
        String RazaoSocial, nomeFantasia, inscricaoEstadual, cnpj, email, telefone = "";

        System.out.println("--==[Alteração Fornecedor]==--");
        System.out.println("Qual posição deseja alterar? ");
        pos = sc.nextInt();
        sc.skip("\n");
        if (frn[pos] != null) {
            System.out.println("-=[Dados]=-");
            System.out.println("Razao Social atual: " + frn[pos].getRazaoSocial());
            System.out.println("Alterar? (1-SIM/2-NÃO)");
            resp = sc.nextInt();
            sc.skip("\n");
            if (resp == 1) {
                System.out.println("Digite o novo Razao Social: ");
                RazaoSocial = sc.nextLine();
                frn[pos].setRazaoSocial(RazaoSocial);
            }
            System.out.println("Nome Fantasia Atual: " + frn[pos].getNomeFantasia());
            System.out.println("Alterar? (1-SIM/2-NÃO)");
            resp = sc.nextInt();
            sc.skip("\n");
            if (resp == 1) {
                System.out.println("Digite novo Nome Fantasia:");
                nomeFantasia = sc.nextLine();
                frn[pos].setNomeFantasia(nomeFantasia);
            }
            System.out.println("Inscrição Estadual  Atual: " + frn[pos].getInscricaoEstadual());
            System.out.println("Alterar? (1-Sim/2-Não");
            resp = sc.nextInt();
            sc.skip("\n");
            if (resp == 1) {
                System.out.println("Digite nova Inscrição Estadual:");
                inscricaoEstadual = sc.nextLine();
                frn[pos].setInscricaoEstadual(inscricaoEstadual);
            }
            System.out.println("C.N.P.J Atual: " + frn[pos].getCnpj());
            System.out.println("Alterar? (1-SIM/2-NÃO)");
            resp = sc.nextInt();
            sc.skip("\n");
            if (resp == 1) {
                System.out.println("Digite novo C.N.P.J:");
                cnpj = sc.nextLine();
                frn[pos].setCnpj(cnpj);

            }
            System.out.println("Email Atual: " + frn[pos].getEmail());
            System.out.println("Alterar? (1-SIM/2-NÃO)");
            resp = sc.nextInt();
            sc.skip("\n");
            if (resp == 1) {
                System.out.println("Digite o novo Email:");
                email = sc.nextLine();
                frn[pos].setEmail(email);
            }
            System.out.println("Telefone Atual: " + frn[pos].getTelefone());
            System.out.println("Alterar? (1-SIM/2-NÃO)");
            resp = sc.nextInt();
            sc.skip("\n");
            if (resp == 1) {
                System.out.println("Digite o novo Telefone:");
                telefone = sc.nextLine();
                frn[pos].setTelefone(telefone);
            }
        }
    }

    public void consultar() {
        int pos;
        System.out.println("--==[Consulta de Fornecedor]==--");
        System.out.println("Qual posição deseja consultar? ");
        pos = sc.nextInt();
        sc.skip("\n");
        if (frn[pos] != null) {
            System.out.println("-=[Dados do Forneceddor ]=-");
            frn[pos].imprimir();
        } else {
            System.out.println(" Fornecedor  não existe.");
        }
    }

    public void excluir() {
        int pos, resp;
        System.out.println("--==Excluir==--");
        System.out.println("Qual posição deseja excluir?");
        pos = sc.nextInt();
        sc.nextInt();
        if (frn[pos] != null) {
            System.out.println("-= Dados Fornecedor ==--");
            frn[pos].imprimir();
            System.out.println("Deseja excluir?");
            resp = sc.nextInt();
            if (resp == 1) {
                frn[pos] = null;
                System.out.println("Exclusão efetuada!");
            } else {
                System.out.println("Exclusão não efetuada!");
            }

        }
    }

    public void relatorio() {
        int pos = 0;
        System.out.println("--== Relatório do Fornecedor ==--");
        while (pos < frn.length) {
            if (frn[pos] != null) {
                frn[pos].imprimir();
                System.out.println("*-------------*");
            }
            pos++;
        }
    }

}
