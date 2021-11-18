package contabilidade;


import CRUD.GerenciaFornecedor;
import CRUD.GerenciaPFisica;
import CRUD.GerenciaPJuridica;
import ENTIDADES.Fornecedor;
import ENTIDADES.PessoaFisica;
import ENTIDADES.PessoaJuridica;
import java.util.Scanner;

public class Contabilidade {

    public static void main(String[] args, PessoaJuridica[] pessjur, Fornecedor[] frnd) {

        Scanner sc = new Scanner(System.in);
        int resposta;
        PessoaFisica pessfis[] = new PessoaFisica[100];
        PessoaJuridica pesspj[] = new PessoaJuridica[100];
        Fornecedor forn[] = new Fornecedor[100];

        GerenciaPFisica gpf = new GerenciaPFisica(pessfis);
        GerenciaPJuridica cj = new GerenciaPJuridica(pessjur);
        GerenciaFornecedor gf = new GerenciaFornecedor(forn);

        // CADASTRO EMPRESAS E PESSOAS FISICAS
        // CADASTRO FORNECEDOR
        // MANIPULAÇÃO DE BOLETO
        do {
            System.out.println("*------------------------*");
            System.out.println("CONTABILIDADE");
            System.out.println(" 1 - CADASTRO");
            System.out.println(" 2 - ALTERAR");
            System.out.println(" 3 - CONSULTAR");
            System.out.println(" 4 - EXCLUIR");
            System.out.println(" 5 - GERAR RELATORIO");
            System.out.println(" 6 - SAIR");
            resposta = sc.nextInt();

            if (resposta == 1) {
                System.out.println("*------------------------*");
                System.out.println(" 1 - PESSOAS FISICAS");
                System.out.println(" 2 - PESSOAS JURIDICAS");
                System.out.println(" 3 - FORNECEDORES");

                resposta = sc.nextInt();

                if (resposta == 1) {
                    gpf.cadastrofisico();
                } else if (resposta == 2) {
                    cj.cadastrojuridico();
                } else if (resposta == 3) {
                    gf.cadastrofornecedor();
                }
            }
            if (resposta == 2) {
                System.out.println("*------------------------*");
                System.out.println(" 1 - PESSOAS FISICAS");
                System.out.println(" 2 - PESSOAS JURIDICAS");
                System.out.println(" 3 - FORNECEDORES");

                resposta = sc.nextInt();

                if (resposta == 1) {
                    gpf.alterarfisica();
                } else if (resposta == 2) {
                    cj.alterarjuridica();
                } else if (resposta == 3) {
                    gf.alterarfornedor();
                }
            }
            if (resposta == 3) {
                System.out.println("*------------------------*");
                System.out.println(" 1 - PESSOAS FISICAS");
                System.out.println(" 2 - PESSOAS JURIDICAS");
                System.out.println(" 3 - FORNECEDORES");

                resposta = sc.nextInt();

                if (resposta == 1) {
                    gpf.consultar();
                } else if (resposta == 2) {
                    cj.consultar();
                } else if (resposta == 3) {
                    gf.consultar();
                }
            }
            if (resposta == 4) {
                System.out.println("*------------------------*");
                System.out.println(" 1 - PESSOAS FISICAS");
                System.out.println(" 2 - PESSOAS JURIDICAS");
                System.out.println(" 3 - FORNECEDORES");

                resposta = sc.nextInt();

                if (resposta == 1) {
                    gpf.excluir();
                } else if (resposta == 2) {
                    cj.excluir();
                } else if (resposta == 3) {
                    gf.excluir();
                }
            }
            if( resposta == 5){
                System.out.println("*------------------------*");
                System.out.println(" 1 - PESSOAS FISICAS");
                System.out.println(" 2 - PESSOAS JURIDICAS");
                System.out.println(" 3 - FORNECEDORES");

                resposta = sc.nextInt();
                
                if (resposta == 1) {
                    gpf.relatorio();
                } else if (resposta == 2) {
                    cj.relatorio();
                } else if (resposta == 3) {
                    gf.relatorio();
                }
            }

        } while (resposta != 6);

    }

}
