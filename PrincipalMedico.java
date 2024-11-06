package aula_2310;

public class PrincipalMedico {
public static void main(String[] args) {
		
		Medico medico = new Medico ("Lucas", "Clínico geral", 1000, "XXXX");
		medico.agendaConsulta();
		
		Fisioterapeuta fisioterapeuta = new Fisioterapeuta ("Katia", "Fisio geral", 1000, "XXXX");
		fisioterapeuta.agendaConsulta();
		
		Dentista dentista = new Dentista ("Kaique", "Dentista geral", 1000, "XXXX");
		dentista.agendaConsulta();

	}

}