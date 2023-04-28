/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;
import java.util.Map;
import model.usuarios.Aluno;
import model.usuarios.Professor;

/**
 *
 * @author felip
 */
public class Departamento {

    private String nome;
    private List<Professor> professores;
    private List<Disciplina> disciplinas_ofertadas;
    private List<Aluno> alunos;
    private Professor chefe_departamental;

    public Departamento(String nome, List<Aluno> alunos, List<Professor> professores, List<Disciplina> disciplinas_ofertadas, Professor chefe_departamental) {
        this.nome = nome;
        this.professores = professores;
        this.alunos = alunos;
        this.disciplinas_ofertadas = disciplinas_ofertadas;
        this.chefe_departamental = chefe_departamental;
        this.chefe_departamental.setIsChefe(true);
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the professores
     */
    public List<Professor> getProfessores() {
        return professores;
    }

    /**
     * @param professores the professores to set
     */
    public void setProfessores(List<Professor> professores) {
        this.professores = professores;
    }

    /**
     * @return the disciplinas_ofertadas
     */
    public List<Disciplina> getDisciplinas_ofertadas() {
        return disciplinas_ofertadas;
    }

    /**
     * @param disciplinas_ofertadas the disciplinas_ofertadas to set
     */
    public void setDisciplinas_ofertadas(List<Disciplina> disciplinas_ofertadas) {
        this.disciplinas_ofertadas = disciplinas_ofertadas;
    }

    /**
     * @return the chefe_departamental
     */
    public Professor getChefe_departamental() {
        return chefe_departamental;
    }

    /**
     * @param chefe_departamental the chefe_departamental to set
     */
    public void setChefe_departamental(Professor chefe_departamental) {
        this.chefe_departamental = chefe_departamental;
    }

    /**
     * @return the alunos
     */
    public List<Aluno> getAlunos() {
        return alunos;
    }

    /**
     * @param alunos the alunos to set
     */
    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

}
