/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.util.ArrayList;

/**
 *
 * @author leonel.santos
 */
public class GeraQuery {

    String tabelaPfwin;
    String consulta;
    String update;
    int empresaId;

    public GeraQuery(String tabelaPfwin, int empresaId) {
        this.tabelaPfwin = tabelaPfwin;
        this.empresaId = empresaId;

        switch (tabelaPfwin) {

            case "COBERTURA":
                cobertura();
                break;
            case "PDV":
                pdv();
                break;
            case "PDA":
                pda();
                break;
            case "TIPO_COMB":
                tipo_comb();
                break;
            case "COMBUSTIVEL":
                combustivel();
                break;
            case "PRODUTO_NIVEL1":
                n1();
                break;
            case "PRODUTO_NIVEL2":
                n2();
                break;
            case "PRODUTO":
                produto();
                break;
            case "PRODUTO_EMPRESA":
                produto_empresa();
                break;
            case "PRM_ATR_LOGICO_PRODUTO":
                prm_atr_logico_produto();
                break;
            case "COMPONENTE":
                componente();
                break;
            case "COD_BARRA_PRODUTO":
                cod_barra_produto();
                break;
            case "ALIQUOTA_PRODUTO_UF":
                aliquota_produto_uf();
                break;
            /*PESSOA*/
            case "PRAZO":
                prazo();
                break;
            case "GRUPO_PRECO":
                grupopreco();
                break;
            case "PESSOA":
                pessoa();
                break;
            case "EMAIL":
                email();
                break;
            case "ENDERECO":
                endereco();
                break;
            case "FUNCIONARIO":
                funcionario();
                break;
            case "PESSOA_PF":
                pessoa_pf();
                break;
            case "PESSOA_PJ":
                pessoa_pj();
                break;
            case "PRM_ATR_LOGICO_PESSOA":
                prm_atr_logico_pessoa();
                break;
            case "TELEFONE":
                telefone();
                break;
            case "VEICULO":
                veiculo();
                break;
            case "PRM_ATR_LOGICO_VEICULO":
                prm_atr_logico_veiculo();
                break;
            case "PRECO_ESPECIAL":
                PRECO_ESPECIAL();
                break;
            // outras tabelas-----------------------------------------------
            case "DESPESA_NIVEL1":
                DESPESA_NIVEL1();
                break;
            case "DESPESA_NIVEL2":
                DESPESA_NIVEL2();
                break;
            case "DESPESA_NIVEL3":
                DESPESA_NIVEL3();
                break;
            case "CONTA_CORRENTE":
                CONTA_CORRENTE();
                break;
            case "BOMBA":
                BOMBA();
                break;
            case "TANQUE":
                TANQUE();
                break;
            case "BICO":
                BICO();  //BANDEIRA_CARTAO
                break;
            case "CARTAO":
                CARTAO();
                break;
            case "BANDEIRA_CARTAO":
                BANDEIRA_CARTAO();
                break;
            case "CARTAO_EMPRESA":
                CARTAO_EMPRESA();
                break;
            case "PRECO_COMB":
                PRECO_COMB();
                break;
            case "RECIBO_PAGAMENTO":
                RECIBO_PAGAMENTO();
                break;
            case "IMPORTA_ECF":
                IMPORTA_ECF();
                break;
            case "IMPORTA_ITEM_ECF":
                IMPORTA_ITEM_ECF();
                break;
            default:
                break;

        }

    }

    public GeraQuery() {
       }

    private void cobertura() {

        consulta = "SELECT (SELECT distinct empresa_id from empresa) AS EMPRESA_ID , CC.* FROM  COBERTURA CC ";
        update = "UPDATE OR INSERT INTO COBERTURA (EMPRESA_ID, COBERTURA_ID, DESCRICAO) VALUES ()";

    }

    private void pdv() {
        consulta = "SELECT (SELECT distinct empresa_id from empresa) AS EMPRESA_ID , CC.pdv_id,  CC.cobertura_id, CC.descricao FROM  PDV CC ";
        update = "teste";

    }

