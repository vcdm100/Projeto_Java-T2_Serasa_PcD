class Aluno {

    protected String nomeCompleto;
    protected int idade;
    protected char sexo;
    
    public Aluno(String nomeCompleto, int idade) {

        this.nomeCompleto = nomeCompleto;
        this.idade = idade;
    }

    public String getNomeCompleto() {

        return nomeCompleto;

    }

    public int getIdade() {

        return idade;

    }

    public void setNome(String nomeCompleto) {

        this.nomeCompleto = nomeCompleto;

    }

    public void setIdade(int idade) {

        this.idade = idade;
        
    }
}
