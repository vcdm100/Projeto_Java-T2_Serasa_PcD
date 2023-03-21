class Veiculo {

    private String Marca, Modelo, Cor;
    private int AnoDeFabricacao;

    public Veiculo(String Marca, String Modelo, String Cor, int AnoDeFabricacao) {

        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Cor = Cor;
        this.AnoDeFabricacao = AnoDeFabricacao;

    }

    public void informar() {

        System.out.println("Marca = " + Marca);
        System.out.println("Modelo = " + Modelo);
        System.out.println("Cor = " + Cor);
        System.out.println("Ano de Fabriação = " + AnoDeFabricacao);

    } 
}

class Carro extends Veiculo {

    private int NumeroDePortas;

    public Carro(String Marca, String Modelo, String Cor, int AnoDeFabricacao, int NumeroDePortas) {

        super(Marca, Modelo, Cor, AnoDeFabricacao);

        this.NumeroDePortas = NumeroDePortas; 

    }

    @Override
    public void informar() {

        super.informar();

        System.out.println("Número de Portas = " + NumeroDePortas);
    }
}

class Motocicleta extends Veiculo {
    
    private int Cilindradas;

    public Motocicleta(String Marca, String Modelo, String Cor, int AnoDeFabricacao, int Cilindradas) {

        super(Marca, Modelo, Cor, AnoDeFabricacao);

        this.Cilindradas = Cilindradas; 

    }

    @Override
    public void informar() {

        super.informar();

        System.out.println("Cilindradas = " + Cilindradas);
    }
}
