// O Exercicio começa a partir da linha 18 - ALUNO: Victor Cláudio Deosdede Moura
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

// 10 erros corrigidos
class ContaBancaria {
    // Atributos
    private int numeroConta;
    private String nomeTitular;
    private double saldoAtual;

    // Método Construtor
    public ContaBancaria(int numeroConta, String nomeTitular) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
    }

    // Métodos
    public void depositar(double valorDeposito) {
        saldoAtual += valorDeposito;
    }

    public void sacar(double valorSaque) {
        if (valorSaque > saldoAtual) {
            System.out.println("Saldo insuficiente");
        } else {
            saldoAtual -= valorSaque;
        }
    }

    public double obterSaldo() {
        return saldoAtual;
    }
}

//Resposta da Terminal

//Saldo insuficiente
//Saldo da conta 1: 700.0
//Saldo da conta 2: 500.0