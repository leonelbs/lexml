/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xml.beanNfce;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import java.text.DecimalFormat;

/**
 *
 * @author Leonel.Santos
 */
public class Imposto {
 
    private double vTotTrib;
     @XStreamAlias("ICMS")
    private Icms icms;
    private DecimalFormat decimal;

    public double getvTotTrib() {
        return vTotTrib;
    }

    public void setvTotTrib(double vTotTrib) {
        this.vTotTrib = vTotTrib;
    }

    public Icms getIcms() {
        return icms;
    }

    public void setIcms(Icms icms) {
        this.icms = icms;
    }

    
    
    
}
