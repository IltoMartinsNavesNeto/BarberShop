/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Model.Agendamento;
import Model.Cliente;
import Model.Servico;
import Model.Usuario;

/**
 *
 * @author ilton
 */
public class Main {
    public static void main(String[] args) {
        
        Cliente cliente = new Cliente(1, "neto", "rua maria grossi 120", "34991431979");
        Usuario usuario = new Usuario(1, "barbeiro", "senha");
        Servico servico = new Servico(1, "barba", 30);
 
        
        Agendamento agendamento = new Agendamento(1, cliente, servico, 30, "27/11/2024 09:15");  
        System.out.println(agendamento);
        
    }
    
}
