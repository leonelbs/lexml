/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xml;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import xml.beanNfeExcluida.NfeProc;


/**
 *
 * @author Leonel.Santos
 */
public class XmlNfeExcluida {

    private String dir;
    public static NfeProc nfeProc;

    /*  public static void main(String[] args) {

       // buscaArquivo();
        /*ArrayList arquivos = listaDiretorio();
        arquivos.stream().filter((arquivo) -> (arquivo.toString().contains("Envio.xml"))).forEach((arquivo) -> {
            System.out.println(arquivo.toString());
        });
    }*/
 /* public static ArrayList listaDiretorio() {
       // ArrayList filtros = new ArrayList();
        //filtros.add("xml");
        //Chooser fileSelecionado = new Chooser(filtros);
       // ArrayList listaDeArquivos = new ArrayList();
       // listaDeArquivos.addAll(Arrays.asList(fileSelecionado.files));
       // return listaDeArquivos;

    }*/
    public NfeProc carregaXml(String arquivo) throws FileNotFoundException {
        try (FileReader ler = new FileReader(arquivo)) {

            // File file = new File(arquivo); 
            nfeProc=null;
            System.gc();
      
            XStream xs = new XStream(new DomDriver());
            xs.autodetectAnnotations(true);
            xs.alias("nfeProc", NfeProc.class);
            xs.registerConverter(new ConverteData());

            nfeProc = (NfeProc) xs.fromXML(ler);
            ler.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(XmlNfeExcluida.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(XmlNfeExcluida.class.getName()).log(Level.SEVERE, null, ex);
        }
  
        return nfeProc;
    }

}
