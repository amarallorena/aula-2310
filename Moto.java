package aula_2310;

public class Moto extends Veiculo{

	private int cilindradas;
	
	public Moto(String marca, String modelo, int ano, String cor, int cilindradas) {
		super(marca, modelo, ano, cor);
		this.cilindradas = cilindradas;
	}

	@Override
	public void exibirInfo() {
		super.exibirInfo();
		System.out.println("Cilindradas: " + cilindradas);
	}

}
