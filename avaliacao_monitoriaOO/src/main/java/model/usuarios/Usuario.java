/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.usuarios;

/**
 *
 * @author felip
 */
public abstract class Usuario {

    private String nome;
    private String CPF;
    private String login;
    private String password;
    private String email;
    private String matricula;
    private int ID;
    
    Usuario(){}
    
    Usuario(String nome, String CPF, String login, String password, String email, int ID) {
        this.nome = nome;
        this.CPF = CPF;
        this.login = login;
        this.password = password;
        this.email = email;
        this.ID = ID;
    }
    
    protected abstract void gerarMatricula();
    
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    protected void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the CPF
     */
    protected String getCPF() {
        return CPF;
    }

    /**
     * @param CPF the CPF to set
     */
    protected void setCPF(String CPF) {
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
    protected void setLogin(String login) {
        this.login = login;
    }

    /**
     * @param password the password to set
     */
    protected void setPassword(String password) {
        this.password = password;
    }

    public boolean verificaSenha(char[] password) {

        char[] senha = this.password.toCharArray();

        if (password.length == senha.length) {
            for (int i = 0; i < password.length; i++) {
                if(senha[i] != password[i]){
                    return false;
                }
            }
            
            return true;
        }
        
        return false;
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
    protected void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    protected void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the ID
     */
    protected int getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    protected void setID(int ID) {
        this.ID = ID;
    }
    
    

}
