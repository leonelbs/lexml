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

@XStreamAlias("det")
public class Det {
   @XStreamAlias("nItem")
    @XStreamAsAttribute
    private int item;
    @XStreamAlias("prod")
    private Prod produto;
    @XStreamAlias("imposto")
    private Imposto imposto;

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public Prod getProduto() {
        return produto;
    }

    public void setProduto(Prod produto) {
        this.produto = produto;
    }

    public Imposto getImposto() {
        return imposto;
    }

    public void setImposto(Imposto imposto) {
        this.imposto = imposto;
    }
    
    
    
}
