package Trabalho;

public class Bovino extends Animal {

	public Bovino(String nome, int idade, double peso, double altura) {
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
		this.altura = altura;
		this.imc = (getPeso() / (getAltura() * getAltura()));
		this.totAguaDiaria = getPeso() * getAGUA_POR_QUILO();
	}

}
