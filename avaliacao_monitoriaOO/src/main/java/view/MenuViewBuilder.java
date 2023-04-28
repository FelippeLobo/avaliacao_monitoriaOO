/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Vector;
import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Disciplina;
import model.usuarios.Aluno;
import model.Departamento;

/**
 *
 * @author felip
 */
public class MenuViewBuilder {

    private JPanel menuJPanel;
    private Departamento departamento;
    private JPanel disciplinasJPanel;
    private JTable disciplinaJTable;

    private JPanel alunosJPanel;
    private JTable alunosJTable;

    private JPanel historicoJPanel;
    private JPanel historicoTableJPanel;
    private JPanel testeJPanel;
    private JComboBox historicoJComboBox;
    private JButton analisarHistoricoJButton;
    private JTable historicoJTable;

    private int largura_monitor;
    private int altura_monitor;

    public MenuViewBuilder(Departamento departamento) throws IOException {

        this.departamento = departamento;

        this.largura_monitor = (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth();
        this.altura_monitor = (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight();

        pintarQuadroDisciplinas();
        pintarQuadroAlunos();
        pintarQuadroHistorico();

        this.menuJPanel = new JPanel();

        JTabbedPane guia = new JTabbedPane();

        ImageIcon iconeDisciplinas = criaIcone("../disciplinas.png");
        guia.addTab("Disciplinas", iconeDisciplinas, this.disciplinasJPanel, "Disciplinas");
        guia.setMnemonicAt(0, KeyEvent.VK_1);

        ImageIcon iconeAlunos = criaIcone("../alunos.png");
        guia.addTab("Alunos", iconeAlunos, this.alunosJPanel, "Alunos");
        guia.setMnemonicAt(1, KeyEvent.VK_2);

        ImageIcon iconeHistorico = criaIcone("../historico.png");
        guia.addTab("Historico", iconeHistorico, this.historicoJPanel, "Historico");
        guia.setMnemonicAt(2, KeyEvent.VK_3);

        guia.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
        guia.setPreferredSize(new Dimension(this.getLargura_monitor(), this.getAltura_monitor()));
        guia.setMaximumSize(guia.getPreferredSize());

        JPanel conteiner = new JPanel();
        conteiner.setLayout(new FlowLayout(FlowLayout.CENTER));
        conteiner.setPreferredSize(new Dimension(this.getLargura_monitor(), this.getAltura_monitor()));
        conteiner.setMaximumSize(conteiner.getPreferredSize());
        conteiner.add(guia);

        this.menuJPanel.add(conteiner);
        this.menuJPanel.setPreferredSize(new Dimension(this.getLargura_monitor(), this.getAltura_monitor()));
        this.menuJPanel.setMaximumSize(this.menuJPanel.getPreferredSize());

    }

    protected ImageIcon criaIcone(String path) throws IOException {
        BufferedImage imagemSigaOBJ = ImageIO.read(new File(path));

        if (imagemSigaOBJ != null) {
            return new ImageIcon(imagemSigaOBJ);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }

    }

    public void pintarQuadroHistorico() {

        this.setHistoricoJPanel(new JPanel());
        this.getHistoricoJPanel().setPreferredSize(new Dimension(this.getLargura_monitor(), this.getAltura_monitor()));
        this.getHistoricoJPanel().setMaximumSize(this.getHistoricoJPanel().getPreferredSize());

        pintarComboBoxHistorico();
        pintarJButtonHistorico();

        JPanel conteiner = new JPanel();
        conteiner.setLayout(new FlowLayout(FlowLayout.CENTER));
        conteiner.setPreferredSize(new Dimension(this.getLargura_monitor(), 45));
        conteiner.setMaximumSize(conteiner.getPreferredSize());

        conteiner.add(this.getHistoricoJComboBox());
        conteiner.add(this.getAnalisarHistoricoJButton());

        this.getHistoricoJPanel().add(conteiner);

        pintarTabelaHistorico();

        this.getHistoricoJPanel().add(this.getHistoricoTableJPanel());
    }

    public void pintarTabelaHistorico() {

        this.setHistoricoTableJPanel(new JPanel());

        Vector<String> colunas = new Vector<>();
        colunas.add("Nome Disciplina");
        colunas.add("Codigo");
        colunas.add("Nota");
        colunas.add("Situação");
        float nota = 0;
        Vector<Vector> linhas = new Vector<>();

        for (int i = 0; i < 10; i++) {
            Vector<String> linha = new Vector<>();
            linha.add("");
            linha.add("");
            linha.add("");
            linha.add("");
            linhas.add(linha);

        }

        this.setHistoricoJTable(new JTable(linhas, colunas));
        JScrollPane scrollPane = new JScrollPane(this.getHistoricoJTable());
        this.getHistoricoTableJPanel().add(scrollPane, BorderLayout.CENTER);
        this.getHistoricoTableJPanel().setPreferredSize(new Dimension(this.getLargura_monitor(), this.getAltura_monitor() - 45));
        this.getHistoricoTableJPanel().setMaximumSize(this.getHistoricoTableJPanel().getPreferredSize());

    }

    protected void pintarComboBoxHistorico() {
        Vector<String> alunos = new Vector<>();

        for (Aluno aluno : this.getDepartamento().getAlunos()) {
            alunos.add(aluno.getNome());
        }

        this.setHistoricoJComboBox(new JComboBox(alunos));

        this.getHistoricoJComboBox().setPreferredSize(new Dimension(this.getLargura_monitor() / 5, 30));
        this.getHistoricoJComboBox().setMaximumSize(this.getHistoricoJComboBox().getPreferredSize());
        this.getHistoricoJComboBox().setAlignmentX(Component.CENTER_ALIGNMENT);
    }

    protected void pintarJButtonHistorico() {
        this.setAnalisarHistoricoJButton(new JButton("Analisar"));
        this.getAnalisarHistoricoJButton().setPreferredSize(new Dimension(this.getLargura_monitor() / 5, 30));
        this.getAnalisarHistoricoJButton().setMaximumSize(this.getAnalisarHistoricoJButton().getPreferredSize());
        this.getAnalisarHistoricoJButton().setAlignmentX(Component.CENTER_ALIGNMENT);
    }

    protected void pintarQuadroAlunos() {
        this.setAlunosJPanel(new JPanel());

        Vector<String> colunas = new Vector<>();
        colunas.add("Nome");
        colunas.add("Matricula");
        colunas.add("Email");
        colunas.add("Curso");
        colunas.add("Materias Cursadas");

        Vector<Vector> linhas = new Vector<>();

        for (Aluno aluno : this.getDepartamento().getAlunos()) {
            Vector<String> linha = new Vector<>();
            linha.add(aluno.getNome());
            linha.add(aluno.getMatricula());
            linha.add(aluno.getEmail());
            linha.add(aluno.getCurso());
            linha.add(aluno.getDisciplinas_cursadas().size() + "");
            linhas.add(linha);
            linha = new Vector<>();
        }

        this.setAlunosJTable(new JTable(linhas, colunas));
        JScrollPane scrollPane = new JScrollPane(this.getAlunosJTable());

        this.getAlunosJPanel().add(scrollPane, BorderLayout.CENTER);
        this.getAlunosJPanel().setPreferredSize(new Dimension(this.getLargura_monitor(), this.getAltura_monitor()));
        this.getAlunosJPanel().setMaximumSize(this.getAlunosJPanel().getPreferredSize());
    }

    protected void pintarQuadroDisciplinas() {

        this.setDisciplinasJPanel(new JPanel());

        Vector<String> colunas = new Vector<>();
        colunas.add("Nome");
        colunas.add("Codigo");
        colunas.add("Professor");
        colunas.add("Numero de Alunos");
        colunas.add("Ementa");

        Vector<Vector> linhas = new Vector<>();

        for (Disciplina disciplina : this.getDepartamento().getDisciplinas_ofertadas()) {
            Vector<String> linha = new Vector<>();
            linha.add(disciplina.getNome());
            linha.add(disciplina.getCodigo());
            linha.add(disciplina.getProfessor().getNome());
            linha.add(disciplina.getAlunos_matriculados().size() + "");
            linha.add(disciplina.getEmenta());
            linhas.add(linha);
            linha = new Vector<>();
        }

        this.setDisciplinaJTable(new JTable(linhas, colunas));
        JScrollPane scrollPane = new JScrollPane(this.getDisciplinaJTable());

        this.getDisciplinasJPanel().add(scrollPane, BorderLayout.CENTER);
        this.getDisciplinasJPanel().setPreferredSize(new Dimension(this.getLargura_monitor(), this.getAltura_monitor()));
        this.getDisciplinasJPanel().setMaximumSize(this.getDisciplinasJPanel().getPreferredSize());
    }

    /**
     * @return the menuJPanel
     */
    public JPanel getMenuJPanel() {
        return menuJPanel;
    }

    /**
     * @param menuJPanel the menuJPanel to set
     */
    public void setMenuJPanel(JPanel menuJPanel) {
        this.menuJPanel = menuJPanel;
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

    /**
     * @return the disciplinasJPanel
     */
    public JPanel getDisciplinasJPanel() {
        return disciplinasJPanel;
    }

    /**
     * @param disciplinasJPanel the disciplinasJPanel to set
     */
    public void setDisciplinasJPanel(JPanel disciplinasJPanel) {
        this.disciplinasJPanel = disciplinasJPanel;
    }

    /**
     * @return the disciplinaJTable
     */
    public JTable getDisciplinaJTable() {
        return disciplinaJTable;
    }

    /**
     * @param disciplinaJTable the disciplinaJTable to set
     */
    public void setDisciplinaJTable(JTable disciplinaJTable) {
        this.disciplinaJTable = disciplinaJTable;
    }

    /**
     * @return the alunosJPanel
     */
    public JPanel getAlunosJPanel() {
        return alunosJPanel;
    }

    /**
     * @param alunosJPanel the alunosJPanel to set
     */
    public void setAlunosJPanel(JPanel alunosJPanel) {
        this.alunosJPanel = alunosJPanel;
    }

    /**
     * @return the alunosJTable
     */
    public JTable getAlunosJTable() {
        return alunosJTable;
    }

    /**
     * @param alunosJTable the alunosJTable to set
     */
    public void setAlunosJTable(JTable alunosJTable) {
        this.alunosJTable = alunosJTable;
    }

    /**
     * @return the historicoJPanel
     */
    public JPanel getHistoricoJPanel() {
        return historicoJPanel;
    }

    /**
     * @param historicoJPanel the historicoJPanel to set
     */
    public void setHistoricoJPanel(JPanel historicoJPanel) {
        this.historicoJPanel = historicoJPanel;
    }

    /**
     * @return the historicoJComboBox
     */
    public JComboBox getHistoricoJComboBox() {
        return historicoJComboBox;
    }

    /**
     * @param historicoJComboBox the historicoJComboBox to set
     */
    public void setHistoricoJComboBox(JComboBox historicoJComboBox) {
        this.historicoJComboBox = historicoJComboBox;
    }

    /**
     * @return the analisarHistoricoJButton
     */
    public JButton getAnalisarHistoricoJButton() {
        return analisarHistoricoJButton;
    }

    /**
     * @param analisarHistoricoJButton the analisarHistoricoJButton to set
     */
    public void setAnalisarHistoricoJButton(JButton analisarHistoricoJButton) {
        this.analisarHistoricoJButton = analisarHistoricoJButton;
    }

    /**
     * @return the historicoJTable
     */
    public JTable getHistoricoJTable() {
        return historicoJTable;
    }

    /**
     * @param historicoJTable the historicoJTable to set
     */
    public void setHistoricoJTable(JTable historicoJTable) {
        this.historicoJTable = historicoJTable;
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

    /**
     * @return the historicoTableJPanel
     */
    public JPanel getHistoricoTableJPanel() {
        return historicoTableJPanel;
    }

    /**
     * @param historicoTableJPanel the historicoTableJPanel to set
     */
    public void setHistoricoTableJPanel(JPanel historicoTableJPanel) {
        this.historicoTableJPanel = historicoTableJPanel;
    }
}
