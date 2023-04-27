/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.usuarios;

import model.usuarios.Usuario;
import java.util.List;
import model.Departamento;
import model.Disciplina;
import model.Projeto;

/**
 *
 * @author felip
 */
public class Professor extends Usuario{
    
    private String matricula;
    private List<Disciplina> disciplinas_ministradas;
    private Departamento departamento;
    private List<String> areas_de_interesse;
    private List<Projeto> projetos_participando;
    private boolean isChefe;
    
    public Professor(String nome, String CPF, String login, String password, String email) {
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
     * @return the disciplinas_ministradas
     */
    public List<Disciplina> getDisciplinas_ministradas() {
        return disciplinas_ministradas;
    }

    /**
     * @param disciplinas_ministradas the disciplinas_ministradas to set
     */
    public void setDisciplinas_ministradas(List<Disciplina> disciplinas_ministradas) {
        this.disciplinas_ministradas = disciplinas_ministradas;
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

    /**
     * @return the areas_de_interesse
     */
    public List<String> getAreas_de_interesse() {
        return areas_de_interesse;
    }

    /**
     * @param areas_de_interesse the areas_de_interesse to set
     */
    public void setAreas_de_interesse(List<String> areas_de_interesse) {
        this.areas_de_interesse = areas_de_interesse;
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

    /**
     * @return the isChefe
     */
    public boolean isIsChefe() {
        return isChefe;
    }

    /**
     * @param isChefe the isChefe to set
     */
    public void setIsChefe(boolean isChefe) {
        this.isChefe = isChefe;
    }
    
}
