/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

import classes.Cliente;
import classes.Pets;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vifer
 */
public class DadosClientes {
    public static List<Cliente> lstClientes = new ArrayList<>(); 
    
    public static List<Cliente> obterClientePeloNome(String nome, List<Cliente> listaClientes){
        List<Cliente> clientesTemp = new ArrayList<>();
        for (Cliente cliente : listaClientes){
            if(cliente.getNome().equalsIgnoreCase(nome)){
                clientesTemp.add(cliente);
            }
        }
        return clientesTemp;
    }
    
    public static Cliente obterClientePeloNomeCompleto(String nome, List<Cliente> listaClientes){
        for (Cliente cliente : listaClientes) {
            if (cliente.getNome().equalsIgnoreCase(nome)){
                return cliente;
            }
        }
        return null;
    }
    
   
    
}
