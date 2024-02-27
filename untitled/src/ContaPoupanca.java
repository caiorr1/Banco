public class ContaPoupanca extends Conta {

    private double taxaRendimento;

    public ContaPoupanca(int numero, double taxaRendimento) {
        super(numero, TipoConta.POUPANCA);
        this.taxaRendimento = taxaRendimento;
    }

    @Override
    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor > saldo) {
            throw new SaldoInsuficienteException();
        }
        saldo -= valor;
    }

    public void renderJuros() {
        saldo += saldo * taxaRendimento;
    }

}
