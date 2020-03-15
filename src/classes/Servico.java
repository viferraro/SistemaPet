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
public class Servico {
    private ETipoServico tipoServico;
    private Double valorServico;
    
    public Servico(){
        
    }

    /**
     * @return the tipoServico
     */
    public ETipoServico getTipoServico() {
        return tipoServico;
    }

    /**
     * @param tipoServico the tipoServico to set
     */
    public void setTipoServico(ETipoServico tipoServico) {
        this.tipoServico = tipoServico;
    }

    /**
     * @return the valorServico
     */
    public Double getValorServico() {
        return valorServico;
    }

    /**
     * @param valorServico the valorServico to set
     */
    public void setValorServico(Double valorServico) {
        this.valorServico = valorServico;
    }
}
