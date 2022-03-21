package desafio.dio;
import java.util.Random;

public abstract class conta implements iConta {



    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected double investimento;





    public conta() {
        this.agencia = conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getInvestimento() {
        return investimento;
    }


    @Override
    public void sacar(double valor) {
        saldo -= valor;

    }

    @Override
    public void depositar(double valor) {
        saldo += valor;

    }

    @Override
    public void transferir(double valor, conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);

    }


    public void investimento(double valor) {
        investimento += valor/11;


    }





    protected void infosComuns() {
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
        System.out.println(String.format("Rendimento dos Investimentos: %.2f", this.investimento));


    }
}
