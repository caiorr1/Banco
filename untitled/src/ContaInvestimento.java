public class ContaInvestimento extends Conta {

    private double taxaRendimento;
    private double taxaIOF;

    public ContaInvestimento(int numero, double taxaRendimento, double taxaIOF) {
        super(numero, TipoConta.INVESTIMENTO);
        this.taxaRendimento = taxaRendimento;
        this.taxaIOF = taxaIOF;
    }

    @Override
    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor + taxaIOF > saldo) {
            throw new SaldoInsuficienteException();
        }
        saldo -= valor + taxaIOF;
    }

    public void renderJuros() {
        saldo += saldo * taxaRendimento;
    }

    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }

    public double getTaxaIOF() {
        return taxaIOF;
    }

    public void setTaxaIOF(double taxaIOF) {
        this.taxaIOF = taxaIOF;
    }

}
