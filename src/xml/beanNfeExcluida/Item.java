/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xml.beanNfeExcluida;

import xml.beanNfce.*;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

/**
 *
 * @author Leonel.Santos
 */
@XStreamAlias("Id")
public class Item {

    @XStreamAlias("nItem")
    @XStreamAsAttribute
    private int nItem;

}
