/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author Leonel.Santos
 */
public class ImportaCupom {

    ArrayList listaQuery;
    int tam;
    Calendar dataInicial;
    Calendar dataFinal;

    public ImportaCupom(Calendar dataInicial, Calendar dataFinal) {
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;

    }

    public String sql() {
        listaQuery = new ArrayList();

        /*DROP CONSTRAINT FK_ECF_CONSUMIDOR_VENDA*/
        listaQuery.add("ALTER TABLE ECF_CONSUMIDOR DROP CONSTRAINT FK_ECF_CONSUMIDOR_VENDA;\n"
                + "alter table ITEM_ECF_CONSUMIDOR add VENDA_ID integer;");
        /*DROP CRIA TRIGGER ITEM_ECF_CONSUMIDOR_BI0*/
        listaQuery.add("create or alter trigger ITEM_ECF_CONSUMIDOR_BI0 for ITEM_ECF_CONSUMIDOR\n"
                + "active before insert position 0\n"
                + "as\n"
                + "begin\n"
                + "\n"
                + "  if (new.VENDA_ID is not null) then\n"
                + "  begin\n"
                + "    new.ECF_CONSUMIDOR_ID = (select EE.ECF_CONSUMIDOR_ID\n"
                + "    from ECF_CONSUMIDOR EE\n"
                + "    where new.VENDA_ID = EE.VENDA_ID and\n"
                + "          new.VENDA_ID is not null);\n"
                + "  end\n"
                + "end;");

        tam = listaQuery.size();

        return null;
    }

}
