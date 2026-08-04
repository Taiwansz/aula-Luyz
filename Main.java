public class Main {
    public static void main(String[] args) {
        
        // instanciando a conta
        ContaBancaria c1 = new ContaBancaria("Maria Silva", "12345-6", "0001", "123.456.789-00");

        // exibindo os dados do cliente
        System.out.println("--- Dados do Cliente ---");
        System.out.println("Titular: " + c1.titular);
        System.out.println("Numero da Conta: " + c1.numeroConta);
        System.out.println("Agencia: " + c1.agencia);
        System.out.println("CPF: " + c1.cpf);
        System.out.println("Saldo: R$ " + c1.saldo);
        System.out.println("------------------------");

        // testando depositar
        c1.depositar(500);
        System.out.println("Saldo atual: R$ " + c1.saldo);

        // testando sacar
        c1.sacar(200);
        System.out.println("Saldo atual: R$ " + c1.saldo);
    }
}
