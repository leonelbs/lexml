/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import database.DbConnect;
import java.net.UnknownHostException;
import java.util.ArrayList;
import javax.swing.JFileChooser;

/**
 *
 * @author leonel.santos
 */
public class LocalizaBaseDados {

    Chooser ch;
    String ip;
    DbConnect db;
    String diretorio;
    String arqLog;
    String arquivoSelecionado;
    String pathelecionado;
    String extensao;
    public int retornoChooser;
    private ArrayList listaArc;

    public LocalizaBaseDados(ArrayList filtros) {

        /*ArrayList filtros = new ArrayList();
        filtros.add("fbk");
        filtros.add("gbk");
        filtros.add("fdb");
        filtros.add("gdb");*/
        ch = new Chooser(filtros);
        java.net.InetAddress i = null;
        try {
            i = java.net.InetAddress.getLocalHost();
        } catch (UnknownHostException ex) {
            System.out.println(ex.getMessage());
        }
        ip = i.getHostAddress();
        retornoChooser = ch.returnValue;

        if (ch.returnValue == JFileChooser.APPROVE_OPTION) {
            diretorio = ch.parent;
            arqLog = ch.parent;
           // System.out.println(arqLog);
            arquivoSelecionado = ch.arquivoSelecionado;
            pathelecionado = ch.pathelecionado;
            extensao = ch.extensao.toUpperCase();
     
            listaArc = ch.arquivos;
           
        }
    }

    public Chooser getCh() {
        return ch;
    }

    public String getIp() {
        return ip;
    }

    public DbConnect getDb() {
        return db;
    }

    public String getDiretorio() {
        return diretorio;
    }

    public String getArqLog() {
        return arqLog;
    }

    public String getArquivoSelecionado() {
        return arquivoSelecionado;
    }

    public String getPathelecionado() {
        return pathelecionado;
    }

    public String getExtensao() {
        return extensao;
    }

    public int getRetornoChooser() {
        return retornoChooser;
    }

    public void setRetornoChooser(int retornoChooser) {
        this.retornoChooser = retornoChooser;
    }

    public ArrayList getListaArc() {
        return listaArc;
    }

    public void setListaArc(ArrayList listaArc) {
        this.listaArc = listaArc;
    }

}
