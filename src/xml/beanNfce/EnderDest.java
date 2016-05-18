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
@XStreamAlias("enderDest")
public class EnderDest {

    @XStreamAlias("xLgr")
    private String xLgr;
    @XStreamAlias("nro")
    private String nro;
    @XStreamAlias("xBairro")
    private String xBairro;
    @XStreamAlias("cMun")
    private int cMun;
    @XStreamAlias("xMun")
    private String xMun;
    @XStreamAlias("UF")
    private String uf;
    @XStreamAlias("CEP")
    private String cep;

    public String getxLgr() {
        return xLgr;
    }

    public void setxLgr(String xLgr) {
        this.xLgr = xLgr;
    }

    public String getNro() {
        return nro;
    }

    public void setNro(String nro) {
        this.nro = nro;
    }

    public String getxBairro() {
        return xBairro;
    }

    public void setxBairro(String xBairro) {
        this.xBairro = xBairro;
    }

    public int getcMun() {
        return cMun;
    }

    public void setcMun(int cMun) {
        this.cMun = cMun;
    }

    public String getxMun() {
        return xMun;
    }

    public void setxMun(String xMun) {
        this.xMun = xMun;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

}
