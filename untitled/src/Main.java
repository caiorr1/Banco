import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente(123456, 2.0);
        cc.depositar(10000);

        ContaPoupanca cp = new ContaPoupanca(654321, 0.05);
        cp.depositar(10000);

        ContaInvestimento ci = new ContaInvestimento(123456, 0.05, 0.005);

        ci.depositar(1000.0);

        ci.renderJuros();


        try {
            ci.sacar(500.0);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Saldo da conta investimento: R$" + ci.getSaldo());

        try {
            cc.sacar(100.0);
            cp.sacar(100.0);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }

        List<ContaCorrente> contasCorrentes = new ArrayList<>();

        contasCorrentes.add(new ContaCorrente(789012, 3.0));
        contasCorrentes.add(new ContaCorrente(345678, 1.5));
        contasCorrentes.add(new ContaCorrente(987654, 2.5));

        for (ContaCorrente conta : contasCorrentes) {
            conta.depositar(50000);
        }

        for (ContaCorrente conta : contasCorrentes) {
            System.out.println("Saldo da conta " + conta.getNumero() + ": R$" + conta.getSaldo());
        }

        System.out.println("Saldo da Conta Corrente: R$" + cc.getSaldo());
        System.out.println("Saldo da Conta Poupança: R$" + cp.getSaldo());
    }

}
