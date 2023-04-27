/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;
import model.usuarios.Aluno;

/**
 *
 * @author felip
 */
public class Historico {

    private List<Disciplina> disciplinas_cursadas;
    private Aluno aluno;

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
     * @return the aluno
     */
    public Aluno getAluno() {
        return aluno;
    }

    /**
     * @param aluno the aluno to set
     */
    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

}
