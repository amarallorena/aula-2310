package aula_2310;

public class Medico extends ProfissionalSaude{
	
	protected String crm;
	
	public Medico(String nome, String especialidade, int valorConsulta, String crm) {
		super(nome, especialidade, valorConsulta);
		this.crm = crm;
	}

	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}
	public void agendaConsulta() {
System.out.println("CRM: " + crm);
	
	}

}
