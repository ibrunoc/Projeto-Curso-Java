package pkg_testeclasse;

public class Consulta{
    
    public int id;
    public int id_paciente;
    public int id_medico;

    public void VerConsulta() {
        System.out.println("A idenficação do Paciente: " + this.id_paciente + "\n" + "A idenficação do Medico: " + this.id_medico);
    }
}
