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
@XStreamAlias("SignedInfo")
class SignedInfo {

    private String CanonicalizationMethod;
    @XStreamAlias("Algorithm")
    @XStreamAsAttribute
    private String Algorithm1;
    private String SignatureMethod;
    @XStreamAlias("Algorithm")
    @XStreamAsAttribute
    private String Algorithm2;
    @XStreamAlias("Reference")
    private Reference reference;

    public String getCanonicalizationMethod() {
        return CanonicalizationMethod;
    }

    public void setCanonicalizationMethod(String CanonicalizationMethod) {
        this.CanonicalizationMethod = CanonicalizationMethod;
    }

    public String getAlgorithm1() {
        return Algorithm1;
    }

    public void setAlgorithm1(String Algorithm1) {
        this.Algorithm1 = Algorithm1;
    }

    public String getSignatureMethod() {
        return SignatureMethod;
    }

    public void setSignatureMethod(String SignatureMethod) {
        this.SignatureMethod = SignatureMethod;
    }

    public String getAlgorithm2() {
        return Algorithm2;
    }

    public void setAlgorithm2(String Algorithm2) {
        this.Algorithm2 = Algorithm2;
    }

    public Reference getReference() {
        return reference;
    }

    public void setReference(Reference reference) {
        this.reference = reference;
    }

}
