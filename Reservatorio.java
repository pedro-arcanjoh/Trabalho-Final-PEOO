package Trabalho;

public class Reservatorio {
	private String nome;
	private double capacidadeTotal;
	private SensorNivelAgua sensorNivelAgua;
	private StatusReservatorio statusReservatorio;
	private double capacidadeAtual;

	public Reservatorio(String nome, double capacidadeTotal) {
		this.nome = nome;
		this.capacidadeTotal = capacidadeTotal;
		this.capacidadeAtual = (((double) SensorNivelAgua.gerarNivelAguaAleatorio()) * getCapacidadeTotal()) / (100);
	}

	public double calcularCapacidadeAtual() {
		return capacidadeAtual;
	}

	public StatusReservatorio verificarStatusReservatorio() {
		if ((getCapacidadeAtual() / getCapacidadeTotal()) * 100 < 25) {
			return statusReservatorio.ABASTECER;
		} else if ((getCapacidadeAtual() / getCapacidadeTotal()) * 100 < 50) {
			return statusReservatorio.BAIXO;
		} else if ((getCapacidadeAtual() / getCapacidadeTotal()) * 100 < 75) {
			return statusReservatorio.MEDIO;
		} else if ((getCapacidadeAtual() / getCapacidadeTotal()) * 100 < 100) {
			return statusReservatorio.ALTO;
		} else {
			return statusReservatorio.CHEIO;
		}
	}

	public double adicionarAgua(double litros) {
		if ((getCapacidadeAtual() + litros) > getCapacidadeTotal()) {
			double a = getCapacidadeAtual();
			setCapacidadeAtual(getCapacidadeTotal());
			return getCapacidadeTotal() - a;
		} else {
			setCapacidadeAtual(getCapacidadeAtual() + litros);
			return litros;
		}

	}

	public boolean consumirAgua(double litros) {
		if (getCapacidadeAtual() >= litros) {
			setCapacidadeAtual(getCapacidadeAtual() - litros);
			return true;
		} else {
			return false;
		}
	}

	public void extrato() {
		System.out.println("		** EXTRATO RESERVATÓRIO **");
		System.out.println("Nome do reservatório: " + getNome());
		System.out.println("Capacidade Total: " + getCapacidadeTotal() + "l");
		System.out.println("Capacidade Atual: " + getCapacidadeAtual() + "l");
		System.out.println("Status do nível d'água: " + verificarStatusReservatorio() + " ("
				+ ((getCapacidadeAtual() / getCapacidadeTotal()) * 100) + "%)");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getCapacidadeTotal() {
		return capacidadeTotal;
	}

	public void setCapacidadeTotal(double capacidadeTotal) {
		this.capacidadeTotal = capacidadeTotal;
	}

	public SensorNivelAgua getSensorNivelAgua() {
		return sensorNivelAgua;
	}

	public void setSensorNivelAgua(SensorNivelAgua sensorNivelAgua) {
		this.sensorNivelAgua = sensorNivelAgua;
	}

	public StatusReservatorio getStatusReservatorio() {
		return statusReservatorio;
	}

	public void setStatusReservatorio(StatusReservatorio statusReservatorio) {
		this.statusReservatorio = statusReservatorio;
	}

	public double getCapacidadeAtual() {
		return capacidadeAtual;
	}

	public void setCapacidadeAtual(double capacidadeAtual) {
		this.capacidadeAtual = capacidadeAtual;
	}

}
