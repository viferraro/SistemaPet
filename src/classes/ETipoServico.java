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
public enum ETipoServico {
    VETERINARIA("Clínica Veterinária"),
    BANHOETOSA("Banho e tosa"),
    FARMACIA("Medicamentos"),
    RACAO("Ração"),
    OUTROS("Outros Produtos");
    
    public String tipoServico;
    
    ETipoServico (String tipoServico){
        this.tipoServico = tipoServico;
    }
    
    public String getText(){
        return this.tipoServico;
    }
}
