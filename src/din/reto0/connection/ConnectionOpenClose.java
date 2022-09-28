package din.reto0.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;

import din.reto0.exceptionManager.ExceptionManager;

/**
 *
 * @author Janam & Unai
 */
public class ConnectionOpenClose {

    protected ResourceBundle configFile;
    protected String url;
    protected String user;
    protected String pass;
    protected Connection con;
    protected PreparedStatement stmt;

    /**
     *
     * Gets the information from a .propertis file and sets it into variables
     */
    public ConnectionOpenClose() {
        configFile = ResourceBundle.getBundle("din.reto0.config");
        url = configFile.getString("URL");
        user = configFile.getString("USER");
        pass = configFile.getString("PASSWORD");
    }

    /**
     *
     * @return con
     * @throws ExceptionManager
     *
     * Connects to a database as url, user and pass.
     */
    public Connection openConnection() throws ExceptionManager {
        try {
            con = DriverManager.getConnection(url, user, pass);
        } catch (SQLException e) {
            throw new ExceptionManager(e.getMessage());
        }
        return con;
    }

    /**
     *
     * @param stmt
     * @param con
     * @throws SQLException
     *
     * Receives PreparationStatement and connection, either of both is null it
     * closes the connection.
     */
    public void closeConnection(PreparedStatement stmt, Connection con) throws SQLException {
        if (stmt != null) {
            stmt.close();
        }

        if (con != null) {
            con.close();
        }

    }

}
