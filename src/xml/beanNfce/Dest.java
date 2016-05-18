/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xml.beanNfce;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 *
 * @author Leonel.Santos
 */
@XStreamAlias("dest")
public class Dest {

    @XStreamAlias("CNPJ")
    private String cnpj;
    @XStreamAlias("CPF")
    private String cpf;
    @XStreamAlias("xNome")
    private String xNomeEmit;
    @XStreamAlias("enderDest")
    private EnderDest enderDest; 
    @XStreamAlias("indIEDest")
    private int indIEDest;

    public String getCnpjEemit() {
        return cnpj;
    }

    public void setCnpjEemit(String cnpjEemit) {
        this.cnpj = cnpjEemit;
    }

    public String getxNomeEmit() {
        return xNomeEmit;
    }

    public void setxNomeEmit(String xNomeEmit) {
        this.xNomeEmit = xNomeEmit;
    }

    public EnderDest getEnderDest() {
        return enderDest;
    }

    public void setEnderDest(EnderDest enderDest) {
        this.enderDest = enderDest;
    }

    public int getIndIEDest() {
        return indIEDest;
    }

    public void setIndIEDest(int indIEDest) {
        this.indIEDest = indIEDest;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    

}
