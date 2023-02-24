/*
 * Exercício 02
 * 
 * Variáveis: NumeroDaConta, Titular, Saldo, LimiteDeSaque.
 * Métodos: Depósito, Saque e Imprimir informações.
 *  
 */

class ContaBancaria {

    String NumeroDaConta, Titular;
    double Saldo, LimiteDeSaque;

    public void deposito(double valor) {

        Saldo += valor;

    }

    public void saque(double valor) {

        Saldo -= valor;

        if (valor <= LimiteDeSaque) {
            System.out.println("Valor de saque realizado excede o limite permitido!");
        } 
        
        if (valor > LimiteDeSaque) {
            System.out.println("Saldo insuficiente para realizar o saque!");
        }

    }

    public void imprimirInformacoes() {

        System.out.println("Número da Conta: " + NumeroDaConta);
        System.out.println("Titular: " + Titular);
        System.out.println("Saldo: R$ " + Saldo);
        System.out.println("Limite de Saque: R$ " + LimiteDeSaque);

    }
}

class ExercicioConta {

    public static void main (String[] args) {
        ContaBancaria MinhaConta = new ContaBancaria();

        MinhaConta.NumeroDaConta = "12345-6";
        MinhaConta.Titular = "João da Silva";
        MinhaConta.Saldo = 1000;
        MinhaConta.LimiteDeSaque = 1500;

        MinhaConta.deposito(500);
        MinhaConta.saque(200);

        MinhaConta.imprimirInformacoes();

    }
}