package Trabalho;

public abstract class Animal {
    protected static final double UMA_MEDIDA_ALIMENTAR = 0.400;
    protected static final double UMA_MEDIDA_AGUA = 0.300;
    protected static final double AGUA_POR_QUILO = 0.030;

    protected String nome;
    protected int idade;
    protected double peso;
    protected double altura;
    protected String tipo;
    protected double imc;
    protected double totAguaDiaria;
    protected double aguaDiariaAtual;

    public abstract void alimentar();
    public abstract void hidratar(Reservatorio reservatorio);
    public abstract void monitorarSaude();
    public abstract void caracteristicas();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }

    public double getTotAguaDiaria() {
        return totAguaDiaria;
    }

    public void setTotAguaDiaria(double totAguaDiaria) {
        this.totAguaDiaria = totAguaDiaria;
    }

    public double getAguaDiariaAtual() {
        return aguaDiariaAtual;
    }

    public void setAguaDiariaAtual(double aguaDiariaAtual) {
        this.aguaDiariaAtual = aguaDiariaAtual;
    }
}
