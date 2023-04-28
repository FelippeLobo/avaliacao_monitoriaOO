/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 * 

 */
package classesExternas;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author felip
 */
public class Randomizador {

    /*
     * 
     * Metodo Retirado do site: https://www.guj.com.br/t/gerador-de-cpf-cnpj-e-rg/208421/3
     * Data 27/04/2023 22:41h
     *
     */
    public static String gerarCPFAleatorio() {
        int digito1 = 0, digito2 = 0, resto = 0;
        String nDigResult;
        String numerosContatenados;
        String numeroGerado;

        Random numeroAleatorio = new Random();

        //numeros gerados
        int n1 = numeroAleatorio.nextInt(10);
        int n2 = numeroAleatorio.nextInt(10);
        int n3 = numeroAleatorio.nextInt(10);
        int n4 = numeroAleatorio.nextInt(10);
        int n5 = numeroAleatorio.nextInt(10);
        int n6 = numeroAleatorio.nextInt(10);
        int n7 = numeroAleatorio.nextInt(10);
        int n8 = numeroAleatorio.nextInt(10);
        int n9 = numeroAleatorio.nextInt(10);

        int soma = n9 * 2 + n8 * 3 + n7 * 4 + n6 * 5 + n5 * 6 + n4 * 7 + n3 * 8 + n2 * 9 + n1 * 10;

        int valor = (soma / 11) * 11;

        digito1 = soma - valor;

        //Primeiro resto da divisão por 11.
        resto = (digito1 % 11);

        if (digito1 < 2) {
            digito1 = 0;
        } else {
            digito1 = 11 - resto;
        }

        int soma2 = digito1 * 2 + n9 * 3 + n8 * 4 + n7 * 5 + n6 * 6 + n5 * 7 + n4 * 8 + n3 * 9 + n2 * 10 + n1 * 11;

        int valor2 = (soma2 / 11) * 11;

        digito2 = soma2 - valor2;

        //Primeiro resto da divisão por 11.
        resto = (digito2 % 11);

        if (digito2 < 2) {
            digito2 = 0;
        } else {
            digito2 = 11 - resto;
        }

        //Conctenando os numeros
        numerosContatenados = String.valueOf(n1) + String.valueOf(n2) + String.valueOf(n3) + "." + String.valueOf(n4)
                + String.valueOf(n5) + String.valueOf(n6) + "." + String.valueOf(n7) + String.valueOf(n8)
                + String.valueOf(n9) + "-";

        //Concatenando o primeiro resto com o segundo.
        nDigResult = String.valueOf(digito1) + String.valueOf(digito2);

        numeroGerado = numerosContatenados + nDigResult;

        return numeroGerado;

    }

    /*
     * Metodo Retirado do site: https://cursos.alura.com.br/forum/topico-gerar-nome-aleatorios-usando-random-e-tabela-ascii-74334
     * Data 27/04/2023 22:17h
     *
     */
    public static String gerarNomeAleatorio() {
        ThreadLocalRandom gerador = ThreadLocalRandom.current();

        int tamanhoNome = gerador.nextInt(3, 10);
        int tamanhoSobrenome = gerador.nextInt(3, 10);

        char primeiraLetraNome = (char) gerador.nextInt(65, 90);
        char primeiraLetraSobreNome = (char) gerador.nextInt(65, 90);

        StringBuilder nome = new StringBuilder().append(primeiraLetraNome);
        StringBuilder sobreNome = new StringBuilder().append(primeiraLetraNome);

        for (int i = 1; i < tamanhoNome; i++) {
            char letra = (char) gerador.nextInt(97, 122);
            nome.append(letra);
        }

        for (int i = 1; i < tamanhoSobrenome; i++) {
            char letra = (char) gerador.nextInt(97, 122);
            sobreNome.append(letra);
        }

        return nome + " " + sobreNome;
    }

    public static String gerarLoginAleatorio() {
        ThreadLocalRandom gerador = ThreadLocalRandom.current();

        int tamanhoLogin = gerador.nextInt(3, 10);

        StringBuilder login = new StringBuilder();

        for (int i = 1; i < tamanhoLogin; i++) {
            char letra = (char) gerador.nextInt(97, 122);
            login.append(letra);
        }

        return login + "";
    }

    public static String gerarSenhaAleatorio() {
        ThreadLocalRandom gerador = ThreadLocalRandom.current();

        int tamanhoSenha = gerador.nextInt(3, 10);

        StringBuilder senha = new StringBuilder();
        Random numeroAleatorio = new Random();

        //numeros gerados
        int flag = 0;
        for (int i = 1; i < tamanhoSenha; i++) {

            if (flag % 2 == 0) {
                char letra = (char) gerador.nextInt(97, 122);
                senha.append(letra);
            } else {
                int num = numeroAleatorio.nextInt(i);
                senha.append(num);
            }

            flag = numeroAleatorio.nextInt(i * 32);

        }

        return senha + "";
    }

    public static String gerarEmailAleatorio() {
        ThreadLocalRandom gerador = ThreadLocalRandom.current();

        int tamanhoNome = gerador.nextInt(3, 10);
        int tamanhoSobrenome = gerador.nextInt(3, 10);

        char primeiraLetraNome = (char) gerador.nextInt(65, 90);
        char primeiraLetraSobreNome = (char) gerador.nextInt(65, 90);

        StringBuilder nome = new StringBuilder().append(primeiraLetraNome);
        StringBuilder sobreNome = new StringBuilder().append(primeiraLetraNome);

        for (int i = 1; i < tamanhoNome; i++) {
            char letra = (char) gerador.nextInt(97, 122);
            nome.append(letra);
        }

        for (int i = 1; i < tamanhoSobrenome; i++) {
            char letra = (char) gerador.nextInt(97, 122);
            sobreNome.append(letra);
        }

        return nome + "" +  sobreNome + "@email.com.br";

    }
}
