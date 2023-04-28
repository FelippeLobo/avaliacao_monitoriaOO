/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.Component;
import static java.awt.Component.CENTER_ALIGNMENT;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;
import java.util.Vector;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author felip
 */
public class RegistroViewBuilder {

    private JPanel registroJPanel;
    private JLabel tituloRegistrar;
    private JComboBox tipoUsuario;
    private JTextField nomeJTextField;
    private JTextField CPFJTextField;
    private JTextField loginJTextField;
    private JTextField senhaJTextField;
    private JTextField emailJTextField;
    private JButton voltarJButton;
    private JButton registrarJButton;

    private int largura_monitor;
    private int altura_monitor;

    public RegistroViewBuilder() {

        this.setLargura_monitor((int) Toolkit.getDefaultToolkit().getScreenSize().getWidth());
        this.setAltura_monitor((int) Toolkit.getDefaultToolkit().getScreenSize().getHeight());
        
        this.setRegistroJPanel(new JPanel());

        JPanel conteiner = new JPanel();
        conteiner.setLayout(new BoxLayout(conteiner, BoxLayout.Y_AXIS));
        conteiner.setAlignmentY(CENTER_ALIGNMENT);

        this.setTituloRegistrar(new JLabel("Registrar"));
        this.getTituloRegistrar().setFont(new Font("Arial", Font.PLAIN, 60));
        
        pintarCampoLogin();
        pintarCampoSenha();
        pintarCampoNome();
        pintarCampoCPF();
        pintarCampoEmail();
        pintarCampoTipoUsuario();
        pintarBotaoRegistrar();
        pintarBotaoVoltar();

        JPanel linhaLoginSenha = pintarLinhasLoginSenha();
        JPanel linhaNomeCPF = pintarLinhasNomeCPF();
        JPanel linhaEmail = pintarLinhaEmailTipoUsuario();
        JPanel linhaBotoes = pintarLinhaBotoes();

        Component boxTopo = Box.createRigidArea(new Dimension(this.getLargura_monitor(), (int) (this.getAltura_monitor() / 3.5)));
        Component boxSolo = Box.createRigidArea(new Dimension(this.getLargura_monitor(), (int) (this.getAltura_monitor() / 5.5)));

        conteiner.add(this.getTituloRegistrar());
        
        conteiner.add(linhaNomeCPF);
        conteiner.add(linhaEmail);
        conteiner.add(linhaLoginSenha);
        conteiner.add(linhaBotoes);

        this.registroJPanel.add(boxTopo);
        this.registroJPanel.add(conteiner);
        this.registroJPanel.add(boxSolo);

    }

    public JPanel pintarLinhasLoginSenha() {
        JLabel labelLogin = new JLabel();
        labelLogin.setText("Login:");

        JLabel labelSenha = new JLabel();
        labelSenha.setText("Senha:");

        JPanel linhaLogin = new JPanel();
        linhaLogin.setLayout(new FlowLayout(FlowLayout.LEFT));
        linhaLogin.add(labelLogin);
        linhaLogin.add(this.getLoginJTextField());

        JPanel linhaSenha = new JPanel();
        linhaSenha.setLayout(new FlowLayout(FlowLayout.LEFT));
        linhaSenha.add(labelSenha);
        linhaSenha.add(this.getSenhaJTextField());

        JPanel linhaLoginSenha = new JPanel();
        linhaLoginSenha.setLayout(new FlowLayout(FlowLayout.LEFT));
        linhaLoginSenha.add(linhaLogin);
        linhaLoginSenha.add(linhaSenha);

        return linhaLoginSenha;
    }

