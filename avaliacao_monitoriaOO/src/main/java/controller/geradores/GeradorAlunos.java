/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.geradores;

import controller.geradores.Gerador;
import classesExternas.Randomizador;
import java.util.ArrayList;
import java.util.List;
import model.usuarios.Aluno;
import model.usuarios.Professor;
import model.usuarios.Usuario;

/**
 *
 * @author felip
 */
public class GeradorAlunos implements Gerador {

    @Override
    public Object gerar(int num) {
        List<Aluno> alunosGerados = new ArrayList<>();
    
        String nome = "";
        String cpf = "";
        String login = "";
        String senha = "";
        String email = "";

        for (int i = 0; i < num; i++) {
            nome = Randomizador.gerarNomeAleatorio();
            cpf = Randomizador.gerarCPFAleatorio();
            login = Randomizador.gerarLoginAleatorio();
            senha = Randomizador.gerarSenhaAleatorio();
            email = Randomizador.gerarEmailAleatorio();

            Aluno novoAluno = new Aluno(nome, cpf, login, senha, email, i);
            novoAluno.setCurso("Computação");
            alunosGerados.add(novoAluno);
        }

        return alunosGerados;
    }
}
