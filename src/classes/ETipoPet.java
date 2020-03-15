/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author vifer
 */
public enum ETipoPet {
    CANINO("Canino"),
    FELINO("Felino"),
    AVE("Ave"),
    ROEDOR("Roedor"),
    REPTIL("Réptil"),
    OUTROS("Outros");
    
    private String tipoPet;
    
    ETipoPet (String tipoPet){
        this.tipoPet = tipoPet;
    }
    
    public String getText(){
        return this.tipoPet;
    }
}