    public JPanel pintarLinhasNomeCPF() {
        JLabel labelNome = new JLabel();
        labelNome.setText("Nome:");

        JLabel labelCPF = new JLabel();
        labelCPF.setText("CPF:");

        JPanel linhaNome = new JPanel();
        linhaNome.setLayout(new FlowLayout(FlowLayout.LEFT));
        linhaNome.add(labelNome);
        linhaNome.add(this.getNomeJTextField());

        JPanel linhaCPF = new JPanel();
        linhaCPF.setLayout(new FlowLayout(FlowLayout.LEFT));
        linhaCPF.add(labelCPF);
        linhaCPF.add(this.getCPFJTextField());

        JPanel linhaNomeCPF = new JPanel();
        linhaNomeCPF.setLayout(new FlowLayout(FlowLayout.LEFT));
        linhaNomeCPF.add(linhaNome);
        linhaNomeCPF.add(linhaCPF);

        return linhaNomeCPF;
    }

    public JPanel pintarLinhaBotoes() {

        JPanel linhaBotoes = new JPanel();
        linhaBotoes.setLayout(new FlowLayout(FlowLayout.CENTER));
        linhaBotoes.add(this.getVoltarJButton());
        linhaBotoes.add(this.getRegistrarJButton());

        return linhaBotoes;
    }

    public void pintarBotaoVoltar() {
        this.setVoltarJButton(new JButton("Voltar"));
        this.getVoltarJButton().setPreferredSize(new Dimension(this.getLargura_monitor() / 8, 30));
        this.getVoltarJButton().setMaximumSize(this.getVoltarJButton().getPreferredSize());
        this.getVoltarJButton().setAlignmentX(Component.CENTER_ALIGNMENT);
        //this.entrarJButton.addActionListener();

    }

    public void pintarBotaoRegistrar() {
        this.setRegistrarJButton(new JButton("Registrar"));
        this.getRegistrarJButton().setPreferredSize(new Dimension(this.getLargura_monitor() / 8, 30));
        this.getRegistrarJButton().setMaximumSize(this.getRegistrarJButton().getPreferredSize());
        this.getRegistrarJButton().setAlignmentX(Component.CENTER_ALIGNMENT);

    }

    public JPanel pintarLinhaEmailTipoUsuario() {
        JLabel labelEmail = new JLabel();
        labelEmail.setText("Email:");

        JLabel labelTipoUsuario = new JLabel();
        labelTipoUsuario.setText("Tipo Usuario:");

        JPanel linhaEmailTipoUsuario = new JPanel();
        linhaEmailTipoUsuario.setLayout(new FlowLayout(FlowLayout.LEFT));
        linhaEmailTipoUsuario.add(labelEmail);
        linhaEmailTipoUsuario.add(this.getEmailJTextField());
        linhaEmailTipoUsuario.add(labelTipoUsuario);
        linhaEmailTipoUsuario.add(this.getTipoUsuario());

        return linhaEmailTipoUsuario;
    }

    public void pintarCampoLogin() {

        this.setLoginJTextField(new JTextField(""));

        this.getLoginJTextField().setPreferredSize(new Dimension(this.getLargura_monitor() / 5, 30));
        this.getLoginJTextField().setMaximumSize(this.getLoginJTextField().getPreferredSize());
        this.getLoginJTextField().setAlignmentX(Component.CENTER_ALIGNMENT);

    }

    public void pintarCampoTipoUsuario() {

        Vector<String> tipoUsuario = new Vector<>();
        tipoUsuario.add("Aluno");
        tipoUsuario.add("Professor");

        this.setTipoUsuario(new JComboBox(tipoUsuario));

        this.getTipoUsuario().setPreferredSize(new Dimension(this.getLargura_monitor() / 5, 30));
        this.getTipoUsuario().setMaximumSize(this.getTipoUsuario().getPreferredSize());
        this.getTipoUsuario().setAlignmentX(Component.CENTER_ALIGNMENT);

    }

    public void pintarCampoSenha() {

        this.setSenhaJTextField(new JTextField(""));

        this.getSenhaJTextField().setPreferredSize(new Dimension(this.getLargura_monitor() / 5, 30));
        this.getSenhaJTextField().setMaximumSize(this.getSenhaJTextField().getPreferredSize());
        this.getSenhaJTextField().setAlignmentX(Component.CENTER_ALIGNMENT);

    }

