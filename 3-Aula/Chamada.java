/*
 * Objeto do tipo Chamada
 * propriedades Alunos, presenca, numero
 * metodos marcarPresenca, marcarFalta, adicionarAluno
 */

class Chamada {
    Aluno aluno;
    boolean presenca = false;
    int numero;

    public void marcarPresenca() {
        presenca = true;
    }

    public void marcarFalta() {
        presenca = false;
    }

    public void adicionarAluno(String nomeCompleto, int idade) {
        aluno = new Aluno(nomeCompleto, idade);
    }

}
