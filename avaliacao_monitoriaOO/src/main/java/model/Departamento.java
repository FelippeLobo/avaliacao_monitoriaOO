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
public class Departamento {

    private String nome;
    private List<Professor> professores;
    private List<String> areas_de_pesquisa;
    private List<Disciplina> disciplinas_ofertadas;
    private List<Projeto> projetos_ofertados;
    private Professor chefe_departamental;

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
     * @return the areas_de_pesquisa
     */
    public List<String> getAreas_de_pesquisa() {
        return areas_de_pesquisa;
    }

    /**
     * @param areas_de_pesquisa the areas_de_pesquisa to set
     */
    public void setAreas_de_pesquisa(List<String> areas_de_pesquisa) {
        this.areas_de_pesquisa = areas_de_pesquisa;
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
     * @return the projetos_ofertados
     */
    public List<Projeto> getProjetos_ofertados() {
        return projetos_ofertados;
    }

    /**
     * @param projetos_ofertados the projetos_ofertados to set
     */
    public void setProjetos_ofertados(List<Projeto> projetos_ofertados) {
        this.projetos_ofertados = projetos_ofertados;
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

}