    private void pda() {
        consulta = "SELECT (SELECT distinct empresa_id from empresa) AS EMPRESA_ID , CC.PDA_id,  CC.cobertura_id, CC.descricao FROM  PDA CC ";
        update = "teste";

    }

    private void tipo_comb() {
        consulta = "SELECT CC.TIPO_COMBUSTIVEL_ID, CC.DESCRICAO,  CC.CODNOME AS CODNOME_COMB, CC.ORDEM  AS ORDEM_COMB, CC.UND_MEDIDA,\n"
                + "CC.SN_LMC, CC.SN_COMBUSTIVEL FROM  TIPO_COMBUSTIVEL CC ";
        update = "teste";

    }

    private void combustivel() {
        consulta = "SELECT COMBUSTIVEL_ID ,DESCRICAO  ,ABREVIACAO ,CODNOME ,TIPO_COMBUSTIVEL_ID ,ORDEM ,SN_LMC\n"
                + ",SECRETARIA_FAZENDA ,COD_TICKETCAR ,FOLHAMATIC_EFISCAL_CI ,CT ,CTO ,CODIGO_NCM ,CODIGO_ANP\n"
                + ",COD_TICKET_TEF  FROM COMBUSTIVEL";
        update = "teste";

    }

    private void n1() {
        consulta = "SELECT PRODUTO_NIVEL1_ID, DESCRICAO ,SN_LUBRIFICANTE ,TIPO ,COD_TICKET_TEF FROM PRODUTO_NIVEL1";
        update = "teste";

    }

    private void n2() {
        consulta = "SELECT PRODUTO_NIVEL2_ID, PRODUTO_NIVEL1_ID, DESCRICAO,  EXIGIR_LEITURA_COD_BARRAS  FROM PRODUTO_NIVEL2";
        update = "teste";

    }

    private void produto() {
        consulta = "SELECT PRODUTO_ID ,PRODUTO_NIVEL2_ID ,DESCRICAO,DESCRICAO_ABREVIADA AS DESC_ABREVIADO ,UND_VENDA ,UND_MEDIDA\n"
                + ",QTD_EMBALAGEM ,QTD_CAIXA ,CT , CST_PIS_COFINS , 0 AS CST_IPI ,CTO , null as FOTO , null as OBSERVACAO\n"
                + ",SN_QUANTIDADE_FRACIONARIA  ,SN_COMPONENTE ,null AS CODIGO_NCM ,TIPO_KIT_PRODUTOS  AS TIPO_COMPONENTE\n"
                + "FROM PRODUTO\n"
                + "order BY 1;";
        update = "teste";

    }

    private void produto_empresa() {
        consulta = "select \n"
                + "(select distinct empresa_id from empresa)  AS EMPRESA_ID\n"
                + ",PP.PRODUTO_ID\n"
                + ",PP.VAL_COMISSAO\n"
                + ",PP.PER_COMISSAO\n"
                + ",PP.PRC_CUSTO\n"
                + ",PP.PRC_CUSTO_INICIAL\n"
                + ",PP.PRC_VEN_VISTA\n"
                + ",PP.PRC_VEN_PRAZO\n"
                + ",PP.PRC_VEN_PROMOCIONAL  AS PRC_VEN_PROMOCAO\n"
                + ",ee.QUANTIDADE  as  QTD_ESTOQUE_INICIAL\n"
                + ",ee.QUANTIDADE  as QTD_ESTOQUE\n"
                + ",NULL AS QTD_MINIMA\n"
                + ",PP.MARKUP\n"
                + ",current_date AS DAT_INCLUIDO\n"
                + ",current_date AS DAT_ALTERADO\n"
                + ",PP.SN_ATIVO\n"
                + "from produto   pp\n"
                + "left join  ESTOQUE_PRODUTO ee\n"
                + "ON PP.produto_id = EE.produto_id";
        update = "teste";

    }

    private void prm_atr_logico_produto() {
        consulta = "teste";
        // update = "teste";

    }

    private void componente() {
        consulta = "select PRODUTO_COMPONENTE_ID, PRODUTO_ID, QTD_COMPONENTE  FROM COMPONENTE";
        //  update = "teste";

    }

