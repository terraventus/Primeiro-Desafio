package desafio.dio;

import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        conta cc = new contaCorrente();
        conta pp = new contaPoupanca();

        cc.investimento (30);
        pp.investimento (50);




        cc.depositar(100);
        cc.transferir(100,pp);

        cc.imprimirExtrato();
        pp.imprimirExtrato();

        Random random = new Random();
        var leitor = new Scanner(System.in);

        System.out.println("Deseja criar uma chave pix? (S/N)");
        char pix = leitor.next().charAt(0);


        if (pix == 's' || pix == 'S') {
            System.out.println(random.nextInt(1000000000));

        } else {
            System.out.println("Chave Pix não gerada");
        }


    }



}
