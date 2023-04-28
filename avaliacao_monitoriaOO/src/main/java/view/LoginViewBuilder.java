/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.AlterarTelaActionListener;
import java.awt.Component;
import static java.awt.Component.CENTER_ALIGNMENT;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author felip
 */
public class LoginViewBuilder {

    private JPanel loginJpanel;
    private JTextField loginJTextField;
    private JPasswordField senhaJPasswordField;
    private JButton entrarJButton;
    private JButton registrarJButton;
    private JLabel imagemSiga;
    private int largura_monitor;
    private int altura_monitor;

    public LoginViewBuilder() throws IOException {

        this.largura_monitor = (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth();
        this.altura_monitor = (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight();
        
        this.loginJpanel = new JPanel();

        JPanel conteiner = new JPanel();
        conteiner.setLayout(new BoxLayout(conteiner, BoxLayout.Y_AXIS));
        conteiner.setAlignmentY(CENTER_ALIGNMENT);

        pintarCampoLogin();
        pintarCampoSenha();
        pintarBotaoEntrar();
        pintarBotaoRegistrar();
        pintarImagemSiga();

        JPanel linhaLogin = pintarLinhasLogin();
        JPanel linhaSenha = pintarLinhasSenha();
        JPanel linhaBotoes = pintarLinhaBotoes();

        conteiner.add(linhaLogin);
        conteiner.add(linhaSenha);
        conteiner.add(linhaBotoes);

        Component boxTopo = Box.createRigidArea(new Dimension(getLargura_monitor(), (int) (getAltura_monitor() / 6.5)));
        Component boxSolo = Box.createRigidArea(new Dimension(getLargura_monitor(), (int) (getAltura_monitor() / 2.5)));

        this.loginJpanel.add(boxTopo);
        this.loginJpanel.add(conteiner);
        this.loginJpanel.add(boxSolo);

    }

    public JPanel pintarLinhasLogin() {
        JLabel labelLogin = new JLabel();
        labelLogin.setText("Login:");

        JPanel linhaLogin = new JPanel();
        linhaLogin.setLayout(new FlowLayout(FlowLayout.LEFT));
        linhaLogin.add(labelLogin);
        linhaLogin.add(this.getLoginJTextField());

        return linhaLogin;
    }

    public JPanel pintarLinhasSenha() {
        JLabel labelSenha = new JLabel();
        labelSenha.setText("Senha:");

        JPanel linhaSenha = new JPanel();
        linhaSenha.setLayout(new FlowLayout(FlowLayout.LEFT));
        linhaSenha.add(labelSenha);
        linhaSenha.add(this.getSenhaJPasswordField());

        return linhaSenha;
    }

    public JPanel pintarLinhaBotoes() {
        JPanel linhaBotoes = new JPanel();
        linhaBotoes.setLayout(new FlowLayout(FlowLayout.LEFT));
        linhaBotoes.add(this.getRegistrarJButton());
        linhaBotoes.add(this.getEntrarJButton());

        return linhaBotoes;
    }

    public void pintarImagemSiga() throws IOException {
        BufferedImage imagemSigaOBJ = ImageIO.read(new File("../siga3.png"));
        this.setImagemSiga(new JLabel(new ImageIcon(imagemSigaOBJ)));
        Component boxTopo = Box.createRigidArea(new Dimension(getLargura_monitor(), (int) (getAltura_monitor() / 7)));
        this.getLoginJpanel().add(boxTopo);
        this.getLoginJpanel().add(getImagemSiga());
    }

    public void pintarBotaoEntrar() {
        this.setEntrarJButton(new JButton("Entrar"));
        this.getEntrarJButton().setPreferredSize(new Dimension(this.getLargura_monitor() / 8, 30));
        this.getEntrarJButton().setMaximumSize(this.getEntrarJButton().getPreferredSize());
        this.getEntrarJButton().setAlignmentX(Component.CENTER_ALIGNMENT);
        //this.entrarJButton.addActionListener();

    }

    public void pintarBotaoRegistrar() {
        this.setRegistrarJButton(new JButton("Registrar"));
        this.getRegistrarJButton().setPreferredSize(new Dimension(this.getLargura_monitor() / 8, 30));
        this.getRegistrarJButton().setMaximumSize(this.getRegistrarJButton().getPreferredSize());
        this.getRegistrarJButton().setAlignmentX(Component.CENTER_ALIGNMENT);

    }

    public void pintarCampoLogin() {

        this.setLoginJTextField(new JTextField(""));

        this.getLoginJTextField().setPreferredSize(new Dimension(this.getLargura_monitor() / 5, 30));
        this.getLoginJTextField().setMaximumSize(this.getLoginJTextField().getPreferredSize());
        this.getLoginJTextField().setAlignmentX(Component.CENTER_ALIGNMENT);

    }

    public void pintarCampoSenha() {
        this.setSenhaJPasswordField(new JPasswordField(""));

        this.getSenhaJPasswordField().setPreferredSize(new Dimension(this.getLargura_monitor() / 5, 30));
        this.getSenhaJPasswordField().setMaximumSize(this.getLoginJTextField().getPreferredSize());
        this.getSenhaJPasswordField().setAlignmentX(Component.CENTER_ALIGNMENT);
    }

    /**
     * @return the loginJpanel
     */
    public JPanel getLoginJpanel() {
        return loginJpanel;
    }

    /**
     * @param loginJpanel the loginJpanel to set
     */
    public void setLoginJpanel(JPanel loginJpanel) {
        this.loginJpanel = loginJpanel;
    }

    /**
     * @return the loginJTextField
     */
    public JTextField getLoginJTextField() {
        return loginJTextField;
    }

    /**
     * @param loginJTextField the loginJTextField to set
     */
    public void setLoginJTextField(JTextField loginJTextField) {
        this.loginJTextField = loginJTextField;
    }

    /**
     * @return the senhaJPasswordField
     */
    public JPasswordField getSenhaJPasswordField() {
        return senhaJPasswordField;
    }

    /**
     * @param senhaJPasswordField the senhaJPasswordField to set
     */
    public void setSenhaJPasswordField(JPasswordField senhaJPasswordField) {
        this.senhaJPasswordField = senhaJPasswordField;
    }

    /**
     * @return the entrarJButton
     */
    public JButton getEntrarJButton() {
        return entrarJButton;
    }

    /**
     * @param entrarJButton the entrarJButton to set
     */
    public void setEntrarJButton(JButton entrarJButton) {
        this.entrarJButton = entrarJButton;
    }

    /**
     * @return the registrarJButton
     */
    public JButton getRegistrarJButton() {
        return registrarJButton;
    }

    /**
     * @param registrarJButton the registrarJButton to set
     */
    public void setRegistrarJButton(JButton registrarJButton) {
        this.registrarJButton = registrarJButton;
    }

    /**
     * @return the imagemSiga
     */
    public JLabel getImagemSiga() {
        return imagemSiga;
    }

    /**
     * @param imagemSiga the imagemSiga to set
     */
    public void setImagemSiga(JLabel imagemSiga) {
        this.imagemSiga = imagemSiga;
    }

    /**
     * @return the largura_monitor
     */
    public int getLargura_monitor() {
        return largura_monitor;
    }

    /**
     * @param largura_monitor the largura_monitor to set
     */
    public void setLargura_monitor(int largura_monitor) {
        this.largura_monitor = largura_monitor;
    }

    /**
     * @return the altura_monitor
     */
    public int getAltura_monitor() {
        return altura_monitor;
    }

    /**
     * @param altura_monitor the altura_monitor to set
     */
    public void setAltura_monitor(int altura_monitor) {
        this.altura_monitor = altura_monitor;
    }
}
