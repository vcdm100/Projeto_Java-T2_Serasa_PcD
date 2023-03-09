// O Exercicio começa a partir da linha 18
// Criar um arquivo com o nome ProgramaPrincipal.java
public class ProgramaPrincipal {
    // Esse código esta correto
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria(1234, "João da Silva");
        ContaBancaria conta2 = new ContaBancaria(5678, "Maria Souza");

        conta1.depositar(1000);
        conta2.depositar(500);

        conta1.sacar(300);
        conta2.sacar(700);

        System.out.println("Saldo da conta 1: " + conta1.obterSaldo());
        System.out.println("Saldo da conta 2: " + conta2.obterSaldo());
    }
}

// Existem 10 erros
class ContaBancaria {
    // Atributos
    private int numeroConta;
    private String nomeTitular;
    private double saldoAtual;

    // Método Construtor
    public Conta(int numeroConta, String nomeTitular) {
        numeroConta = numeroConta;
        nomeTitular = nomeTitular;
    }

    // Métodos
    private String depositar(double valorDeposito) {
        saldoAtual = saldoAtual + valorDeposito;
    }

    private void sacar(double valorSaque) {
        if (valorSaque > saldoAtual) {
            System.out.println("Saldo insuficiente");
        } else {
            saldoAtual = saldoAtual - valorSaque;
        }
    }

    private void obterSaldo() {
        return saldoAtual;
    }
}