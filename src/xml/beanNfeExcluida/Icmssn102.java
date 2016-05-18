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
@XStreamAlias("ICMSSN102")
class Icmssn102 {

    private int orig;
    @XStreamAlias("CST")
    private int cst;
    private double modBC;
    private double vBC;
    private double pICMS;
    private double vICMS;
    @XStreamAlias("CSOSN")
    private int csosn;

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

    public double getModBC() {
        return modBC;
    }

    public void setModBC(double modBC) {
        this.modBC = modBC;
    }

    public double getvBC() {
        return vBC;
    }

    public void setvBC(double vBC) {
        this.vBC = vBC;
    }

    public double getpICMS() {
        return pICMS;
    }

    public void setpICMS(double pICMS) {
        this.pICMS = pICMS;
    }

    public double getvICMS() {
        return vICMS;
    }

    public void setvICMS(double vICMS) {
        this.vICMS = vICMS;
    }

    public int getCsosn() {
        return csosn;
    }

    public void setCsosn(int csosn) {
        this.csosn = csosn;
    }


}
