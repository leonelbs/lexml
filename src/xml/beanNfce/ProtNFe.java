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

@XStreamAlias("protNFe")
class ProtNFe {
    
 @XStreamAlias("infProt")   
  private InfProt infProt;

    public InfProt getInfProt() {
        return infProt;
    }

    public void setInfProt(InfProt infProt) {
        this.infProt = infProt;
    }
  
    
    
}
