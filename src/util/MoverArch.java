/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.io.File;

/**
 *
 * @author Leonel.Santos
 */
public class MoverArch {

    private String origem;
    private String destino;
    
    

    public MoverArch(String origem, String destino) {
        this.origem = origem;
        this.destino = destino;
    }
    
    
    public String moverArquivo(){
      File arc = new File(origem);
      File dir = new File(destino);
      String retorno = null;
      
      boolean ok= arc.renameTo(new File(dir,arc.getName()));
        if (ok) {
          retorno=arc.getAbsolutePath();
        }
        return retorno;
    }
    
    

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

}
