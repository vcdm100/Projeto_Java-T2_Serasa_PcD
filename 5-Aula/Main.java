/*
 * class Pessoa {
 * 
    private String Nome;
    private int idade;
    public String NomeSocial;

    public String retornarNomeParaAmigo() {
        return Nome;
    }

}

 * public class Main {

    public static void main (String[] args) {
        
        Pessoa pessoa = new Pessoa();
        pessoa.Nome = "Victor";
        pessoa.idade = 24;

    }

}
 */


/*class Aluno {
    public String Nome;
    private float nota;
    boolean aprovado;

    public Aluno (String Nome) {
        this.Nome = Nome;
    }

    public void setNota (float nota) {
        this.nota = nota;
    }

    public float getNota () {
        return this.nota;
    }

public class Main {

    public static void main (String[] args) {

        Aluno aluno = new Aluno("Victor");
        aluno.setNota(10);

        System.out.println(aluno.getNota());
    }

}*/


class Produto {
    String codigo;
    String nome;
    double preco;
    int quantidade;
    private int desconto = 30;

    public Produto(String codigo, String nome, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;

    }

    public double valorComDesconto() {
        return preco * quantidade * (1 - desconto / 100);
    }
}

public class Main {
    
    public static void main(String[] args) {
        
        Produto novoProdutoCoca = new Produto("001", "Coca-Cola", 5.00);
        Produto novoProdutoArroz = new Produto("002", "Arroz", 10.00);
    }

    /*public static void main(String[] args) {

        Array<Produto> produtos = new Array<Produto>();

        produtos.append(
            new Produto("001", "Coca-Cola", 5.00),
            new Produto("002", "Arroz", 10.00),
        )
        
    }*/

}