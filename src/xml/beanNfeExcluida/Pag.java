/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xml.beanNfeExcluida;

import xml.beanNfce.*;
import java.text.DecimalFormat;


/**
 *
 * @author Leonel.Santos
 */
public class Pag {
     private double tPag;
     private double vPag; 
     private DecimalFormat decimal;
     private Card card;

    public double gettPag() {
        return tPag;
    }

    public void settPag(double tPag) {
        this.tPag = tPag;
    }

    public double getvPag() {
        return vPag;
    }

    public void setvPag(double vPag) {
        this.vPag = vPag;
    }
     
     
    
}
