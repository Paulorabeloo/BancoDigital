public abstract class Conta 
{
    private int agencia;
    private int numero;
    private double saldo;

    public Conta(int agencia, int numero) 
    {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = 0.0;
    }

    public int getAgencia() 
    {
        return agencia;
    }

    public int getNumero() 
    {
        return numero;
    }

    public double getSaldo() 
    {
        return saldo;
    }

    public void depositar(double valor) 
    {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public boolean sacar(double valor)
     {
        if (valor > 0 && saldo >= valor) 
        {
            saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean transferir(double valor, Conta contaDestino) 
    {
        if (this.sacar(valor)) 
        {
            contaDestino.depositar(valor);
            return true;
        }
        return false;
    }
}
