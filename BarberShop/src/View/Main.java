/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Model.Cliente;
import Model.Servico;
import Model.Usuario;

/**
 *
 * @author ilton
 */
public class Main {
    public static void main(String[] args) {
        
        Servico barba = new Servico(1, "Barba", 30);
        Cliente cliente = new Cliente(1, "neto", 'M', "34991431979","rua maria grossi");
        Usuario usuario = new Usuario(1, "barbeiro", "1234");
        
        System.out.println(barba.getValor());
        System.out.println(cliente.getNome());
        System.out.println(usuario);
        
        
        
    }
    
}
