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
@XStreamAlias("ICMS")
public class Icms {

    @XStreamAlias("ICMS60")
    private Icms60 icms60;
    @XStreamAlias("ICMS00")
    private Icms00 icms00;
    @XStreamAlias("ICMS40")
    private Icms40 icms40;
    @XStreamAlias("ICMSSN102")
    private Icmssn102 icmssn102;
    @XStreamAlias("ICMSSN500")
    private Icmssn500 icmssn500;

    /*
    -<ICMS>


-<ICMSSN500>

<orig>0</orig>

<CSOSN>500</CSOSN>

<vBCSTRet>0.00</vBCSTRet>

<vICMSSTRet>0.00</vICMSSTRet>

</ICMSSN500>

</ICMS>

    
     */
    public Icmssn500 getIcmssn500() {
        return icmssn500;
    }

    public void setIcmssn500(Icmssn500 icmssn500) {
        this.icmssn500 = icmssn500;
    }

    public Icmssn102 getIcmssn102() {
        return icmssn102;
    }

    public void setIcmssn102(Icmssn102 icmssn102) {
        this.icmssn102 = icmssn102;
    }

    public Icms00 getIcms00() {
        return icms00;
    }

    public void setIcms00(Icms00 icms00) {
        this.icms00 = icms00;
    }

    public Icms40 getIcms40() {
        return icms40;
    }

    public void setIcms40(Icms40 icms40) {
        this.icms40 = icms40;
    }

    public Icms60 getIcms60() {
        return icms60;
    }

    public void setIcms60(Icms60 icms60) {
        this.icms60 = icms60;
    }

}
