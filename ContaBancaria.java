public class ContaBancaria {
    // atributos
    String titular;
    String numeroConta;
    String agencia;
    String cpf;
    double saldo;

    // construtor
    public ContaBancaria(String titular, String numeroConta, String agencia, String cpf) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.cpf = cpf;
        this.saldo = 1500;
    }

    // metodo depositar
    public void depositar(double valor) {
        saldo = saldo + valor;
        System.out.println("Deposito de " + valor + " realizado!");
    }

    // metodo sacar
    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo = saldo - valor;
            System.out.println("Saque de " + valor + " realizado!");
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }
}
