/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xml.beanNfeExcluida;

import xml.beanNfce.*;
import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 *
 * @author Leonel.Santos
 */

@XStreamAlias("emit")
public class Emit {
    @XStreamAlias("CNPJ")
    private String cnpjEemit;
    @XStreamAlias("xNome")
    private String xNomeEmit;
    @XStreamAlias("enderEmit")
    private  EnderEmit enderEmit;
    @XStreamAlias("IE")
    private String IeEmit;
    @XStreamAlias("CRT")
    private int CrtEmit;

    public String getCnpjEemit() {
        return cnpjEemit;
    }

    public void setCnpjEemit(String cnpjEemit) {
        this.cnpjEemit = cnpjEemit;
    }

    public String getxNomeEmit() {
        return xNomeEmit;
    }

    public void setxNomeEmit(String xNomeEmit) {
        this.xNomeEmit = xNomeEmit;
    }

    public EnderEmit getEnderEmit() {
        return enderEmit;
    }

    public void setEnderEmit(EnderEmit enderEmit) {
        this.enderEmit = enderEmit;
    }

    public String getIeEmit() {
        return IeEmit;
    }

    public void setIeEmit(String IeEmit) {
        this.IeEmit = IeEmit;
    }

    public int getCrtEmit() {
        return CrtEmit;
    }

    public void setCrtEmit(int CrtEmit) {
        this.CrtEmit = CrtEmit;
    }
    
   
    
    
    
    
}
