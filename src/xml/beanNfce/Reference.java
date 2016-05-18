/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xml.beanNfce;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import java.util.List;

/**
 *
 * @author Leonel.Santos
 */
@XStreamAlias("Reference")
class Reference {
   
    @XStreamAlias("Transforms")
    private List<Transforms> transforms;
    private String  DigestMethod;
    @XStreamAlias("Algorithm")
    @XStreamAsAttribute
    private String algorithm;
    @XStreamAlias("DigestValue")
    private String digestValue;
    @XStreamAlias("URI")
    @XStreamAsAttribute
    private String uri;
    

    public List<Transforms> getTransforms() {
        return transforms;
    }

    public void setTransforms(List<Transforms> transforms) {
        this.transforms = transforms;
    }

    public String getDigestMethod() {
        return DigestMethod;
    }

    public void setDigestMethod(String DigestMethod) {
        this.DigestMethod = DigestMethod;
    }

    public String getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

    public String getDigestValue() {
        return digestValue;
    }

    public void setDigestValue(String digestValue) {
        this.digestValue = digestValue;
    }
    
    
    
    
}