    private void cod_barra_produto() {
        consulta = "SELECT PRODUTO_ID  ,COD_BARRA  FROM COD_BARRA_PRODUTO";
        // update = "teste";

    }

    public String getTabelaPfwin() {
        return tabelaPfwin;
    }

    public void setTabelaPfwin(String tabelaPfwin) {
        this.tabelaPfwin = tabelaPfwin;
    }

    public String getUpdate() {
        return update;
    }

    public void setUpdate(String update) {
        this.update = update;
    }

    public String getConsulta() {
        return consulta;
    }

    public void setConsulta(String consulta) {
        this.consulta = consulta;
    }

    /*
     * ***********************************
     * DADOS PESSOA
     *************************************
     */
    private void prazo() {
        consulta = "select\n"
                + " PRAZO_ID\n"
                + ",DESCRICAO\n"
                + ",TIPO_FECHAMENTO\n"
                + ",DIA_1\n"
                + ",DIA_2\n"
                + ",DIA_3\n"
                + ",SN_FECHAMENTO\n"
                + ",TIPO_PRECO\n"
                + ",NULL AS SIGLA\n"
                + ",SUB_TIPO_PRAZO_ID\n"
                + "FROM PRAZO;";
    }

    private void grupopreco() {
        consulta = "SELECT\n"
                + empresaId + " AS EMPRESA_ID\n"
                + ",GRUPO_PRECO_ID\n"
                + ",DESCRICAO\n"
                + "FROM GRUPO_PRECO";

    }

    private void pessoa() {
        consulta = "SELECT\n"
                + "PESSOA_ID\n"
                + ", " + empresaId + " AS EMPRESA_PESSOA_ID\n"
                + ",CLASSE\n"
                + ",CODIGO\n"
                + ",NOME\n"
                + ",TIPO_PESSOA\n"
                + ",NUM_CPF_CNPJ\n"
                + ",NUM_RG_IE AS NUM_RG\n"
                + ",PRAZO_ID\n"
                + ",GRUPO_PRECO_ID\n"
                + ",SN_ATIVO\n"
                + ",OBSERVACAO AS OBS\n"
                + ",MENSAGEM_OPERADOR\n"
                + ",CAST(DAT_INCLUIDO AS DATE) AS DAT_INCLUIDO\n"
                + ",CAST(DAT_ALTERADO AS DATE) AS DAT_ALTERADO\n"
                + "FROM PESSOA ;";
    }

    private void email() {
        consulta = "SELECT EMAIL_ID\n"
                + ", " + empresaId + " AS EMPRESA_PESSOA_ID\n"
                + ",PESSOA_ID\n"
                + ",EMAIL\n"
                + ",OBSERVACAO\n"
                + ",SN_NFE\n"
                + ",SN_BOLETO\n"
                + ",SN_FECHAMENTO\n"
                + ",SN_CUPOM_FISCAL\n"
                + "FROM EMAIL";
    }

    private void endereco() {
        consulta = "SELECT " + empresaId + " AS EMPRESA_PESSOA_ID\n"
                + ",ENDERECO_ID\n"
                + ",PESSOA_ID\n"
                + ",ENDERECO\n"
                + ",NUMERO\n"
                + ",COMPLEMENTO\n"
                + ",BAIRRO\n"
                + ",CIDADE_ID\n"
                + ",CEP\n"
                + ",CX_POSTAL\n"
                + ",PAIS_ID\n"
                + ",EMAIL\n"
                + ",TIPO_ENDERECO\n"
                + ",CONTATO\n"
                + "FROM ENDERECO;";
    }

    private void funcionario() {
        consulta = "SELECT\n"
                + "PESSOA_ID\n"
                + ", " + empresaId + " AS EMPRESA_PESSOA_ID\n"
                + ",CAST(DAT_ADMISSAO AS DATE) AS DAT_ADMISSAO\n"
                + ",CAST(DAT_SAIDA AS DATE) AS DAT_SAIDA\n"
                + ",CARGO\n"
                + ",FUNCAO\n"
                + ",SENHA_VENDA\n"
                + ",TURNO_ID\n"
                + ",NIVEL_ACESSO\n"
                + ",PDV_ID_TRANSF AS PDV_ID\n"
                + "FROM FUNCIONARIO;";
    }

