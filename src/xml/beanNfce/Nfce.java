/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xml.beanNfce;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

/**
 *
 * @author Leonel.Santos
 */
@XStreamAlias("NFe")
public class Nfce {

    @XStreamAlias("Signature")
    private Signature signature;
    private InfNFe infNFe;
    @XStreamAlias("xmlns")
    @XStreamAsAttribute
    private String xmlns;
    @XStreamAlias("infNFeSupl")
    private InfNFeSupl infNFeSupl;

    public InfNFeSupl getInfNFeSupl() {
        return infNFeSupl;
    }

    public void setInfNFeSupl(InfNFeSupl infNFeSupl) {
        this.infNFeSupl = infNFeSupl;
    }

    public InfNFe getInfNFe() {

        return infNFe;
    }

    public void setInfNFe(InfNFe infNFe) {
        this.infNFe = infNFe;
    }

    public String getXmlns() {
        return xmlns;
    }

    public void setXmlns(String xmlns) {
        this.xmlns = xmlns;
    }

    public Signature getSignature() {
        return signature;
    }

    public void setSignature(Signature signature) {
        this.signature = signature;
    }

}