    public void pintarCampoEmail() {

        this.setEmailJTextField(new JTextField(""));

        this.getEmailJTextField().setPreferredSize(new Dimension(this.getLargura_monitor() / 5, 30));
        this.getEmailJTextField().setMaximumSize(this.getEmailJTextField().getPreferredSize());
        this.getEmailJTextField().setAlignmentX(Component.CENTER_ALIGNMENT);

    }

    public void pintarCampoCPF() {

        this.setCPFJTextField(new JTextField(""));

        this.getCPFJTextField().setPreferredSize(new Dimension(this.getLargura_monitor() / 5, 30));
        this.getCPFJTextField().setMaximumSize(this.getCPFJTextField().getPreferredSize());
        this.getCPFJTextField().setAlignmentX(Component.CENTER_ALIGNMENT);

    }

    public void pintarCampoNome() {

        this.setNomeJTextField(new JTextField(""));

        this.getNomeJTextField().setPreferredSize(new Dimension(this.getLargura_monitor() / 5, 30));
        this.getNomeJTextField().setMaximumSize(this.getNomeJTextField().getPreferredSize());
        this.getNomeJTextField().setAlignmentX(Component.CENTER_ALIGNMENT);

    }

    /**
     * @return the registroJPanel
     */
    public JPanel getRegistroJPanel() {
        return registroJPanel;
    }

    /**
     * @param registroJPanel the registroJPanel to set
     */
    public void setRegistroJPanel(JPanel registroJPanel) {
        this.registroJPanel = registroJPanel;
    }

    /**
     * @return the tituloRegistrar
     */
    public JLabel getTituloRegistrar() {
        return tituloRegistrar;
    }

    /**
     * @param tituloRegistrar the tituloRegistrar to set
     */
    public void setTituloRegistrar(JLabel tituloRegistrar) {
        this.tituloRegistrar = tituloRegistrar;
    }

    /**
     * @return the tipoUsuario
     */
    public JComboBox getTipoUsuario() {
        return tipoUsuario;
    }

    /**
     * @param tipoUsuario the tipoUsuario to set
     */
    public void setTipoUsuario(JComboBox tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    /**
     * @return the nomeJTextField
     */
    public JTextField getNomeJTextField() {
        return nomeJTextField;
    }

    /**
     * @param nomeJTextField the nomeJTextField to set
     */
    public void setNomeJTextField(JTextField nomeJTextField) {
        this.nomeJTextField = nomeJTextField;
    }

    /**
     * @return the CPFJTextField
     */
    public JTextField getCPFJTextField() {
        return CPFJTextField;
    }

    /**
     * @param CPFJTextField the CPFJTextField to set
     */
    public void setCPFJTextField(JTextField CPFJTextField) {
        this.CPFJTextField = CPFJTextField;
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
     * @return the senhaJTextField
     */
    public JTextField getSenhaJTextField() {
        return senhaJTextField;
    }

    /**
     * @param senhaJTextField the senhaJTextField to set
     */
    public void setSenhaJTextField(JTextField senhaJTextField) {
        this.senhaJTextField = senhaJTextField;
    }

    /**
     * @return the emailJTextField
     */
    public JTextField getEmailJTextField() {
        return emailJTextField;
    }

    /**
     * @param emailJTextField the emailJTextField to set
     */
    public void setEmailJTextField(JTextField emailJTextField) {
        this.emailJTextField = emailJTextField;
    }

    /**
     * @return the voltarJButton
     */
    public JButton getVoltarJButton() {
        return voltarJButton;
    }

    /**
     * @param voltarJButton the voltarJButton to set
     */
    public void setVoltarJButton(JButton voltarJButton) {
        this.voltarJButton = voltarJButton;
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
