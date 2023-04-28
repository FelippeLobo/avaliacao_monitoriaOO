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
public class Disciplina {

    private String nome;
    private String codigo;
    private Professor professor;
    private List<Aluno> alunos_matriculados;
    private Map<Aluno, Float> notas;
    private String ementa;

    public Disciplina(String nome, String codigo, Professor professor, List<Aluno> alunos_matriculados, Map<Aluno, Float> notas, String ementa) {
        this.nome = nome;
        this.codigo = codigo;
        this.professor = professor;
        this.alunos_matriculados = alunos_matriculados;
        this.notas = notas;
        this.ementa = ementa;
    }

    public float consultarNota(Aluno aluno) {
        if (alunos_matriculados.contains(aluno)) {
            return notas.get(aluno);
        }
        
        return -1;
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the professor
     */
    public Professor getProfessor() {
        return professor;
    }

    /**
     * @param professor the professor to set
     */
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    /**
     * @return the alunos_matriculados
     */
    public List<Aluno> getAlunos_matriculados() {
        return alunos_matriculados;
    }

    /**
     * @param alunos_matriculados the alunos_matriculados to set
     */
    public void setAlunos_matriculados(List<Aluno> alunos_matriculados) {
        this.alunos_matriculados = alunos_matriculados;
    }

    /**
     * @return the ementa
     */
    public String getEmenta() {
        return ementa;
    }

    /**
     * @param ementa the ementa to set
     */
    public void setEmenta(String ementa) {
        this.ementa = ementa;
    }

    /**
     * @return the notas
     */
    public Map<Aluno, Float> getNotas() {
        return notas;
    }

    /**
     * @param notas the notas to set
     */
    public void setNotas(Map<Aluno, Float> notas) {
        this.notas = notas;
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

}