    private void pessoa_pf() {
        consulta = "SELECT\n"
                + "PESSOA_ID\n"
                + ", " + empresaId + " AS EMPRESA_PESSOA_ID\n"
                + ",SEXO\n"
                + ",FOTO\n"
                + ",CAST(DAT_NASCIMENTO AS DATE) AS DAT_NASCIMENTO\n"
                + "FROM PESSOA_PF;";

    }

    private void pessoa_pj() {
        consulta = "SELECT\n"
                + "PESSOA_ID\n"
                + ", " + empresaId + " AS EMPRESA_PESSOA_ID\n"
                + ",NUM_IM\n"
                + ",NOME_FANTASIA    AS NOM_FANTASIA\n"
                + ",CAST(DAT_FUNDACAO AS DATE) AS DAT_FUNDACAO\n"
                + ",PORTE\n"
                + "FROM   PESSOA_PJ ;";
    }

    private void prm_atr_logico_pessoa() {
        consulta = "SELECT\n"
                + "PESSOA_ID\n"
                + ", " + empresaId + " AS EMPRESA_PESSOA_ID\n"
                + ",PRM_ATR_LOGICO_ID\n"
                + ",VALOR\n"
                + "FROM  PRM_ATR_LOGICO_PESSOA ;";
    }

    private void telefone() {
        consulta = "SELECT\n"
                + empresaId + " AS EMPRESA_PESSOA_ID\n"
                + ",TELEFONE_ID    AS FONE_ID\n"
                + ",PESSOA_ID\n"
                + ",NUM_TELEFONE\n"
                + ",TIPO_TELEFONE\n"
                + ",OBSERVACAO\n"
                + "FROM TELEFONE;";
    }

    private void veiculo() {
        consulta = "SELECT\n"
                + empresaId + " AS EMPRESA_PESSOA_ID\n"
                + ",PLACA  AS PLACA_ID\n"
                + ",PESSOA_ID\n"
                + ",UF\n"
                + ",MARCA\n"
                + ",ANO\n"
                + ",NUM_FROTA\n"
                + ",ULTIMO_KM\n"
                + ",MENSAGEM_OPERADOR\n"
                + ",CAST (DAT_INCLUIDO AS DATE) AS DAT_INCLUIDO\n"
                + "FROM VEICULO;";
    }

    private void prm_atr_logico_veiculo() {
        consulta = "SELECT\n"
                + empresaId + " AS EMPRESA_PESSOA_ID\n"
                + ",PLACA AS PLACA_ID\n"
                + ",PRM_ATR_LOGICO_ID\n"
                + ",VALOR\n"
                + "FROM  PRM_ATR_LOGICO_VEICULO \n"
                + "WHERE PLACA IS NOT NULL";
    }

    private void DESPESA_NIVEL1() {
        consulta = "SELECT * FROM DESPESA_NIVEL1";
    }

    private void DESPESA_NIVEL2() {
        consulta = "SELECT * FROM DESPESA_NIVEL2";
    }

    private void DESPESA_NIVEL3() {
        consulta = "select DESPESA_NIVEL3_ID, DESCRICAO, PRM_EMISSAO_PAG, PRM_FLUXO_CAIXA, PRM_DESPESA_UNICA, PRM_COMPRA_COMBUSTIVEL,\n"
                + "       SN_INTEGRACAO_CONTABIL, PERMITIR_LANC_CAIXA as \"PERMITIR_LANCAMENTO_CAIXA\", DESPESA_NIVEL2_ID\n"
                + "from DESPESA_NIVEL3;";
    }

    private void CONTA_CORRENTE() {
        consulta = "SELECT\n"
                + "(select distinct empresa_id from empresa) AS \"EMPRESA_ID\"\n"
                + ",CONTA_CORRENTE_ID\n"
                + ",TIPO\n"
                + ",DESCRICAO\n"
                + ",BANCO_ID\n"
                + ",NOME_AGENCIA AS \"NOM_AGENCIA\"\n"
                + ",NUM_AGENCIA  AS \"NUM_AGENCIA\"\n"
                + ",NUM_CONTA_CORRENTE\n"
                + ",SN_ATIVO\n"
                + ",VAL_TARIFA_BOLETO AS \"VAL_TAR_BOL\"\n"
                + ",VAL_TARIFA_CLIENTE  AS \"VAL_TAR_CLIENTE\"\n"
                + ",COBERTURA_ID\n"
                + "FROM CONTA_CORRENTE;";
    }

