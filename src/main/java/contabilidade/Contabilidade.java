package contabilidade;

import CRUD.GerenciaFornecedor;
import CRUD.GerenciaPFisica;
import CRUD.GerenciaPJuridica;
import ENTIDADES.Fornecedor;
import ENTIDADES.PessoaFisica;
import ENTIDADES.PessoaJuridica;
import java.util.Scanner;

public class Contabilidade {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int resposta;
        PessoaFisica pessfis[] = new PessoaFisica[100];
        PessoaJuridica pesspj[] = new PessoaJuridica[100];
        Fornecedor forn[] = new Fornecedor[100];

        GerenciaPFisica gpf = new GerenciaPFisica(pessfis);
        GerenciaPJuridica cj = new GerenciaPJuridica(pesspj);
        GerenciaFornecedor gf = new GerenciaFornecedor(forn);

        do {
            System.out.println("*------------------------*");
            System.out.println("CONTABILIDADE");
            System.out.println(" 1 - PESSOA FÍSICA");
            System.out.println(" 2 - PESSOA JURIDICA");
            System.out.println(" 3 - FORNECEDOR");
            System.out.println(" 4 - SAIR ");
            resposta = sc.nextInt();

            switch (resposta) {
                case 1:
                    System.out.println(" * --- PESSOA FÍSICA --- *");
                    System.out.println(" 1 - CADASTRO");
                    System.out.println(" 2 - ALTERAR");
                    System.out.println(" 3 - CONSULTAR");
                    System.out.println(" 4 - EXCLUIR");
                    System.out.println(" 5 - GERAR RELATORIO");
                    System.out.println(" 6 - SAIR");
                    resposta = sc.nextInt();

                    switch (resposta) {
                        case 1:
                            gpf.cadastrofisico();
                            break;
                        case 2:
                            gpf.alterarfisica();
                            break;
                        case 3:
                            gpf.consultar();
                            break;
                        case 4:
                            gpf.excluir();
                            break;
                        case 5:
                            gpf.relatorio();
                            break;
                        default:
                            break;
                    }
                    break;

                case 2:
                    System.out.println(" * --- PESSOA JURIDICA --- *");
                    System.out.println(" 1 - CADASTRO");
                    System.out.println(" 2 - ALTERAR");
                    System.out.println(" 3 - CONSULTAR");
                    System.out.println(" 4 - EXCLUIR");
                    System.out.println(" 5 - GERAR RELATORIO");
                    System.out.println(" 6 - SAIR");
                    resposta = sc.nextInt();

                    switch (resposta) {
                        case 1:
                            cj.cadastrojuridico();
                            break;
                        case 2:
                            cj.alterarjuridica();
                            break;
                        case 3:
                            cj.consultar();
                            break;
                        case 4:
                            cj.excluir();
                            break;
                        case 5:
                            cj.relatorio();
                            break;
                        default:
                            break;
                    }
                    break;
                case 3:

                    System.out.println(" * --- FORNECEDOR --- *");
                    System.out.println(" 1 - CADASTRO");
                    System.out.println(" 2 - ALTERAR");
                    System.out.println(" 3 - CONSULTAR");
                    System.out.println(" 4 - EXCLUIR");
                    System.out.println(" 5 - GERAR RELATORIO");
                    System.out.println(" 6 - SAIR");
                    resposta = sc.nextInt();

                    switch (resposta) {
                        case 1:
                            gf.cadastrofornecedor();
                            break;
                        case 2:
                            gf.alterarfornedor();
                            break;
                        case 3:
                            gf.consultar();
                            break;
                        case 4:
                            gf.excluir();
                            break;
                        case 5:
                            gf.relatorio();
                            break;
                        default:
                            break;
                    }
                    break;
            }

        } while (resposta != 4);

    }

}
