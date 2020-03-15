/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 *
 * @author vifer
 */
public class Cliente {
    private List<Pets> pet;
    private List<Servico> servico;
    private String nome;
    private String telefone;
    private Integer cadastroId;
    private Date dataCadastro;
    
    public Cliente(){
        this.pet = new ArrayList<>();
        this.servico = new ArrayList<>();
        Random aleatorio = new Random();
        this.cadastroId = aleatorio.nextInt(999999);
        this.dataCadastro = new Date();
        }
    
    

    /**
     * @return the pet
     */
    public List<Pets> getPet() {
        return pet;
    }

    /**
     * @param pet the pet to set
     */
    public void setPet(List<Pets> pet) {
        this.pet = pet;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the cadastroId
     */
    public Integer getCadastroId() {
        return cadastroId;
    }

    /**
     * @param cadastroId the cadastroId to set
     */
    public void setCadastroId(Integer cadastroId) {
        this.cadastroId = cadastroId;
    }

    /**
     * @return the dataCadastro
     */
    public Date getDataCadastro() {
        return dataCadastro;
    }

    /**
     * @param dataCadastro the dataCadastro to set
     */
    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    /**
     * @return the servico
     */
    public List<Servico> getServico() {
        return servico;
    }

    /**
     * @param servico the servico to set
     */
    public void setServico(List<Servico> servico) {
        this.servico = servico;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
}
