/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.AlterarTelaActionListener;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.*;

/**
 *
 * @author felip
 */
public class View extends JFrame {

    private Map<String, JPanel> janelas;
    private LoginView loginView;
    private JPanel janelaAtual;

    private int largura_monitor;
    private int altura_monitor;

    public View() throws IOException {
        this.janelas = new HashMap<>();
        List<String> janelasChave = new ArrayList<>();

        janelasChave.add("Login");
        janelasChave.add("Registrar");

        for (String janela : janelasChave) {
            this.janelas.put(janela, new JPanel());
        }

        janelaAtual = janelas.get("Login");
        janelaAtual.setLayout(new BoxLayout(janelaAtual, BoxLayout.Y_AXIS));
        janelaAtual.setAlignmentY(CENTER_ALIGNMENT);
        this.setContentPane(this.janelaAtual);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Dimension tamJanela = this.getContentPane().getSize();
        this.largura_monitor = (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth();
        this.altura_monitor = (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight();

        pintarPainelLogin();

        this.setSize(largura_monitor, altura_monitor);
        this.setVisible(true);
    }
    public void actionListernerAlterarTela(){
        this.loginView.getRegistrarJButton().addActionListener(new AlterarTelaActionListener(this, "Login", "Registrar"));
    }
    public void alterarJanela(String janelaAtual, String proximaJanela) {
        this.janelas.put("janelaAtual", this.janelaAtual);
        this.janelaAtual = this.janelas.get(proximaJanela);

        this.getContentPane().removeAll();
        this.getContentPane().add(this.janelaAtual);

    }
    
    public void pintarPainelRegistro(){
        

    }
    public void pintarPainelLogin() throws IOException {

        this.loginView = new LoginView();

        this.janelaAtual.add(loginView.getLoginJpanel());
    }

    

    public static void main(String[] args) throws IOException {
        View view = new View();

    }

}
