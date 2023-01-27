/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.Helper;

import Visual.Agenda;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


import model.Agendamento;
import model.Cliente;
import model.Servico;

/**
 *
 * @author wil.william
 */
public class AgendaHelper implements IHelper{
    private final Agenda view;

    public AgendaHelper(Agenda view) {
        this.view = view;
    }

    public void preencherTabela(ArrayList<Agendamento> agendamentos) {
        DefaultTableModel tableModel =(DefaultTableModel)view.getTblTabAgenda().getModel();
        tableModel.setNumRows(0);
        
        //Percorrer a lista preenchendo o table model
        for (Agendamento agendamento : agendamentos)
            
            tableModel.addRow(new Object[]{
                agendamento.getId(),
                agendamento.getCliente().getNome(),               
                agendamento.getServico().getDescricao(),
                agendamento.getValor(),
                agendamento.getDataFormatada(),
                agendamento.getHoraFormatada(),
                agendamento.getObservacao()
            });
        {
            
        }
    }

    public void preencherClientes(ArrayList<Cliente> clientes) {
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getCboCliente().getModel();
        for (Cliente cliente : clientes){
            comboBoxModel.addElement(cliente);
        }
    }       

    public void preencherServicos(ArrayList<Servico> servicos) {
       DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getCbxServico().getModel();
        for (Servico servico : servicos) {
            comboBoxModel.addElement(servico);                
        }
    }
    
     public Cliente obterCliente() {
      return(Cliente) view.getCboCliente().getSelectedItem();
     
    }

    public Servico obterServico() {
      return(Servico) view.getCbxServico().getSelectedItem();
     
    }

    public void setarValor(float valor) {
       view.getTxtValor().setText(valor+"");
    }
    

    @Override
    public Agendamento obterModelo() {
       String idString = view.getTxtId().getText();
       int id = Integer.parseInt(idString);
       Cliente cliente = obterCliente();
       Servico servico = obterServico();
       String valorString = view.getTxtValor().getText();
       float valor = Float.parseFloat(valorString);
       String data = view.getTxtData().getText();
       String hora = view.getTxtHora().getText();
       String dataHora = data + " " + hora;
     
       
       Agendamento agendamento = new Agendamento(id, cliente,servico,valor,dataHora);
       return agendamento;
    }

    @Override
    public void limparTela() {
       view.getTxtId().setText("0");
       view.getTxtData().setText("");
       view.getTxtHora().setText("");
     
    }
}
   

