/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xml;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static xml.XmlNfce.nfeProc;
import xml.beanNfce.NfeProc;

/**
 *
 * @author leonel
 */
public class XmlImportaTerc {

    public NfeProc carregaXml(String arquivo) throws FileNotFoundException {
        try (FileReader ler = new FileReader(arquivo)) {

            // File file = new File(arquivo); 
            nfeProc = null;
            System.gc();

            XStream xs = new XStream(new DomDriver());
            xs.autodetectAnnotations(true);
            xs.alias("nfeProc", NfeProc.class);
            xs.registerConverter(new ConverteData());

            nfeProc = (NfeProc) xs.fromXML(ler);
            ler.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(XmlNfce.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(XmlNfce.class.getName()).log(Level.SEVERE, null, ex);
        }

        return nfeProc;
    }

}
