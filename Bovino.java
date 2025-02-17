package Trabalho;

public class Bovino extends Animal {

    public Bovino(String nome, int idade, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
        this.imc = (getPeso() / (getAltura() * getAltura()));
        this.totAguaDiaria = getPeso() * AGUA_POR_QUILO;
    }

    @Override
    public void alimentar() {
        setPeso(getPeso() + UMA_MEDIDA_ALIMENTAR);
    }

    @Override
    public void hidratar(Reservatorio reservatorio) {
        if (reservatorio.getCapacidadeAtual() >= UMA_MEDIDA_AGUA) {
            reservatorio.setCapacidadeAtual(reservatorio.getCapacidadeAtual() - UMA_MEDIDA_AGUA);
            setAguaDiariaAtual(getAguaDiariaAtual() + UMA_MEDIDA_AGUA);
        } else {
            System.out.println("ERRO: CAPACIDADE DO RESERVATÓRIO INSUFICIENTE");
        }
    }

    @Override
    public void monitorarSaude() {
        System.out.println("Monitorando saúde do Bovino " + getNome());
        System.out.println("- IMC: " + getImc());
        System.out.println("- Consumo de água: " + getAguaDiariaAtual() + " / " + getTotAguaDiaria());
    }

    @Override
    public void caracteristicas() {
        System.out.println("Características do Bovino:");
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Peso: " + getPeso());
        System.out.println("Altura: " + getAltura());
        System.out.println("IMC: " + getImc());
        System.out.println("Consumo de água diária: " + getTotAguaDiaria());
    }
}
