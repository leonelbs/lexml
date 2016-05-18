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
@XStreamAlias("enderEmit")
public class EnderEmit {
    
   @XStreamAlias("xLgr")
   private String xLgrEmit;
   @XStreamAlias("nro")
   private String nro;
   @XStreamAlias("xBairro")
   private String xBairroEmit;
   @XStreamAlias("cMun")
   private String cMunEmit;
   @XStreamAlias("xMun")
   private String xMunEmit;
   @XStreamAlias("UF")
   private String UfEmit;
   @XStreamAlias("CEP")
   private String CepEmit;
   @XStreamAlias("xCpl")
   private String xCpl;

    public String getxLgrEmit() {
        return xLgrEmit;
    }

    public void setxLgrEmit(String xLgrEmit) {
        this.xLgrEmit = xLgrEmit;
    }

    public String getNro() {
        return nro;
    }

    public void setNro(String nro) {
        this.nro = nro;
    }

    public String getxBairroEmit() {
        return xBairroEmit;
    }

    public void setxBairroEmit(String xBairroEmit) {
        this.xBairroEmit = xBairroEmit;
    }

    public String getcMunEmit() {
        return cMunEmit;
    }

    public void setcMunEmit(String cMunEmit) {
        this.cMunEmit = cMunEmit;
    }

    public String getxMunEmit() {
        return xMunEmit;
    }

    public void setxMunEmit(String xMunEmit) {
        this.xMunEmit = xMunEmit;
    }

    public String getUfEmit() {
        return UfEmit;
    }

    public void setUfEmit(String UfEmit) {
        this.UfEmit = UfEmit;
    }

    public String getCepEmit() {
        return CepEmit;
    }

    public void setCepEmit(String CepEmit) {
        this.CepEmit = CepEmit;
    }

    public String getxCpl() {
        return xCpl;
    }

    public void setxCpl(String xCpl) {
        this.xCpl = xCpl;
    }
   
   
    
}
