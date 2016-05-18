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
class Signature {

    @XStreamAlias("xmlns")
    @XStreamAsAttribute
    private String xmlns;
    @XStreamAlias("SignedInfo")
    private SignedInfo signedInfo;
    @XStreamAlias("SignatureValue")
    private SignatureValue signatureValue;
    @XStreamAlias("KeyInfo")
    private KeyInfo keyInfo;

    public String getXmlns() {
        return xmlns;
    }

    public void setXmlns(String xmlns) {
        this.xmlns = xmlns;
    }

    public SignedInfo getSignedInfo() {
        return signedInfo;
    }

    public void setSignedInfo(SignedInfo signedInfo) {
        this.signedInfo = signedInfo;
    }

    public SignatureValue getSignatureValue() {
        return signatureValue;
    }

    public void setSignatureValue(SignatureValue signatureValue) {
        this.signatureValue = signatureValue;
    }

    public KeyInfo getKeyInfo() {
        return keyInfo;
    }

    public void setKeyInfo(KeyInfo keyInfo) {
        this.keyInfo = keyInfo;
    }

}
