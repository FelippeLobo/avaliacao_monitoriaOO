/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import view.View;

/**
 *
 * @author felip
 */
public class AlterarTelaActionListener implements ActionListener {

    private View jframe;
    private String janelaAtual;
    private String proximaJanela;

    public AlterarTelaActionListener(View jframe, String janelaAtual, String proximaJanela) {
        this.jframe = jframe;
        this.janelaAtual = janelaAtual;
        this.proximaJanela = proximaJanela;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("ENTREI");
        jframe.alterarJanela(this.janelaAtual, this.proximaJanela);

    }

}
