package Trabalho;

public class Main {
	public static void main(String[] args) {
		/*
		 * Instâncias
		 */
		Bovino b = new Bovino("Caramelo", 8, 125, 1.5);
		Reservatorio r = new Reservatorio("R1", 1000);
		/*
		 * Extrato inicial do reservatório
		 */
		r.extrato();
		/*
		 * Extrato após adicionar 1000l d'água
		 */
		double litros = r.adicionarAgua(1000);
		if (litros == 1000) {
			System.out.println("- Adicionado os 1000l d'água.");
		} else {
			System.out.println("- Adicionado " + litros + "l d'água");
		}
		r.extrato();
		/*
		 * Extrato após consumir 100l d'água
		 */
		if (r.consumirAgua(100)) {
			System.out.println("- 100l d'água foram consumidos");
		} else {
			System.out.println("- Impossível consumir 100l d'água");
		}
		r.extrato();

		/*
		 * Hidratando o bovino e verificando as características
		 */
		b.hidratar(r);
		b.hidratar(r);
		b.hidratar(r);
		b.hidratar(r);
		b.caracteristicas();
		b.monitorarSaude();
		/*
		 * Último extrato do reservatório
		 */
		r.extrato();

	}
}