/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.geradores;

import classesExternas.Randomizador;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import model.Departamento;
import model.Disciplina;
import model.usuarios.Aluno;
import model.usuarios.Professor;

/**
 *
 * @author felip
 */
public class GeradorDepartamento implements Gerador{
    
    private List<Aluno> alunos;
    private List<Professor> professores;
    private List<Disciplina> disciplinas;

    public GeradorDepartamento() {
        GeradorAlunos ga = new GeradorAlunos();
        GeradorProfessores gp = new GeradorProfessores();
        
        this.alunos = (List<Aluno>) ga.gerar(15);
        this.professores = (List<Professor>) gp.gerar(5);
        
        GeradorDisciplina gd = new GeradorDisciplina(alunos, professores);
        this.disciplinas = (List<Disciplina>) gd.gerar(5);
    }

    
    
    @Override
    public Object gerar(int num) {
        
        
        String nome = "";
        String codigo = "";
        Professor professor;
        List<Aluno> alunos_matriculados = new ArrayList<>();
        Map<Aluno, Float> notas = new HashMap<>();
        String ementa;
        
        Departamento departamento = new Departamento("DCC", this.alunos, this.professores, this.disciplinas, this.professores.get(0));
        for (Professor professore : this.professores) {
            professore.setDepartamento(departamento);
        }
       

        return departamento;
    }
    
    
}
