/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xml.beanNfeExcluida;

import xml.beanNfce.*;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

/**
 *
 * @author Leonel.Santos
 */
@XStreamAlias("nfeProc")
public class NfeProc {

    @XStreamAlias("xmlns")
    @XStreamAsAttribute
    private String xmlns;
    @XStreamAlias("versao")
    @XStreamAsAttribute
    private double versao;
    
    @XStreamAlias("NFe")
    private Nfce nfe;
     @XStreamAlias("protNFe")
    private ProtNFe protNFe;

    public String getXmlns() {
        return xmlns;
    }

    public void setXmlns(String xmlns) {
        this.xmlns = xmlns;
    }

    public double getVersao() {
        return versao;
    }

    public void setVersao(double versao) {
        this.versao = versao;
    }

    public Nfce getNfe() {
        return nfe;
    }

    public void setNfe(Nfce nfe) {
        this.nfe = nfe;
    }

    public ProtNFe getProtNFe() {
        return protNFe;
    }

    public void setProtNFe(ProtNFe protNFe) {
        this.protNFe = protNFe;
    }
    

}
