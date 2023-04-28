/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.usuarios.Aluno;
import model.usuarios.Professor;
import model.usuarios.Usuario;
import view.MenuViewBuilder;
import view.View;

/**
 *
 * @author felip
 */
public class RegistrarActionListener implements ActionListener {

    private View view;

    public RegistrarActionListener(View view) {

        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String nome = this.view.getRegistrarViewBuilder().getNomeJTextField().getText();
        String cpf = this.view.getRegistrarViewBuilder().getCPFJTextField().getText();
        String login = this.view.getRegistrarViewBuilder().getLoginJTextField().getText();
        String senha = this.view.getRegistrarViewBuilder().getSenhaJTextField().getText();
        String tipoUsuario = (String) this.view.getRegistrarViewBuilder().getTipoUsuario().getSelectedItem();
        String email = this.view.getRegistrarViewBuilder().getEmailJTextField().getText();
        int ID = view.getUsuarios().size() + 1;
        if (tipoUsuario.equals("Aluno")) {

            Aluno novoAluno = new Aluno(nome, cpf, login, nome, email, ID);
            view.getDepartamento().getAlunos().add(novoAluno);

        } else if (tipoUsuario.equals("Professor")) {
            Professor novoProfessor = new Professor(nome, cpf, login, nome, email, ID);
            view.getDepartamento().getProfessores().add(novoProfessor);

        }

        List<Usuario> novosUsuarios = new ArrayList<>();
        novosUsuarios.addAll(view.getDepartamento().getProfessores());
        novosUsuarios.addAll(view.getDepartamento().getAlunos());
        this.view.setUsuarios(novosUsuarios);

        this.view.alterarJanela("Login");
    }

}
