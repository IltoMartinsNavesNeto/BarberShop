    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Model;


/**
 *
 * @author ilton
 */
public class Cliente extends Pessoa {

    private String endereco;
    private String cep;

    public Cliente(String endereco, String cep, int id, String nome, char sexo, String dataNascimento, String telefone, String Email, String rg) {
        super(id, nome, sexo, dataNascimento, telefone, Email, rg);
        this.endereco = endereco;
        this.cep = cep;
    }

    public Cliente(int id, String nome, String endereco, String cep) {
        super(id, nome);
        this.endereco = endereco;
        this.cep = cep;
    }
    
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    @Override
    public String toString() {
        return "Cliente{" + "endereco=" + endereco + ", cep=" + cep + '}';
    }
    
    

   
}
