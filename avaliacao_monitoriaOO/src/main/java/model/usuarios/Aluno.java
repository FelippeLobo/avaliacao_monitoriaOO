/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.usuarios;

import java.util.ArrayList;
import java.util.List;
import model.Disciplina;
import model.Historico;

/**
 *
 * @author felip
 */
public class Aluno extends Usuario {

    private List<Disciplina> disciplinas_cursadas;
    private Historico historico;
    private String curso;

    public Aluno(String nome, String CPF, String login, String password, String email, int ID) {
        super(nome, CPF, login, password, email, ID);
        this.gerarMatricula();
        this.disciplinas_cursadas = new ArrayList<>();
    }

    public Aluno() {
        super();
        this.disciplinas_cursadas = new ArrayList<>();
    }

    @Override
    public void gerarMatricula() {
        this.setMatricula("2023" + this.getID() + "65C");
    }

    public void gerarHistorico() {
        this.historico = new Historico(this);
    }

    /**
     * @return the disciplinas_cursadas
     */
    public List<Disciplina> getDisciplinas_cursadas() {
        return disciplinas_cursadas;
    }

    /**
     * @param disciplinas_cursadas the disciplinas_cursadas to set
     */
    public void setDisciplinas_cursadas(List<Disciplina> disciplinas_cursadas) {
        this.disciplinas_cursadas = disciplinas_cursadas;
    }

    /**
     * @return the historico
     */
    public Historico getHistorico() {
        return historico;
    }

    /**
     * @param historico the historico to set
     */
    public void setHistorico(Historico historico) {
        this.historico = historico;
    }

    /**
     * @return the curso
     */
    public String getCurso() {
        return curso;
    }

    /**
     * @param curso the curso to set
     */
    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Nome:" + this.getNome() + "||Matricula:" + this.getMatricula();
    }
}
