public class BancoDigital 
{
    public static void main(String[] args) 
    {
        Cliente cliente1 = new Cliente("Paulo Rabelo", "123.456.789-00");
        Cliente cliente2 = new Cliente("Bruna Rabelo", "987.654.321-00");

        ContaCorrente cc1 = new ContaCorrente(1001, 12345);
        ContaPoupanca cp1 = new ContaPoupanca(1001, 54321);

        cliente1.setContaCorrente(cc1);
        cliente1.setContaPoupanca(cp1);

        cc1.depositar(500);
        cp1.depositar(300);

        System.out.println("Saldo Conta Corrente Paulo: " + cc1.getSaldo());
        System.out.println("Saldo Conta Poupança Paulo: " + cp1.getSaldo());

        cc1.sacar(100);
        cp1.sacar(50);

        System.out.println("Saldo Conta Corrente Paulo após saque: " + cc1.getSaldo());
        System.out.println("Saldo Conta Poupança Paulo após saque: " + cp1.getSaldo());

        ContaCorrente cc2 = new ContaCorrente(1002, 67890);
        cliente2.setContaCorrente(cc2);

        cc1.transferir(200, cc2);

        System.out.println("Saldo Conta Corrente Paulo após transferência: " + cc1.getSaldo());
        System.out.println("Saldo Conta Corrente Bruna após receber transferência: " + cc2.getSaldo());
    }
}
