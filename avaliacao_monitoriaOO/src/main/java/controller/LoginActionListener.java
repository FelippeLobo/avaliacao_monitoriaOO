/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import model.usuarios.Usuario;
import view.MenuViewBuilder;
import view.View;

/**
 *
 * @author felip
 */
public class LoginActionListener implements ActionListener {

    private View view;

    public LoginActionListener(View view) {
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String login = this.view.getLoginViewBuilder().getLoginJTextField().getText();
        char[] senha = this.view.getLoginViewBuilder().getSenhaJPasswordField().getPassword();

        List<Usuario> usuarios = this.view.getUsuarios();
        boolean flag = false;
        for (Usuario usuario : usuarios) {
            if (usuario.getLogin().equals(login) && usuario.verificaSenha(senha)) {
                flag = true;
            }
        }

        if (flag) {
            try {
                view.setMenuViewBuilder(new MenuViewBuilder(view.getDepartamento()));
                this.view.alterarJanela("Menu");
            } catch (IOException ex) {
                Logger.getLogger(LoginActionListener.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            JDialog jdialog = new JDialog(this.view, "ERRO");
            JLabel l = new JLabel("Login Invalido");
            jdialog.add(l);
            jdialog.setSize(100, 100);
            jdialog.setVisible(true);
            jdialog.setDefaultCloseOperation(jdialog.EXIT_ON_CLOSE);

        }

    }

}
