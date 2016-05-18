/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xml.beanNfce;

/**
 *
 * @author Leonel.Santos
 */


import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("CIDE")
class Cide {
    
private double qBCProd;
private double vAliqProd;
private double vCIDE;

    public double getqBCProd() {
        return qBCProd;
    }

    public void setqBCProd(double qBCProd) {
        this.qBCProd = qBCProd;
    }

    public double getvAliqProd() {
        return vAliqProd;
    }

    public void setvAliqProd(double vAliqProd) {
        this.vAliqProd = vAliqProd;
    }

    public double getvCIDE() {
        return vCIDE;
    }

    public void setvCIDE(double vCIDE) {
        this.vCIDE = vCIDE;
    }


    
}
