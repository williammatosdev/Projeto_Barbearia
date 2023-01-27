/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Model.DAO.UsuarioDAO;
import Visual.Login;
import Visual.MenuPrincipal;
import controller.Helper.LoginHelper;
import model.Usuario;

/**
 *
 * @author wil.william
 */
public class LoginController {
    
    private final Login view;
    private LoginHelper helper;

    public LoginController(Login view) {
        this.view = view;
        this.helper = new LoginHelper(view);
    }
    
    public void entrarNoSistema(){
       
        Usuario usuario = helper.obterModelo();        
        //Pegar um Usuario da view
        //Pesquisa Usuario no Banco
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        Usuario usuarioAutenticado = usuarioDAO.selectPorNomeESenha(usuario);
          //Se usuario da view tiver mesmo usuario e senha que usuario vindo do Banco direcionar para menu principal
        //caso não for mostrar uma mensagem ao usuário "Usuario ou senha invalidos".
        if (usuarioAutenticado != null){
            MenuPrincipal menu = new MenuPrincipal();
            menu.setVisible(true);
            this.view.dispose();
        }else{
            view.exibeMensagem("Usuário ou senha inválidos");
        }
      
    }
    
     public void fizTarefa(){
         System.out.println("Busquei algo do Banco de Dados");
         
         this.view.exibeMensagem("Executei o fiz tarefa");
    }

    private void selectPorNomeeSenha(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}