    private void BOMBA() {
        consulta = "SELECT\n"
                + "(select distinct empresa_id from empresa) AS \"EMPRESA_ID\"\n"
                + ",BOMBA_ID\n"
                + ",NUM_SERIE\n"
                + ",NOME_FABRICANTE\n"
                + ",MODELO\n"
                + ",TIPO_MEDICAO\n"
                + ",SN_ATIVO\n"
                + "FROM bomba;";
    }

    private void TANQUE() {
        consulta = "SELECT\n"
                + "(select distinct empresa_id from empresa) AS \"EMPRESA_ID\"\n"
                + ",TANQUE_ID\n"
                + ",TIPO_TANQUE_ID\n"
                + ",COMBUSTIVEL_ID\n"
                + ",10000 AS \"QTD_ESTOCADA\"\n"
                + ",current_date AS \"DAT_ESTOQUE\"\n"
                + ",NULL AS \"LEITURA_TANQUE\"\n"
                + ",'01.01.2015' AS \"DAT_MOVIMENTO_VIG\"\n"
                + ",1 AS \"TURNO_ID_VIG\"\n"
                + ",NULL AS \"DAT_MOVIMENTO_EXCL\"\n"
                + ",NULL AS \"TURNO_ID_EXCL\"\n"
                + ",SN_LEITURA_ESPECIFICA\n"
                + ",LASTRO\n"
                + ",COD_AUTOMACAO\n"
                + ",NULL AS \"DAT_ULTIMO_MOVIMENTO\"\n"
                + ",'01.01.2015' AS \"DAT_INCLUSAO\"\n"
                + ",NULL AS \"FILTRO_COMBUSTIVEL_ID\"\n"
                + "FROM TANQUE;";
    }

    private void BICO() {
        consulta = "SELECT\n"
                + "(select distinct empresa_id from empresa) AS \"EMPRESA_ID\"\n"
                + ",BICO_ID\n"
                + ",TANQUE_ID\n"
                + ",ENC_ABERTURA_LTS\n"
                + ",ENC_ABERTURA_VAL\n"
                + ",PRECISAO_ENC\n"
                + ",ATM_PULSOS\n"
                + ",ATM_BICO\n"
                + ",ATM_BOMBA\n"
                + ",SN_BICO_FORA\n"
                + ",SN_MUDANCA_PRECO\n"
                + ",CASAS_CONVERSAO_LTS\n"
                + ",'01.01.2015' AS \"DAT_MOVIMENTO_VIG\"\n"
                + ",1 AS  \"TURNO_ID_VIG\"\n"
                + ",NULL  AS  \"DAT_MOVIMENTO_EXCL\"\n"
                + ",NULL  AS  \"TURNO_ID_EXCL\"\n"
                + ",TIPO_VENDA_ID\n"
                + ",'01.01.2015' AS \"DAT_INCLUSAO\"\n"
                + ",COBERTURA_ID\n"
                + ",ATM_POSICAO_ABASTECIMENTO\n"
                + ",NULL AS \"ATM_CANAL\"\n"
                + ",ATM_PONTO\n"
                + ",ATM_COD_LEITOR\n"
                + ",BOMBA_ID\n"
                + "FROM BICO;";
    }

    private void CARTAO() {
        consulta = "SELECT\n"
                + "CARTAO_ID\n"
                + ",DESCRICAO\n"
                + ",SN_LIBERA_DAT_DEPOSITO AS  \"SN_LIBERA_DAT\"\n"
                + ",SN_CONTRA_VALE\n"
                + ",GERENCIADOR_TEF_ID\n"
                + ",NULL AS \"SN_INTEGRA_CONCILIACAO\"\n"
                + "FROM CARTAO;";
    }
        private void BANDEIRA_CARTAO() {
        consulta ="SELECT BANDEIRA_CARTAO_ID, DESCRICAO  FROM BANDEIRA_CARTAO;";
    }

