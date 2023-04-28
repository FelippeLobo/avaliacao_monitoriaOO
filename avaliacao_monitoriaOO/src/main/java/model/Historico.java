/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import model.usuarios.Aluno;

/**
 *
 * @author felip
 */
public class Historico {

    private Map<Disciplina, Float> historico;
    private List<Disciplina> disciplinas_cursadas;
    private Aluno aluno;
    
    public Historico(Aluno aluno){
        this.historico = new HashMap<>();
        this.disciplinas_cursadas = new ArrayList<>();
        this.aluno = aluno;
        
        setDisciplinas();
        setHistorico();
    }
    /**
     * @return the disciplinas_cursadas
     */
    
    public Map<Disciplina, Float> getHistorico(){
        return historico;
    }
    public List<Disciplina> getDisciplinas_cursadas() {
        return disciplinas_cursadas;
    }

    /**
     * @param disciplinas_cursadas the disciplinas_cursadas to set
     */
    private void setHistorico() {
        for (Disciplina disciplinas_cursada : this.disciplinas_cursadas) {
            this.historico.put(disciplinas_cursada, disciplinas_cursada.consultarNota(this.aluno));
        }
    }
    private void setDisciplinas(){
        this.disciplinas_cursadas = this.aluno.getDisciplinas_cursadas();
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
