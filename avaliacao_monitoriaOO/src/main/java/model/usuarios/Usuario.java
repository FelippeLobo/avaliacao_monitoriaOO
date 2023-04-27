/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.usuarios;

/**
 *
 * @author felip
 */
class Usuario {

    private String nome;
    private String CPF;
    private String login;
    private String password;
    private String email;
    
    Usuario(String nome, String CPF, String login, String password, String email){
        this.nome = nome;
        this.CPF = CPF;
        this.login = login;
        this.password = password;
        this.email = email;
    }
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the CPF
     */
    public String getCPF() {
        return CPF;
    }

    /**
     * @param CPF the CPF to set
     */
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    /**
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

}
