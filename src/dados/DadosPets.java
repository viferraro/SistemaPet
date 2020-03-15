/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

import classes.Cliente;
import classes.ETipoPet;
import classes.Pets;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vifer
 */
public class DadosPets {
    public static List<Pets> lstPets = new ArrayList<>();
    
     public static String listaNomesPets(Cliente cliente){
         String nomesPets = "";
        for(Pets pet : cliente.getPet()){
           nomesPets += pet.getNomePet() + " / ";
        }
        return nomesPets;
    }
     
     public static ETipoPet obterTipo(String tipo){
         for (ETipoPet tipoPet : ETipoPet.values()){
             if(tipoPet.getText().equalsIgnoreCase(tipo)){
                 return tipoPet;
     }
    
}
         return null;
     }
}
