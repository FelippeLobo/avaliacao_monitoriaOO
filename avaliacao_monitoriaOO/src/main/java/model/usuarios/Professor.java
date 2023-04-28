/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.usuarios;

import java.util.ArrayList;
import model.usuarios.Usuario;
import java.util.List;
import model.Departamento;
import model.Disciplina;

/**
 *
 * @author felip
 */
public class Professor extends Usuario {

    private List<Disciplina> disciplinas_ministradas;
    private Departamento departamento;
    private boolean isChefe;

    public Professor(String nome, String CPF, String login, String password, String email, int ID) {
        super(nome, CPF, login, password, email, ID);
        this.gerarMatricula();
        this.disciplinas_ministradas = new ArrayList<>();
    }

    @Override
    public void gerarMatricula() {
        this.setMatricula(this.getCPF() + "2023" + this.getID());
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
