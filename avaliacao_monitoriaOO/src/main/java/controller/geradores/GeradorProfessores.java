/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.geradores;

import controller.geradores.Gerador;
import classesExternas.Randomizador;
import java.util.ArrayList;
import java.util.List;
import model.usuarios.Professor;
import model.usuarios.Usuario;

/**
 *
 * @author felip
 */
public class GeradorProfessores implements Gerador {

    @Override
    public Object gerar(int num) {
        List<Professor> professoresGerados = new ArrayList<>();
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

            Professor novoProfessor = new Professor(nome, cpf, login, senha, email, i);
            novoProfessor.setIsChefe(false);
            professoresGerados.add(novoProfessor);
        }

        return professoresGerados;
    }

}
