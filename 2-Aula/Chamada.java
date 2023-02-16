import java.util.Scanner;

public class Chamada {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, informe o seu NOME COMPLETO?");
        String nomeCompleto = scanner.next();
        System.out.println("Seu nome é " + nomeCompleto);
        System.out.println("Por favor, informe a sua IDADE?");
        int idade = scanner.nextInt();
        System.out.println("Sua idade é " + idade);
        
        Aluno aluno = new Aluno(nomeCompleto, idade);
    }
}
