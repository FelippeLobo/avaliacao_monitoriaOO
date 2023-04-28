package Avaliacao_monitoriaOO;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */



import controller.geradores.GeradorDepartamento;
import java.io.IOException;
import javax.swing.JFrame;
import model.Departamento;
import view.View;

/**
 *
 * @author felip
 */
public class Avaliacao_monitoriaOO {

    public static void main(String[] args) throws IOException {
       GeradorDepartamento gd = new GeradorDepartamento();
       Departamento departamento = (Departamento) gd.gerar(0);
       
       View view = new View(departamento);
       
    }
}
