/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xml.beanNfce;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import java.time.OffsetDateTime;
import xml.ConverteData;

/**
 *
 * @author Leonel.Santos
 */

@XStreamAlias("ide")
public class Ide {

    private int cUF;
    private int cNF;
    private String natOp;
    private int indPag;
    private int mod;
    private int serie;
    private String nNF;
    @XStreamConverter(ConverteData.class)
    private OffsetDateTime dhEmi;
    private int tpNF;
    private int idDest;
    private int cMunFG;
    private int tpImp;
    private int tpEmis;
    private int cDV;
    private int tpAmb;
    private int finNFe;
    private int indFinal;
    private int indPres;
    private int procEmi;
    private double verProc;
    private OffsetDateTime dhCont;
    private String xJust;

    public int getcUF() {
        return cUF;
    }

    public void setcUF(int cUF) {
        this.cUF = cUF;
    }

    public int getcNF() {
        return cNF;
    }

    public void setcNF(int cNF) {
        this.cNF = cNF;
    }

    public String getNatOp() {
        return natOp;
    }

    public void setNatOp(String natOp) {
        this.natOp = natOp;
    }

    public int getIndPag() {
        return indPag;
    }

    public void setIndPag(int indPag) {
        this.indPag = indPag;
    }

    public int getMod() {
        return mod;
    }

    public void setMod(int mod) {
        this.mod = mod;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public String getnNF() {
        return nNF;
    }

    public void setnNF(String nNF) {
        this.nNF = nNF;
    }

    public OffsetDateTime getDhEmi() {

        return dhEmi;
    }

    public void setDhEmi(OffsetDateTime dhEmi) {
        this.dhEmi = dhEmi;
    }

    public int getTpNF() {
        return tpNF;
    }

    public void setTpNF(int tpNF) {
        this.tpNF = tpNF;
    }

    public int getIdDest() {
        return idDest;
    }

    public void setIdDest(int idDest) {
        this.idDest = idDest;
    }

    public int getcMunFG() {
        return cMunFG;
    }

    public void setcMunFG(int cMunFG) {
        this.cMunFG = cMunFG;
    }

    public int getTpImp() {
        return tpImp;
    }

    public void setTpImp(int tpImp) {
        this.tpImp = tpImp;
    }

    public int getTpEmis() {
        return tpEmis;
    }

    public void setTpEmis(int tpEmis) {
        this.tpEmis = tpEmis;
    }

    public int getcDV() {
        return cDV;
    }

    public void setcDV(int cDV) {
        this.cDV = cDV;
    }

    public int getTpAmb() {
        return tpAmb;
    }

    public void setTpAmb(int tpAmb) {
        this.tpAmb = tpAmb;
    }

    public int getFinNFe() {
        return finNFe;
    }

    public void setFinNFe(int finNFe) {
        this.finNFe = finNFe;
    }

    public int getIndFinal() {
        return indFinal;
    }

    public void setIndFinal(int indFinal) {
        this.indFinal = indFinal;
    }

    public int getIndPres() {
        return indPres;
    }

    public void setIndPres(int indPres) {
        this.indPres = indPres;
    }

    public int getProcEmi() {
        return procEmi;
    }

    public void setProcEmi(int procEmi) {
        this.procEmi = procEmi;
    }

    public double getVerProc() {
        return verProc;
    }

    public void setVerProc(int verProc) {
        this.verProc = verProc;
    }

    public OffsetDateTime getDhCont() {
        return dhCont;
    }

    public void setDhCont(OffsetDateTime dhCont) {
        this.dhCont = dhCont;
    }

    public String getxJust() {
        return xJust;
    }

    public void setxJust(String xJust) {
        this.xJust = xJust;
    }
    

}
