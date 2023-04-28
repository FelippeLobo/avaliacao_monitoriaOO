/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import model.usuarios.Usuario;
import controller.AlterarTelaActionListener;
import controller.LoginActionListener;
import controller.RegistrarActionListener;
import controller.VerificarHistoricoActionListener;
import java.awt.BorderLayout;
import static java.awt.BorderLayout.CENTER;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.*;
import model.Departamento;
import model.Disciplina;
import model.usuarios.Aluno;

/**
 *
 * @author felip
 */
public class View extends JFrame {

    private Map<String, JPanel> janelas;

    private LoginViewBuilder loginViewBuilder;
    private RegistroViewBuilder registrarViewBuilder;
    private MenuViewBuilder menuViewBuilder;

    private JPanel janelaAtual;
    private List<Usuario> usuarios;
    private Departamento departamento;

    private int largura_monitor;
    private int altura_monitor;

    public View(Departamento departamento) throws IOException {
        this.departamento = departamento;

        this.usuarios = new ArrayList<>();
        this.usuarios.addAll(this.departamento.getProfessores());
        this.usuarios.addAll(this.departamento.getAlunos());

        this.janelas = new HashMap<>();
        List<String> janelasChave = new ArrayList<>();

        this.largura_monitor = (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth();
        this.altura_monitor = (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight();

        pintarPainelLogin();
        pintarPainelRegistro();
        pintarPainelMenu();
        
        actionListernerAlterarTela();
        actionListernetRegistrar();
        actionListenerLogar();
        actionListenerHistorico();
        
        this.janelaAtual = janelas.get("Login");

        this.setContentPane(this.janelaAtual);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setSize(largura_monitor, altura_monitor);
        this.setVisible(true);
    }

    public void pintarPainelMenu() throws IOException {
        this.setMenuViewBuilder(new MenuViewBuilder(this.getDepartamento()));
        this.janelas.put("Menu", this.getMenuViewBuilder().getMenuJPanel());
    }
    
    public void pintarPainelRegistro() {

        this.setRegistrarViewBuilder(new RegistroViewBuilder());
        this.janelas.put("Registro", this.getRegistrarViewBuilder().getRegistroJPanel());

    }

    public void pintarPainelLogin() throws IOException {

        this.setLoginViewBuilder(new LoginViewBuilder());
        this.janelas.put("Login", this.getLoginViewBuilder().getLoginJpanel());
    }

    public void actionListernerAlterarTela() {
        this.getLoginViewBuilder().getRegistrarJButton().addActionListener(new AlterarTelaActionListener(this, "Registro"));
        this.getRegistrarViewBuilder().getVoltarJButton().addActionListener(new AlterarTelaActionListener(this, "Login"));
    }

    public void actionListernetRegistrar() {
        this.getRegistrarViewBuilder().getRegistrarJButton().addActionListener(new RegistrarActionListener(this));
    }

    public void actionListenerLogar() {
        this.getLoginViewBuilder().getEntrarJButton().addActionListener(new LoginActionListener(this));
    }
     
    public void actionListenerHistorico() {
        String alunoNome =  (String) this.getMenuViewBuilder().getHistoricoJComboBox().getSelectedItem();
        Aluno aluno1 = null;
        for (Aluno aluno : this.departamento.getAlunos()) {
            if(aluno.getNome().equals(alunoNome)){
                aluno1 = aluno;
            }
        }
        this.getMenuViewBuilder().getAnalisarHistoricoJButton().addActionListener(new VerificarHistoricoActionListener(aluno1, this));
    }

    public void alterarJanela(String proximaJanela) {
        this.setVisible(false);
        this.janelaAtual = this.janelas.get(proximaJanela);
        this.setContentPane(this.janelaAtual);
        this.setVisible(true);
    }

//    public static void main(String[] args) throws IOException {
//
//        View view = new View();
//
//    }
    /**
     * @return the usuarios
     */
    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    /**
     * @param usuarios the usuarios to set
     */
    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    /**
     * @return the loginViewBuilder
     */
    public LoginViewBuilder getLoginViewBuilder() {
        return loginViewBuilder;
    }

    /**
     * @param loginViewBuilder the loginViewBuilder to set
     */
    public void setLoginViewBuilder(LoginViewBuilder loginViewBuilder) {
        this.loginViewBuilder = loginViewBuilder;
    }

    /**
     * @return the registrarViewBuilder
     */
    public RegistroViewBuilder getRegistrarViewBuilder() {
        return registrarViewBuilder;
    }

    /**
     * @param registrarViewBuilder the registrarViewBuilder to set
     */
    public void setRegistrarViewBuilder(RegistroViewBuilder registrarViewBuilder) {
        this.registrarViewBuilder = registrarViewBuilder;
    }

    /**
     * @return the menuViewBuilder
     */
    public MenuViewBuilder getMenuViewBuilder() {
        return menuViewBuilder;
    }

    /**
     * @param menuViewBuilder the menuViewBuilder to set
     */
    public void setMenuViewBuilder(MenuViewBuilder menuViewBuilder) {
        this.menuViewBuilder = menuViewBuilder;
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

}
