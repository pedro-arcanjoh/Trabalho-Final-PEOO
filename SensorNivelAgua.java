package Trabalho;

import java.util.Random;

public class SensorNivelAgua implements iSensor {

	private double nível;

	public SensorNivelAgua() {

	}

	public SensorNivelAgua(double nível) {
		super();
		this.nível = nível;
	}

	@Override
	public double coletarDados() {
		return nível;
	}

	public static int gerarNivelAguaAleatorio() {
		Random gerador = new Random();
		return gerador.nextInt(101);
	}

}