    private void CARTAO_EMPRESA() {
        consulta = "SELECT\n"
                + "(select distinct empresa_id from empresa) AS \"EMPRESA_ID\"\n"
                + ",CARTAO_ID\n"
                + ",(select distinct empresa_id from empresa) AS \"EMPRESA_CONTA_CORRENTE_ID\"\n"
                + ",CONTA_CORRENTE_ID\n"
                + ",NUM_DIAS_RECEBER\n"
                + ",PER_TAXA_ADM\n"
                + ",VAL_CUSTO_OPERACAO\n"
                + ",'01.01.2015' AS \"DAT_INCLUIDO\"\n"
                + ",'01.01.2015' AS \"DAT_ALTERADO\"\n"
                + ",SN_ATIVO\n"
                + ",GERENCIADOR_TEF_ID\n"
                + ",TIPO_OPERACAO\n"
                + ",REDE_ADMINISTRADORA_ID\n"
                + ",BANDEIRA_CARTAO_ID\n"
                + ",NULL AS \"PESSOA_ID\"\n"
                + ",NULL AS \"EMPRESA_PESSOA_ID\"\n"
                + ",BINS\n"
                + ",SN_PERMITIR_TROCO_CARTAO_FRETE\n"
                + ",1 AS \"PRAZO_ID\"\n"
                + ",NUM_DIAS_CARENCIA_VENC_LOTE\n"
                + ",TIPO_CALCULO_DAT_DEPOSITO\n"
                + "FROM CARTAO;";
    }

    private void PRECO_COMB() {
        consulta = "select\n"
                + "(select distinct empresa_id from empresa) as EMPRESA_ID\n"
                + ",PRECO_COMBUSTIVEL_ID as PRECO_COMB_ID\n"
                + ",COMBUSTIVEL_ID\n"
                + ",cast(DAT_MOVIMENTO as date) as   DAT_MOVIMENTO\n"
                + ",TURNO_ID\n"
                + ",PRC_CUSTO\n"
                + ",PRC_VEN_VISTA\n"
                + ",PRC_VEN_PRAZO\n"
                + ",PRC_VEN_PROMOCAO\n"
                + ",VAL_COMISSAO\n"
                + ",PER_COMISSAO\n"
                + ",PER_ICMS\n"
                + "from PRECO_COMBUSTIVEL;";
    }

    private void PRECO_ESPECIAL() {
        consulta = "SELECT\n"
                + +empresaId + " AS EMPRESA_PESSOA_ID\n"
                + ",PRECO_ESPECIAL_ID AS PRECO_ESPECIAL_ID\n"
                + ",PESSOA_ID AS PESSOA_ID\n"
                + ",GRUPO_PRECO_ID AS GRUPO_PRECO_ID\n"
                + ",PRODUTO_NIVEL1_ID AS PRODUTO_NIVEL1_ID\n"
                + ",PRODUTO_ID AS PRODUTO_ID\n"
                + ",COMBUSTIVEL_ID AS COMBUSTIVEL_ID\n"
                + ",NULL AS PER_PRECO\n"
                + ",NULL AS PRC_PRECO\n"
                + ",TIPO_PRECO_ESPECIAL AS TIPO_PRECO\n"
                + ",VAL_PRECO AS VAL_PRC_ESPECIAL\n"
                + ",SERVICO_ID AS SERVICO_ID\n"
                + ",SERVICO_NIVEL1_ID AS SERVICO_NIVEL1_ID\n"
                + ",(SELECT DISTINCT EMPRESA_ID from EMPRESA) AS EMPRESA_ID\n"
                + "FROM preco_especial";
    }

