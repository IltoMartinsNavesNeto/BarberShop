/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;


/**
 *
 * @author ilton
 */
public class Usuario extends Pessoa {
    
    protected String senha;
    protected String nivelAcesso;

    public Usuario(int id, String nome, String senha, String nivelAcesso) {
        super(id, nome);
        this.senha = senha;
        this.nivelAcesso = nivelAcesso;
    }
 

    public Usuario(String senha, String nivelAcesso, int id, String nome, char sexo, Date dataNascimento, String telefone, String Email, String rg) {
        super(id, nome, sexo, dataNascimento, telefone, Email, rg);
        this.senha = senha;
        this.nivelAcesso = nivelAcesso;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(String nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }
    
    
    
    
}
