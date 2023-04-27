/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;
import model.usuarios.Aluno;
import model.usuarios.Professor;

/**
 *
 * @author felip
 */
public class Disciplina {

    private String codigo;
    private Professor professor;
    private List<Aluno> alunos_matriculados;
    private String ementa;
    private Departamento departamento;
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
     * @return the departamento
     */
    public Departamento getDepartamento() {
        return departamento;
    }

    /**
     * @param departamento the departamento to set
     */
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

}
