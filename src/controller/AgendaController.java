/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Model.DAO.AgendamentoDAO;
import Model.DAO.ClienteDAO;
import Model.DAO.ServicoDAO;
import Visual.Agenda;
import controller.Helper.AgendaHelper;
import java.util.ArrayList;
import model.Agendamento;
import model.Cliente;
import model.Servico;
import servico.Correio;

/**
 *
 * @author wil.william
 */
public class AgendaController {
    private final Agenda view;
    private final AgendaHelper helper;

    public AgendaController(Agenda view) {
        this.view = view;
        this.helper = new AgendaHelper(view);
    }
    public void atualizaTabela(){
        //Buscar lista com agendamentodos do Banco de Dados
        AgendamentoDAO agendamentoDAO = new AgendamentoDAO();
        ArrayList<Agendamento> agendamentos = agendamentoDAO.selectAll();
        
        //Exibir está lista na view
        helper.preencherTabela(agendamentos);        
    }
    public void atualizaCliente(){
        //Buscar Clientes do Banco de Dados
        ClienteDAO clienteDAO = new ClienteDAO();
        ArrayList<Cliente> clientes = clienteDAO.selectAll();
        //Exibir Clientes no Combobox cliente
        helper.preencherClientes(clientes);
    }
   
    public void atualizaServico(){
        ServicoDAO servicoDAO = new ServicoDAO();
        ArrayList<Servico> servicos = servicoDAO.selectAll();
         helper.preencherServicos(servicos);
    }
    public void atualizaValor(){
        Servico servico = helper.obterServico();
         helper.setarValor(servico.getValor());
    }
    public void agendar(){
        //Buscar Objeto Agendamento da Tela
        Agendamento agendamento = helper.obterModelo();
        //Salvar Objeto no Banco de Dados
        new AgendamentoDAO().insert(agendamento);
        
        Correio correio = new Correio();
        correio.NotificarPorEmail(agendamento);
        //inserir elemento da tabela
        atualizaTabela();
        helper.limparTela();
    }
}
