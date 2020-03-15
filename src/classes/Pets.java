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
public class Pets {
    private ETipoPet tipoPet;
    private String nomePet;
    private Integer idadePet;
    private Boolean castrado;
    
    public Pets(){
        
    }

    /**
     * @return the tipoPet
     */
    public ETipoPet getTipoPet() {
        return tipoPet;
    }

    /**
     * @param tipoPet the tipoPet to set
     */
    public void setTipoPet(ETipoPet tipoPet) {
        this.tipoPet = tipoPet;
    }

    /**
     * @return the nomePet
     */
    public String getNomePet() {
        return nomePet;
    }

    /**
     * @param nomePet the nomePet to set
     */
    public void setNomePet(String nomePet) {
        this.nomePet = nomePet;
    }

    /**
     * @return the idadePet
     */
    public Integer getIdadePet() {
        return idadePet;
    }

    /**
     * @param idadePet the idadePet to set
     */
    public void setIdadePet(Integer idadePet) {
        this.idadePet = idadePet;
    }

    /**
     * @return the castrado
     */
    public Boolean getCastrado() {
        return castrado;
    }

    /**
     * @param castrado the castrado to set
     */
    public void setCastrado(Boolean castrado) {
        this.castrado = castrado;
    }
}
