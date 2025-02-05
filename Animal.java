package Trabalho;

public class Animal {
	protected double UMA_MEDIDA_ALIMENTAR = 0.400;
	protected double UMA_MEDIDA_AGUA = 0.300;
	protected double AGUA_POR_QUILO = 0.030;
	protected String nome;
	protected int idade;
	protected double peso;
	protected double altura;
	protected String tipo;
	protected double imc;
	protected double totAguaDiaria;
	protected double aguaDiariaAtual;

	public void alimentar() {
		setPeso(getPeso() + 0.400);
	}

	public void hidratar(Reservatorio reservatorio) {
		if (reservatorio.getCapacidadeAtual() >= 0.300) {
			reservatorio.setCapacidadeAtual(reservatorio.getCapacidadeAtual() - 0.300);
			setAguaDiariaAtual(getAguaDiariaAtual() + 0.300);
		} else {
			System.out.println("ERRO: CAPACIDADE DO RESERVATÓRIO INSUFICIENTE");
			;
		}
	}

	public void monitorarSaude() {
		if (getImc() < 18) {
			System.out.println("         ** Monitorando saúde do ANIMAL " + getNome() + " **");
			System.out.println("- IMC: " + getImc() + " (Deficiência nutricional)");
			System.out.println("- Consumo d'água: " + getAguaDiariaAtual() + " / " + getTotAguaDiaria());
		} else if (getImc() >= 18 && getImc() < 22) {
			System.out.println("         ** Monitorando saúde do ANIMAL " + getNome() + " **");
			System.out.println("- IMC: " + getImc() + " (Saudável)");
			System.out.println("- Consumo d'água: " + getAguaDiariaAtual() + " / " + getTotAguaDiaria());
		} else if (getImc() >= 22 && getImc() < 26) {
			System.out.println("         ** Monitorando saúde do ANIMAL " + getNome() + " **");
			System.out.println("- IMC: " + getImc() + " (Acima do peso)");
			System.out.println("- Consumo d'água: " + getAguaDiariaAtual() + " / " + getTotAguaDiaria());

		} else {
			System.out.println("         ** Monitorando saúde do ANIMAL " + getNome() + " **");
			System.out.println("- IMC: " + getImc() + " (Obeso)");
			System.out.println("- Consumo d'água: " + getAguaDiariaAtual() + " / " + getTotAguaDiaria());
		}
	}

	public void caracteristicas() {
		System.out.println("          ** CARACTERÍSTICAS DO BOVINO **");
		System.out.println("Nome: " + getNome());
		System.out.println("Idade: " + getIdade());
		System.out.println("Peso: " + getPeso());
		System.out.println("Altura: " + getAltura());
		System.out.println("Tipo: " + getTipo());
		System.out.println("IMC: " + getImc());
		System.out.println("Consumo de água diária: " + getTotAguaDiaria());

	}

	public double getUMA_MEDIDA_ALIMENTAR() {
		return UMA_MEDIDA_ALIMENTAR;
	}

	public void setUMA_MEDIDA_ALIMENTAR(double uMA_MEDIDA_ALIMENTAR) {
		UMA_MEDIDA_ALIMENTAR = uMA_MEDIDA_ALIMENTAR;
	}

	public double getUMA_MEDIDA_AGUA() {
		return UMA_MEDIDA_AGUA;
	}

	public void setUMA_MEDIDA_AGUA(double uMA_MEDIDA_AGUA) {
		UMA_MEDIDA_AGUA = uMA_MEDIDA_AGUA;
	}

	public double getAGUA_POR_QUILO() {
		return AGUA_POR_QUILO;
	}

	public void setAGUA_POR_QUILO(double aGUA_POR_QUILO) {
		AGUA_POR_QUILO = aGUA_POR_QUILO;
	}

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