    private void RECIBO_PAGAMENTO() {
        consulta = "select\n"
                + "(SELECT FIRST 1 EMPRESA_ID FROM EMPRESA) AS EMPRESA_ID\n"
                + ", Q.RECIBO_ID AS RECIBO_PAGAMENTO_ID\n"
                + ", Q.CLIENTE_ID AS PESSOA_ID\n"
                + ", " + empresaId + " AS EMPRESA_PESSOA_ID\n"
                + ", (SELECT FIRST 1 EMPRESA_ID FROM EMPRESA) AS EMPRESA_CONTA_CORRENTE_ID\n"
                + ", NULL AS CONTA_CORRENTE_ID\n"
                + ", CAST(Q.DAT_MOVIMENTO_ECF AS DATE)  AS DAT_MOVIMENTO\n"
                + ", NULL AS TURNO_ID\n"
                + ", NULL AS PDV_ID\n"
                + ", 'INTERCAMP' AS USUARIO\n"
                + ", 0 AS FORMA_QUITACAO\n"
                + ", NULL AS TIPO_DEPOSITO_ID\n"
                + ", 'REQ' AS TIPO_QUITACAO\n"
                + ", NULL AS QTD_NOTA_SELEC\n"
                + ", NULL AS VAL_NOTA_SELEC\n"
                + ", NULL AS QTD_HAVER_SELEC\n"
                + ", NULL AS VAL_HAVER_SELEC\n"
                + ", NULL AS VAL_HAVER_GERADO\n"
                + ", NULL AS VAL_DEBITO_GERADO\n"
                + ", NULL AS RECEITA_ID\n"
                + ", NULL AS VAL_JUROS\n"
                + ", NULL AS RECEITA_ACRESCIMO_ID\n"
                + ", NULL AS VAL_ACRESCIMO\n"
                + ", NULL AS DESPESA_NIVEL3_ID\n"
                + ", NULL AS VAL_DESCONTO\n"
                + ", NULL AS VAL_TARIFA\n"
                + ", Q.VALOR_TOTAL AS VAL_PAGO\n"
                + ", NULL AS ARQUIVO_CNAB_ID\n"
                + ", NULL AS ARQUIVO_RETORNO_ID\n"
                + ", NULL AS DAT_INCLUSAO\n"
                + ", NULL AS DESPESA_NIVEL3_TAXA_ID\n"
                + "FROM QUITACAO Q";
    }

    private void aliquota_produto_uf() {
        consulta = "select\n"
                + "PRODUTO_ID,\n"
                + "(select first 1 UF from EMPRESA) as \"UF\",\n"
                + "PER_ICMS AS \"PER_ALIQUOTA\",\n"
                + "PER_REDUCAO_ICMS as \"RED_ICMS\",\n"
                + "NULL as \"PER_REDUCAO_BASE_ICMS\"\n"
                + "from PRODUTO   ";
    }

    private void IMPORTA_ECF() {
        consulta = "SELECT\n"
                + "(SELECT EMPRESA_ID FROM EMPRESA) as EMPRESA_ID\n"
                + "--,null as ECF_CONSUMIDOR_ID\n"
                + ",CAST(V.DAT_MOVIMENTO_ECF AS DATE) as DAT_MOVIMENTO\n"
                + ",CC.TURNO_ID as TURNO_ID\n"
                + ",V.PDV_ID_ORIGEM as PDV_ID\n"
                + ",V.DAT_HOR_INICIO_VENDA_CPU as DAT_EMISSAO\n"
                + ",CAST(V.DAT_HOR_INICIO_VENDA_ECF AS DATE) as DAT_REDUCAO\n"
                + ",V.ECF_ID as ECF_ID\n"
                + ",'EF' as NUM_SERIE\n"
                + ",'00'||EE.NUM_ECF as NUM_ECF\n"
                + ",V.NUM_COO as NUM_NF\n"
                + ",V.NUM_COO as NUM_COO\n"
                + ",V.FUNCIONARIO_ID as FUNCIONARIO_ID\n"
                + ",(SELECT EMPRESA_ID FROM EMPRESA) as EMPRESA_PESSOA_ID\n"
                + ",V.PESSOA_ID as PESSOA_ID\n"
                + ",V.NUM_CPF_CNPJ as NUM_CPF_CNPJ\n"
                + ",V.CONVENIADO_ID as CONVENIADO_ID\n"
                + ",V.NF_MODELO1_ID as NF_MODELO1_ID\n"
                + ",V.PLACA as PLACA_ID\n"
                + ",V.MARCA as MARCA\n"
                + ",V.KM as KM\n"
                + ",V.MOTORISTA as MOTORISTA\n"
                + "--,NULL as VAL_TOTAL\n"
                + ",current_date as DAT_INCLUSAO\n"
                + ",V.VENDA_ID as VENDA_ID\n"
                + ",V.CAIXA_ID as CFWIN_ID\n"
                + "--,NULL as MODELO\n"
                + ",'00'||EE.num_ecf as SERIE\n"
                + ",V.NUM_CCF as NUM_CCF\n"
                + ",NULL as NUM_SERIE_SAT\n"
                + ",NULL as CHAVE_ACESSO\n"
                + ",NULL as ECF_CONSUMIDOR_ID_ACOBERTADO\n"
                + "FROM venda V,  ECF EE  , CAIXA CC\n"
                + "WHERE V.ecf_id = EE.ecf_id AND V.caixa_id= CC.caixa_id\n"
                + "and  CAST (v.dat_movimento_ecf as DATE) = '09.12.2014'\n"
                + "AND V.situacao =1";
    }

