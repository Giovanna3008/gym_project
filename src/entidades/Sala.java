package entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

public abstract class Sala {

    protected SimpleDateFormat sdfHora = new SimpleDateFormat("HH:mm");
    private String nomeAula;
    protected Gym gym;
    private Profissional profissional;

    //lista total de alunos
    protected ArrayList<Aluno> alunosList = new ArrayList<>();

    //listas dias de aula
    protected ArrayList<Aluno> horariosQuartaList = new ArrayList<>();
    protected ArrayList<Aluno> horariosSextaList = new ArrayList<>();
    protected ArrayList<Aluno> horariosSabadoList = new ArrayList<>();

    //listas de horario quarta feira
    protected ArrayList<Aluno> horariosQuartaManhaList = new ArrayList<>();
    protected ArrayList<Aluno> horariosQuartaTardeList = new ArrayList<>();
    protected ArrayList<Aluno> horariosQuartaNoiteList = new ArrayList<>();

    //listas de horarios sexta feria
    protected ArrayList<Aluno> horariosSextaManhaList = new ArrayList<>();
    protected ArrayList<Aluno> horariosSextaTardeList = new ArrayList<>();
    protected ArrayList<Aluno> horariosSextaNoiteList = new ArrayList<>();

    //listas de horarios sabado
    protected ArrayList<Aluno> horariosSabadoManhaList = new ArrayList<>();
    protected ArrayList<Aluno> horariosSabadoTardeList = new ArrayList<>();
    protected ArrayList<Aluno> horariosSabadoNoiteList = new ArrayList<>();

    public String getNomeAula() {
        return nomeAula;
    }

    public void setNomeAula(String nomeAula) {
        this.nomeAula = nomeAula;
    }

    public Gym getGym() {
        return gym;
    }

    public void setGym(Gym gym) {
        this.gym = gym;
    }

    public Profissional getProfissional() {
        return profissional;
    }

    public void setProfissional(Profissional profissional) {
        this.profissional = profissional;
    }

    public ArrayList<Aluno> getAlunosList() {
        return alunosList;
    }

    public ArrayList<Aluno> getHorariosQuartaList() {
        return horariosQuartaList;
    }

    public ArrayList<Aluno> getHorariosSextaList() {
        return horariosSextaList;
    }

    public ArrayList<Aluno> getHorariosSabadoList() {
        return horariosSabadoList;
    }

    public ArrayList<Aluno> getHorariosQuartaManhaList() {
        return horariosQuartaManhaList;
    }

    public ArrayList<Aluno> getHorariosQuartaTardeList() {
        return horariosQuartaTardeList;
    }

    public ArrayList<Aluno> getHorariosQuartaNoiteList() {
        return horariosQuartaNoiteList;
    }

    public ArrayList<Aluno> getHorariosSextaManhaList() {
        return horariosSextaManhaList;
    }

    public ArrayList<Aluno> getHorariosSextaTardeList() {
        return horariosSextaTardeList;
    }

    public ArrayList<Aluno> getHorariosSextaNoiteList() {
        return horariosSextaNoiteList;
    }

    public ArrayList<Aluno> getHorariosSabadoManhaList() {
        return horariosSabadoManhaList;
    }

    public ArrayList<Aluno> getHorariosSabadoTardeList() {
        return horariosSabadoTardeList;
    }

    public ArrayList<Aluno> getHorariosSabadoNoiteList() {
        return horariosSabadoNoiteList;
    }

    //add todos os Alunos
    public abstract void addAluno(Aluno aluno);

    //add dias de Aulas
    public abstract void addHorarioQuarta(Aluno aluno);
    public abstract void addHorarioSexta(Aluno aluno);
    public abstract void addHorarioSabado(Aluno aluno);

    //add horarios de Quarta-Feira
    public abstract void addHorarioQuartaManha(Aluno aluno);
    public abstract void addHorarioQuartaTarde(Aluno aluno);
    public abstract void addHorarioQuartaNoite(Aluno aluno);

    //add horarios de Sexta-Feira
    public abstract void addHorarioSextaManha(Aluno aluno);
    public abstract void addHorarioSextaTarde(Aluno aluno);
    public abstract void addHorarioSextaNoite(Aluno aluno);

    //add horarios de Sabado
    public abstract void addHorarioSabadoManha(Aluno aluno);
    public abstract void addHorarioSabadoTarde(Aluno aluno);
    public abstract void addHorarioSabadoNoite(Aluno aluno);
}
