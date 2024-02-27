public abstract class Conta {

    private int numero;
    private TipoConta tipo;
    public double saldo;

    public Conta(int numero, TipoConta tipo) {
        this.numero = numero;
        this.tipo = tipo;
        this.saldo = 0.0;
    }

    public int getNumero() {
        return numero;
    }

    public TipoConta getTipo() {
        return tipo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public abstract void sacar(double valor) throws SaldoInsuficienteException;

}
