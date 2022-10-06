package entidades;

import java.util.Date;

public class Aluno {

    private Integer matricula;
    private String nome;
    private String sobrenome;
    private String dataNascimento;
    private String email;
    private String cpf;
    private Date horarioAula;
    private String aula;
    private Gym gym;

    public Aluno() {
    }

    public Aluno(Integer matricula, String nome, String sobrenome, String dataNascimento, String email,
                 String cpf, Date horarioAula, String aula, Gym gym) {
        this.matricula = matricula;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.cpf = cpf;
        this.horarioAula = horarioAula;
        this.aula = aula;
        this.gym = gym;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getHorarioAula() {
        return horarioAula;
    }

    public void setHorarioAula(Date horarioAula) {
        this.horarioAula = horarioAula;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public Gym getGym() {
        return gym;
    }

    public void setGym(Gym gym) {
        this.gym = gym;
    }
}
