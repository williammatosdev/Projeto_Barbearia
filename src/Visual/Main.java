/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visual;

import model.Agendamento;

import model.Cliente;
import model.Servico;
import model.Usuario;

/**
 *
 * @author wil.william
 */
public class Main {

    private static String barbeiro;
    public static void main(String[]args){
                
        Servico servico = new Servico(1,"barba",30);
        
        System.out.println(servico.getDescricao());
        System.out.println(servico.getValor());
        
        Cliente cliente = new Cliente(1,"Jonathan Queiroz","Rua Das Figueiras","04556-190");
        System.out.println(cliente.getNome());
        
        
        
        Usuario usuario = new Usuario(1,"admin,","1234");
        System.out.println(usuario.getNome());
        
        Agendamento agendamento = new Agendamento(1, cliente, servico, 30, "21/01/2023 10:20");
        System.out.println(agendamento.getCliente().getNome());
                    
    }
            
}
