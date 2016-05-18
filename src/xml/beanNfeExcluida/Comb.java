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
@XStreamAlias("comb")
public class Comb {

    private String cProdANP;
    private String UFCons;
    @XStreamAlias("CIDE")
    private Cide cide;
    @XStreamAlias("encerrante")
    private Encerrante encerrante;

    public String getcProdANP() {
        return cProdANP;
    }

    public void setcProdANP(String cProdANP) {
        this.cProdANP = cProdANP;
    }

    public String getUFCons() {
        return UFCons;
    }

    public void setUFCons(String UFCons) {
        this.UFCons = UFCons;
    }

    public Cide getCide() {
        return cide;
    }

    public void setCide(Cide cide) {
        this.cide = cide;
    }

    public Encerrante getEncerrante() {
        return encerrante;
    }

    public void setEncerrante(Encerrante encerrante) {
        this.encerrante = encerrante;
    }

}