    private void IMPORTA_ITEM_ECF() {
        consulta = "SELECT\n"
                + "(SELECT EMPRESA_ID FROM EMPRESA) as EMPRESA_ID\n"
                + ",null as  ECF_CONSUMIDOR_ID\n"
                + "--,null as ITEM_ECF_CONSUMIDOR_ID\n"
                + ",ee.produto_id\n"
                + ",ee.SERVICO_ID\n"
                + ",ee.COMBUSTIVEL_ID\n"
                + ",coalesce(pp.ct, cc.ct) as CT\n"
                + ",coalesce(pp.cto, cc.cto)   as CTO\n"
                + ", null as SN_LUBRIFICANTE\n"
                + ",pp.PER_ICMS\n"
                + ",pp.PER_REDUCAO_ICMS as PER_RED_ICMS\n"
                + ",ee.QTDE\n"
                + ",ee.PRC_UNITARIO\n"
                + ",ee.PRC_ESPECIAL\n"
                + ",ee.VAL_TOTAL AS VAL_ITEM\n"
                + ",coalesce(pp.val_comissao, ss.val_comissao)as VAL_COMISSAO\n"
                + ",coalesce(pp.per_comissao, ss.per_comissao)as PER_COMISSAO\n"
                + ",null as CFWIN_ID\n"
                + ",null as FUNCIONARIO_ID\n"
                + ",null as PER_ISSQN\n"
                + ",null as CFOP\n"
                + ",v.venda_id\n"
                + "FROM venda v\n"
                + "inner join  item_venda ee on(V.venda_id =ee.venda_id)\n"
                + "INNER JOIN ECF F ON(F.ecf_id= V.ecf_id )\n"
                + "left join produto pp  on(ee.produto_id= pp.produto_id)\n"
                + "left join servico  ss  on(ee.servico_id=ss.servico_id)\n"
                + "left join combustivel cc on(ee.combustivel_id=cc.combustivel_id)\n"
                + "\n"
                + "WHERE\n"
                + "--CAST (v.dat_hor_inicio_venda_ecf AS DATE) = '09.12.2014'  AND\n"
                + "CAST (v.dat_movimento_ecf as DATE) = '09.12.2014'\n"
                + "AND V.situacao =1\n"
                + "--v.num_coo  between 632385  and  632868  and\n"
                + "--v.situacao not in(2,3)";
    }

    public ArrayList updateFinal() {
          ArrayList updateList = new ArrayList();

        
        updateList.add("DELETE FROM prm_atr_logico_produto WHERE prm_atr_logico_id IN (58,59,60)");
        updateList.add("INSERT INTO prm_atr_logico_produto  SELECT empresa_id,produto_id,58,'S'  FROM produto_empresa;");
        updateList.add("INSERT INTO prm_atr_logico_produto  SELECT empresa_id,produto_id,59,'S' FROM produto_empresa;");
        updateList.add("INSERT INTO prm_atr_logico_produto  SELECT empresa_id,produto_id,60,'S' FROM produto_empresa;");
        updateList.add("execute PROCEDURE atualiza_generators;");

       

        return updateList;
    }



}
