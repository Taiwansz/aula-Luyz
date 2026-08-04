public class Main {
    public static void main(String[] args) {
        
        // instanciando as contas dos clientes
        ContaBancaria c1 = new ContaBancaria("Matheus Sousa", "12345-6", "0001", "123.456.789-00");
        ContaBancaria c2 = new ContaBancaria("Felipe Pinete", "65432-1", "0001", "987.654.321-11");
        ContaBancaria c3 = new ContaBancaria("Luyz Chavoso", "99999-9", "0002", "555.444.333-22");

        // exibindo os dados do primeiro cliente
        System.out.println("--- Dados do Cliente 1 ---");
        System.out.println("Titular: " + c1.titular);
        System.out.println("Numero da Conta: " + c1.numeroConta);
        System.out.println("Agencia: " + c1.agencia);
        System.out.println("CPF: " + c1.cpf);
        System.out.println("Saldo: R$ " + c1.saldo);
        System.out.println("------------------------");

        // testando depositar na conta do Matheus
        c1.depositar(500);
        System.out.println("Saldo atual de " + c1.titular + ": R$ " + c1.saldo);
        System.out.println();

        // exibindo os dados do segundo cliente
        System.out.println("--- Dados do Cliente 2 ---");
        System.out.println("Titular: " + c2.titular);
        System.out.println("Numero da Conta: " + c2.numeroConta);
        System.out.println("Saldo: R$ " + c2.saldo);
        System.out.println();

        // testando sacar na conta do Felipe
        c2.sacar(300);
        System.out.println("Saldo atual de " + c2.titular + ": R$ " + c2.saldo);
        System.out.println();

        // exibindo os dados do terceiro cliente
        System.out.println("--- Dados do Cliente 3 ---");
        System.out.println("Titular: " + c3.titular);
        System.out.println("Numero da Conta: " + c3.numeroConta);
        System.out.println("Saldo: R$ " + c3.saldo);
        System.out.println();

        // testando depositar na conta do Luyz
        c3.depositar(1000);
        System.out.println("Saldo atual de " + c3.titular + ": R$ " + c3.saldo);
    }
}
