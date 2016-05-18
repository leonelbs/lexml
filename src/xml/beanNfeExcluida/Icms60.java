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
 @XStreamAlias("ICMS60")
class Icms60 {
   
   private int orig;
   @XStreamAlias("CST")
   private int cst;
   private double  vBCSTRet;                                     

    public int getOrig() {
        return orig;
    }

    public void setOrig(int orig) {
        this.orig = orig;
    }

    public int getCst() {
        return cst;
    }

    public void setCst(int cst) {
        this.cst = cst;
    }

    public double getvBCSTRet() {
        return vBCSTRet;
    }

    public void setvBCSTRet(double vBCSTRet) {
        this.vBCSTRet = vBCSTRet;
    }

    public double getvICMSSTRet() {
        return vICMSSTRet;
    }

    public void setvICMSSTRet(double vICMSSTRet) {
        this.vICMSSTRet = vICMSSTRet;
    }
   private double  vICMSSTRet;

    
   
}
