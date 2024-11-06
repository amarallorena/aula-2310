package aula_2310;

public class ProfissionalSaude {

	protected String nome;
	private String especialidade;
	private int valorConsulta;
	
	public ProfissionalSaude(String nome, String especialidade, int valorConsulta) {
		super();
		this.nome = nome;
		this.especialidade = especialidade;
		this.valorConsulta = valorConsulta;
	}
		
		public void agendaConsulta() {
			System.out.println("Nome: " + nome);
			System.out.println("Especialidade: "+ especialidade);
			System.out.println("Valor da consulta: " + valorConsulta);
		}
	}

