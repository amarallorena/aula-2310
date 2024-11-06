package aula_2310;

public class Fisioterapeuta extends ProfissionalSaude {

	private String credito;

	public Fisioterapeuta(String nome, String especialidade, int valorConsulta, String credito) {
		super(nome, especialidade, valorConsulta);
		this.credito = credito;
	}

	public String getCredito() {
		return credito;
	}

	public void setCredito(String credito) {
		this.credito = credito;
	}
	public void agendaConsulta() {
		System.out.println("Cedito: " + credito);

	}

}


