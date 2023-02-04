package pkg_testeclasse;

public class ImprimeConsulta {
    public static void main(String[] args) {
        
        Paciente Bruno = new Paciente();
        Paciente Nome = new Paciente();

        Medico DrMedico = new Medico();
        Medico DrMedico2 = new Medico();

        Consulta Consulta01 = new Consulta();
        Consulta Consulta02 = new Consulta();

        Bruno.id = 222;
        DrMedico.id = 100;

        Consulta01.id_paciente = Bruno.id;
        Consulta01.id_medico = DrMedico.id;

        Nome.id = 498;
        DrMedico2.id = 300;

        Consulta02.id_paciente = Nome.id;
        Consulta02.id_medico = DrMedico2.id;

        Consulta01.VerConsulta();
        Consulta02.VerConsulta();
    }
}
