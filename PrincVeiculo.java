package aula_2310;

public class PrincVeiculo {

	public static void main(String[] args) {
		Automovel carro1 = new Automovel("Ford", "GT", 2020, "Azul", 4, "V8");
		Moto moto1 = new Moto("Honda", "CG", 2022, "Vermelha", 150);

		carro1.exibirInfo();
		System.out.println();
		moto1.exibirInfo();
	}

}
