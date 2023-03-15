//Classe Pessoa
class Pessoa {
    // visibilidade private
    protected String nome;

    // visibilidade public
    private int idade;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    //Métodos especiais do tipo acessiveis
    public String getNome() {
        return this.nome;
    }

    //Métodos especiais do tipo modificador
    public void setNome (String novoNome) {
        this.nome = novoNome;
    }

    //Quando o método não tem retorno usamos void 
    public void setIdade(int novaIdade) {
        this.idade = novaIdade;
    }

    public int getIdade() {
        return this.idade;
    }
}

//Vamos criar uma class Funcionario que herda de pessoa
class Funcionario extends Pessoa {
    //Metodo Construtor
    public Funcionario() {
        //Super representa o construtor da classe Pai
        super("Victor");
    }
    //Polimorfismo, exemplo a covid e suas variações
    @Override
    public String getNome() {
        return "Funcionario - " + super.nome;
    }
}

public class MyClass {
    public static void main (String args[]) {
        Funcionario novoFuncionario = new Funcionario ();
        novoFuncionario.setNome("Victor");

        System.out.println(novoFuncionario.getNome());
    }
}