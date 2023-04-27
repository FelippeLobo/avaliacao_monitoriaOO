/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.usuarios;

import java.util.List;
import model.Disciplina;
import model.Historico;
import model.Projeto;

/**
 *
 * @author felip
 */
public class Aluno extends Usuario {

    private String matricula;
    private List<Projeto> projetos_participando;
    private List<Disciplina> disciplinas_cursadas;
    private Historico historico;
    private String curso;

    public Aluno(String nome, String CPF, String login, String password, String email) {
        super(nome, CPF, login, password, email);
    }

    /**
     * @return the matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
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

    /**
     * @return the projetos_participando
     */
    public List<Projeto> getProjetos_participando() {
        return projetos_participando;
    }

    /**
     * @param projetos_participando the projetos_participando to set
     */
    public void setProjetos_participando(List<Projeto> projetos_participando) {
        this.projetos_participando = projetos_participando;
    }

}
