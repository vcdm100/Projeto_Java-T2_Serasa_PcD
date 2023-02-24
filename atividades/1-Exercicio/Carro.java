/*
 * Exercício 01
 * 
 * Variáveis: Marca, Modelo, AnoFabricacao e VelocidadeAtual.
 * Métodos: Acelera, Frear e Imprimir informações.
 */

/*
 * import java.util.Scanner;
*/

class Carro {

    String marca, modelo;
    int AnoFabricacao, VelocidadeAtual;

    public void acelerar() {
        VelocidadeAtual += 10;
    }

    public void frear() {
        VelocidadeAtual -= 10;
    }

    public void imprimirInformacoes() {
        System.out.println("Marca do seu carro: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano de fabricação: " + AnoFabricacao);
        System.out.println("Velocidade atual: " + VelocidadeAtual + " Km/h");

    }

}
class ExercicioCarro {
    public static void main (String[] args) {
        Carro meuCarro = new Carro();

        meuCarro.marca = "Toyota";
        meuCarro.modelo = "Corolla";
        meuCarro.AnoFabricacao = 2021;

        meuCarro.acelerar();
        meuCarro.acelerar();
        meuCarro.acelerar();
        meuCarro.acelerar();
        meuCarro.frear();
        meuCarro.acelerar();
        meuCarro.acelerar();
        meuCarro.frear();

        meuCarro.imprimirInformacoes();

    }
}

/* public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual é a marca do seu carro: ");
        String marca = scanner.next();

        System.out.println("Qual o modelo: ");
        String modelo = scanner.next();

        System.out.println("Qual é o ano de fabricação: ");
        int AnoFabricacao = scanner.nextInt();

        System.out.println("Digite a velocidade atual em Km/h: ");
        int VelocidadeAtual = scanner.nextInt();

        if (VelocidadeAtual >= 10) {
            System.out.println("Diminuir a velocidade!");
        }
        if (VelocidadeAtual < 10) {
            System.out.println("Acelerar a velocidade!");
        }
        
        System.out.println("Informações do seu carro: " + marca + ", " + modelo + ", " + AnoFabricacao + " e " + VelocidadeAtual + " Km/h");

        scanner.close();
    }*/