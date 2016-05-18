/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xml.beanNfeExcluida;

import xml.beanNfce.*;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import java.util.List;

/**
 *
 * @author Leonel.Santos
 */
@XStreamAlias("infNFe")
public class InfNFe {

    @XStreamAlias("Id")
    @XStreamAsAttribute
    private String id;
    @XStreamAlias("versao")
    @XStreamAsAttribute
    private double versao;
    private Ide ide;
    private Emit emit;
    @XStreamImplicit
    private List<Det> det;
    private Total total;
    private Transp transp;
    @XStreamImplicit
    private List<Pag> pag;
    private InfAdic infAdic;
    @XStreamAlias("dest")
    private Dest dest;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getVersao() {
        return versao;
    }

    public void setVersao(double versao) {
        this.versao = versao;
    }

    public Ide getIde() {
        return ide;
    }

    public void setIde(Ide ide) {
        this.ide = ide;
    }

    public Emit getEmit() {
        return emit;
    }

    public void setEmit(Emit emit) {
        this.emit = emit;
    }

    public List<Det> getDet() {
        return det;
    }

    public void setDet(List<Det> det) {
        this.det = det;
    }

    public Total getTotal() {
        return total;
    }

    public void setTotal(Total total) {
        this.total = total;
    }

    public Transp getTransp() {
        return transp;
    }

    public void setTransp(Transp transp) {
        this.transp = transp;
    }

    public List<Pag> getPag() {
        return pag;
    }

    public void setPag(List<Pag> pag) {
        this.pag = pag;
    }

    public InfAdic getInfAdic() {
        return infAdic;
    }

    public void setInfAdic(InfAdic infAdic) {
        this.infAdic = infAdic;
    }

    public Dest getDest() {
        return dest;
    }

    public void setDest(Dest dest) {
        this.dest = dest;
    }

}
