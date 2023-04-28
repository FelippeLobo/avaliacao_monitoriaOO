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
import java.awt.Font;
import java.awt.Toolkit;
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

/**
 *
 * @author felip
 */
public class View extends JFrame {

    private Map<String, JPanel> janelas;
    private LoginViewBuilder loginViewBuilder;
    private RegistroViewBuilder registrarViewBuilder;
    private JPanel janelaAtual;

    private int largura_monitor;
    private int altura_monitor;

    public View() throws IOException {
        this.janelas = new HashMap<>();
        List<String> janelasChave = new ArrayList<>();

        this.largura_monitor = (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth();
        this.altura_monitor = (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight();

        pintarPainelLogin();
        pintarPainelRegistro();
        actionListernerAlterarTela();

        this.janelaAtual = janelas.get("Login");

        this.setContentPane(this.janelaAtual);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setSize(largura_monitor, altura_monitor);
        this.setVisible(true);
    }

    public void actionListernerAlterarTela() {
        this.loginViewBuilder.getRegistrarJButton().addActionListener(new AlterarTelaActionListener(this, "Registro"));

        this.registrarViewBuilder.getVoltarJButton().addActionListener(new AlterarTelaActionListener(this, "Login"));
    }

    public void alterarJanela(String proximaJanela) {
        this.setVisible(false);

        this.janelaAtual = this.janelas.get(proximaJanela);

        this.setContentPane(this.janelaAtual);

        this.setVisible(true);
    }

    public void pintarPainelRegistro() {

        this.registrarViewBuilder = new RegistroViewBuilder();
        this.janelas.put("Registro", this.registrarViewBuilder.getRegistroJPanel());

    }

    public void pintarPainelLogin() throws IOException {

        this.loginViewBuilder = new LoginViewBuilder();
        this.janelas.put("Login", this.loginViewBuilder.getLoginJpanel());
    }

    public static void main(String[] args) throws IOException {
        View view = new View();

    }

}
