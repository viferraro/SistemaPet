/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

import classes.Cliente;
import classes.Servico;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vifer
 */
public class DadosServicos {
    public static List<Servico> lstServicos = new ArrayList<>();
    
     public static String listaServicos(Cliente cliente){
         String nomesServicos = "";
        for(Servico servico : cliente.getServico()){
           nomesServicos += servico.getTipoServico().getText() + " / ";
        }
        return nomesServicos;
    }
    
     public static Double valorServicos(Cliente cliente){
         Double valorServicos = 0.0;
        for(Servico servico : cliente.getServico()){
           valorServicos += servico.getValorServico();
        }
        return valorServicos;
    }
}
