/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xml.beanNfeExcluida;

import xml.beanNfce.*;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import java.text.DecimalFormat;
import java.util.List;

/**
 *
 * @author Leonel.Santos
 */
@XStreamAlias("prod")
public class Prod {

    private String cProd;
    private String cEAN;
    private String xProd;
    @XStreamAlias("NCM")
    private String ncm;
    @XStreamAlias("CFOP")
    private int cfop;
    private String uCom;
    private double qCom;
    private double vUnCom;
    private double vProd;
    private String cEANTrib;
    private String uTrib;
    @XStreamAlias("CEST")
    private int cest;
    private double qTrib;
    private double vUnTrib;
    private double indTot;
    private double vOutro;
    private double vDesc;
    @XStreamImplicit
    private List<Comb> comb;
    private DecimalFormat decimal;

    public int getCest() {
        return cest;
    }

    public void setCest(int cest) {
        this.cest = cest;
    }

    public List<Comb> getComb() {
        return comb;
    }

    public void setComb(List<Comb> comb) {
        this.comb = comb;
    }

    public String getcProd() {
        return cProd;
    }

    public void setcProd(String cProd) {
        this.cProd = cProd;
    }

    public String getcEAN() {
        return cEAN;
    }

    public void setcEAN(String cEAN) {
        this.cEAN = cEAN;
    }

    public String getxProd() {
        return xProd;
    }

    public void setxProd(String xProd) {
        this.xProd = xProd;
    }

    public String getNcm() {
        return ncm;
    }

    public void setNcm(String ncm) {
        this.ncm = ncm;
    }

    public int getCfop() {
        return cfop;
    }

    public void setCfop(int cfop) {
        this.cfop = cfop;
    }

    public String getuCom() {
        return uCom;
    }

    public void setuCom(String uCom) {
        this.uCom = uCom;
    }

    public double getqCom() {
        return qCom;
    }

    public void setqCom(double qCom) {
        this.qCom = qCom;
    }

    public double getvUnCom() {
        return vUnCom;
    }

    public void setvUnCom(double vUnCom) {
        this.vUnCom = vUnCom;
    }

    public double getvProd() {
        return vProd;
    }

    public void setvProd(double vProd) {
        this.vProd = vProd;
    }

    public String getcEANTrib() {
        return cEANTrib;
    }

    public void setcEANTrib(String cEANTrib) {
        this.cEANTrib = cEANTrib;
    }

    public String getuTrib() {
        return uTrib;
    }

    public void setuTrib(String uTrib) {
        this.uTrib = uTrib;
    }

    public double getqTrib() {
        return qTrib;
    }

    public void setqTrib(double qTrib) {
        this.qTrib = qTrib;
    }

    public double getvUnTrib() {
        return vUnTrib;
    }

    public void setvUnTrib(double vUnTrib) {
        this.vUnTrib = vUnTrib;
    }

    public double getIndTot() {
        return indTot;
    }

    public void setIndTot(double indTot) {

        decimal = new DecimalFormat(".##");
        //decimal.format(indTot)
        this.indTot = indTot;
    }

    public double getvOutro() {
        return vOutro;
    }

    public void setvOutro(double vOutro) {
        this.vOutro = vOutro;
    }

    public DecimalFormat getDecimal() {
        return decimal;
    }

    public void setDecimal(DecimalFormat decimal) {
        this.decimal = decimal;
    }

    public double getvDesc() {
        return vDesc;
    }

    public void setvDesc(double vDesc) {
        this.vDesc = vDesc;
    }

}
