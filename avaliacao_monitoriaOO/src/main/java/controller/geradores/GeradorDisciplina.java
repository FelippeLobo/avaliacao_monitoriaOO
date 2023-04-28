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
import model.Disciplina;
import model.usuarios.Aluno;
import model.usuarios.Professor;
import model.usuarios.Usuario;

/**
 *
 * @author felip
 */
public class GeradorDisciplina implements Gerador {

    private List<Aluno> alunosRegistrados;
    private List<Professor> professoresRegistrados;

    public GeradorDisciplina(List<Aluno> alunosRegistrados, List<Professor> professoresRegistrados) {
        this.alunosRegistrados = alunosRegistrados;
        this.professoresRegistrados = professoresRegistrados;
    }

    @Override
    public Object gerar(int num) {
        List<Disciplina> disciplinasGeradas = new ArrayList<>();

        Random numeroAleatorio = new Random();

        float n3 = 0;

        String nome = "";
        String codigo = "";
        Professor professor;
        List<Aluno> alunos_matriculados = new ArrayList<>();
        Map<Aluno, Float> notas = new HashMap<>();
        String ementa;

        for (int i = 0; i < num; i++) {
            int n1 = numeroAleatorio.nextInt(this.professoresRegistrados.size());
            int n2 = numeroAleatorio.nextInt(this.alunosRegistrados.size());
            nome = Randomizador.gerarNomeAleatorio();
            codigo = Randomizador.gerarCPFAleatorio();
            professor = this.professoresRegistrados.get(n1);
            for (int j = 0; j < n2; j++) {
                alunos_matriculados.add(this.alunosRegistrados.get(j));
            }
            for (Aluno alunos_matriculado : alunos_matriculados) {
                n3 = numeroAleatorio.nextInt(100) + 1;
                notas.put(alunos_matriculado, (Float) n3);
            }

            ementa = Randomizador.gerarNomeAleatorio();
            Disciplina disciplina = new Disciplina(nome, codigo, professor, alunos_matriculados, notas, ementa);
            disciplinasGeradas.add(disciplina);

            professor.getDisciplinas_ministradas().add(disciplina);
            for (Aluno alunos_matriculado : alunos_matriculados) {
                alunos_matriculado.getDisciplinas_cursadas().add(disciplina);
            }
            alunos_matriculados = new ArrayList<>();
            notas = new HashMap<>();

        }

        for (Aluno alunosRegistrado : this.alunosRegistrados) {
            alunosRegistrado.gerarHistorico();
        }

        return disciplinasGeradas;
    }

}
