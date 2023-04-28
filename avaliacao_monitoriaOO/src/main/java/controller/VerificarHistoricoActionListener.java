/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import model.Disciplina;
import model.usuarios.Aluno;
import view.View;

/**
 *
 * @author felip
 */
public class VerificarHistoricoActionListener implements ActionListener {

    private Aluno aluno;
    private View view;

    public VerificarHistoricoActionListener(Aluno aluno, View view) {
        this.aluno = aluno;
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        JTable tableUpdate = new JTable();
        this.view.getMenuViewBuilder().getHistoricoTableJPanel().removeAll();
        TableColumnModel columnModel = this.view.getMenuViewBuilder().getHistoricoJTable().getColumnModel();

        DefaultTableModel tableModel = new DefaultTableModel();

        float nota = 0;
        Vector<Vector> linhas = new Vector<>();
        if (aluno != null) {
            for (Disciplina disciplina : aluno.getDisciplinas_cursadas()) {
                nota = disciplina.consultarNota(aluno);
                Vector<String> linha = new Vector<>();
                linha.add(disciplina.getNome());
                linha.add(disciplina.getCodigo());
                linha.add(nota + "");
                if (nota >= 60) {
                    linha.add("APROVADO");
                } else {
                    linha.add("REPROVADO");
                }
                tableModel.addRow(linha);

            }

            tableUpdate.setColumnModel(columnModel);
            tableUpdate.setModel(tableModel);
            tableUpdate.setVisible(true);

            this.view.getMenuViewBuilder().setHistoricoJTable(new JTable(tableModel, columnModel));
            JScrollPane scrollPane = new JScrollPane(this.view.getMenuViewBuilder().getHistoricoJTable());
            this.view.getMenuViewBuilder().getHistoricoTableJPanel().add(scrollPane, BorderLayout.CENTER);
            this.view.getMenuViewBuilder().getHistoricoTableJPanel().setPreferredSize(new Dimension(this.view.getMenuViewBuilder().getLargura_monitor(), this.view.getMenuViewBuilder().getAltura_monitor() - 45));
            this.view.getMenuViewBuilder().getHistoricoTableJPanel().setMaximumSize(this.view.getMenuViewBuilder().getHistoricoTableJPanel().getPreferredSize());
        }
    }
}
