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
public class Total {
    @XStreamAlias("ICMSTot")
    private IcmsTot icmsTot;

    public IcmsTot getIcmsTot() {
        return icmsTot;
    }

    public void setIcmsTot(IcmsTot icmsTot) {
        this.icmsTot = icmsTot;
    }
    
    
    
}
