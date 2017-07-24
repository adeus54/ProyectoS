package DAT;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author alexa
 */
public class ReservacionDAT {

    DatConexion con = new DatConexion();
     public int insertreservacion(int use) {
        int retorno = 0;
        try {
            String strSQL = "INSERT INTO myinvtdb.reservaciones (us_id) " + "VALUES (?)";
            PreparedStatement pst = con.AbrirConexion().prepareStatement(strSQL);
            pst.setInt(1, use);
            retorno = pst.executeUpdate();
            pst.close();
            con.CerrarConexion();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
        return retorno;
    }

    public ResultSet consultexistencia() {
        ResultSet rs = null;
        try {
            PreparedStatement pst = con.AbrirConexion().prepareStatement(
                    "SELECT MAX(idreservaciones) AS id FROM myinvtdb.reservaciones ");
          
            rs = pst.executeQuery();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
        return rs;
    }
      
}
