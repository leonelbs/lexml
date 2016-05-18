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
@XStreamAlias("KeyInfo")
class KeyInfo {

    @XStreamAlias("X509Data")
    private X509Data x509Data;

    public X509Data getX509Data() {
        return x509Data;
    }

    public void setX509Data(X509Data x509Data) {
        this.x509Data = x509Data;
    }

}
