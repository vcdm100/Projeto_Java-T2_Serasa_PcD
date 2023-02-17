import java.util.Scanner;
class Formulario {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual é nome do Aluno?");
        String nomeAluno = scanner.next();

        System.out.println("Qual é a idade do Aluno?");
        int idade = scanner.nextInt();

        Chamada chamada = new Chamada();
        chamada.adicionarAluno(nomeAluno, idade);

        System.out.println("O aluno " + nomeAluno + " esta presente? ");
        int presenca = scanner.nextInt();

        if (presenca == 1) {
            chamada.marcarPresenca();

        }
        scanner.close();
    }
}
