/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;
import model.usuarios.Professor;

/**
 *
 * @author felip
 */
public class Projeto {

    private String titulo_projeto;
    private String descricao_projeto;
    private Professor professor_orientador;
    private List<Professor> professores_coorientadores;
    private String codigo;

    /**
     * @return the titulo_projeto
     */
    public String getTitulo_projeto() {
        return titulo_projeto;
    }

    /**
     * @param titulo_projeto the titulo_projeto to set
     */
    public void setTitulo_projeto(String titulo_projeto) {
        this.titulo_projeto = titulo_projeto;
    }

    /**
     * @return the descricao_projeto
     */
    public String getDescricao_projeto() {
        return descricao_projeto;
    }

    /**
     * @param descricao_projeto the descricao_projeto to set
     */
    public void setDescricao_projeto(String descricao_projeto) {
        this.descricao_projeto = descricao_projeto;
    }

    /**
     * @return the professor_orientador
     */
    public Professor getProfessor_orientador() {
        return professor_orientador;
    }

    /**
     * @param professor_orientador the professor_orientador to set
     */
    public void setProfessor_orientador(Professor professor_orientador) {
        this.professor_orientador = professor_orientador;
    }

    /**
     * @return the professores_coorientadores
     */
    public List<Professor> getProfessores_coorientadores() {
        return professores_coorientadores;
    }

    /**
     * @param professores_coorientadores the professores_coorientadores to set
     */
    public void setProfessores_coorientadores(List<Professor> professores_coorientadores) {
        this.professores_coorientadores = professores_coorientadores;
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

}
