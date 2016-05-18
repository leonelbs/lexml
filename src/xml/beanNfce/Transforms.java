/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xml.beanNfce;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import java.util.List;

/**
 *
 * @author Leonel.Santos
 */
@XStreamAlias("Transforms")
class Transforms {

    @XStreamAsAttribute
    private String Algorithm;
    @XStreamAlias("Transform")
    //@XStreamImplicit 
    private List<Transform> transform;

    public String getAlgorithm() {
        return Algorithm;
    }

    public void setAlgorithm(String Algorithm) {
        this.Algorithm = Algorithm;
    }

    public Transform getTransform() {
        return (Transform) transform;
    }

    public void setTransform(Transform transform) {
        this.transform = (List<Transform>) transform;
    }

}
