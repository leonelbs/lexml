/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xml.beanNfeExcluida.pfwin;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import java.util.List;

/**
 *
 * @author leonel
 */
@XStreamAlias("insert")
class Insert {

    @XStreamAlias("tb")
    @XStreamAsAttribute
    String tb;
    @XStreamAlias("tabela")
    List<Tabela> tabela;

}
