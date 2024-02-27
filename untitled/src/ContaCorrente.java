public class ContaCorrente extends Conta {

    private double taxaSaque;

    public ContaCorrente(int numero, double taxaSaque) {
        super(numero, TipoConta.CORRENTE);
        this.taxaSaque = taxaSaque;
    }

    @Override
    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor + taxaSaque > saldo) {
            throw new SaldoInsuficienteException();
        }
        saldo -= valor + taxaSaque;
    }

}
