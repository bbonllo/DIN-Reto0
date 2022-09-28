package din.reto0.model;

import din.reto0.connection.ConnectionOpenClose;
import din.reto0.exceptionManager.ExceptionManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author JanamUnai;
 */
public class ModelImplementationDB implements Model{
    
    private Connection con;
    private PreparedStatement stmt;
    private ConnectionOpenClose conection = new ConnectionOpenClose();

    
    /**
     * 
     * Its opens the database and gets the GREET message
     * 
     * @return
     * @throws ExceptionManager 
     */
    @Override
    public String getGreeting() throws ExceptionManager {
        ResultSet rs = null;
	String greet = null;

        con = conection.openConnection();
	String GETGREETING = "SELECT * from greetingtext";

        try {
            stmt = con.prepareStatement(GETGREETING);
            rs = stmt.executeQuery();

               	while (rs.next()) {
                    greet = rs.getString("greet");
		}

		if (rs != null)
                    rs.close();
                    conection.closeConnection(stmt, con);
	} catch (SQLException e) {
		String error = "Error getting the data";
		ExceptionManager e1 = new ExceptionManager(error);
		throw e1;
	}
	return greet;
    }
    
}
