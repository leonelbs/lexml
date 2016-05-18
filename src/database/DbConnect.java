/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import Frame.FramePrincipal;
import Frame.FrameSaida;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.ArrayList;
import java.util.Properties;

/**
 *
 * @author leonel.santos
 */
public final class DbConnect extends Frame.FramePrincipal {

    public Connection connection;
    public ArrayList corpoText;
    public ArrayList corpoText2;
    public ArrayList titulo;
    public String dadosDb;
    String conexao;
    String user;
    String password;
    ResultSet result;
    FrameSaida fSaida;
    FramePrincipal fprincipal;
    boolean readOnly;
    static final String TEMP = System.getProperty("java.io.tmpdir");

    public DbConnect(String conexao, String user, String password, boolean readOnly) {
        this.conexao = conexao;
        this.user = user;
        this.password = password;
        this.readOnly = readOnly;
        fSaida = new FrameSaida();
        try {
            conectar(conexao, user, password, this.readOnly);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(DbConnect.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public DbConnect() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void conectar(String conexao, String user, String password, boolean readOnly) throws SQLException, ClassNotFoundException {

        Class.forName("org.firebirdsql.jdbc.FBDriver");
        this.readOnly = readOnly;
        if (this.readOnly == true) {
            Properties props = new Properties();
            props.setProperty("user", "SYSDBA");
            props.setProperty("password", "masterkey");
            props.setProperty("TRANSACTION_READ_COMMITTED",
                    "isc_tpb_read_committed,isc_no_rec_version,"
                    + "isc_tpb_write,isc_tpb_nowait");
            connection = DriverManager.getConnection(this.conexao, this.user, this.password);
            connection.setAutoCommit(false);

        } else {
            connection = DriverManager.getConnection(this.conexao, this.user, this.password);
            connection.setAutoCommit(false);
        }

    }

    public void desconectar() throws SQLException {

        if (!connection.isClosed()) {

            connection.commit();
            connection.close();
        }

    }

    public ResultSet consulta(String query) throws ClassNotFoundException, SQLException {

        try {

            conectar(conexao, user, password, true);
            Statement st = connection.createStatement();
            result = st.executeQuery(query);

        } catch (SQLException ex) {
            Logger.getLogger(DbConnect.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage());

        }
       connection.clearWarnings();
      
        return result;
    }

    public ResultSet consultaMatching(String query) throws ClassNotFoundException, SQLException {

        try {

            conectar(conexao, user, password, true);
            Statement st = connection.createStatement();
            result = st.executeQuery(query);

        } catch (SQLException ex) {
            Logger.getLogger(DbConnect.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage());

        }

        connection.close();

        return result;
    }

    public void insert(ArrayList query) throws ClassNotFoundException, SQLException {

        try (Statement st = connection.createStatement()) {
            for (Object linha : query) {
                st.executeUpdate((String) linha);
              

            }
            connection.commit();
            connection.close();
        }
    }

}
