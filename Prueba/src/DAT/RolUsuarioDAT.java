package DAT;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author alexa
 */
public class RolUsuarioDAT{

DatConexion con = new DatConexion();
  
    public int insertRolUser(int use, int rol) {
        int retorno = 0;
        try {
            String strSQL = "INSERT INTO mydb.rol_usuario (us_id, rol_id) " + "VALUES (?,?)";
            PreparedStatement pst = con.AbrirConexion().prepareStatement(strSQL);
            pst.setInt(1, use);
            pst.setInt(2, rol);
            retorno = pst.executeUpdate();
            pst.close();
            con.CerrarConexion();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
        return retorno;
    }


    public int deleteRolUser(int use, int rol) {
        int retorno = 0;
        try {
            String strSQL = "DELETE FROM mydb.rol_usuario WHERE us_id = ? AND rol_id = ?";
            PreparedStatement pst = con.AbrirConexion().prepareStatement(strSQL);
            pst.setInt(1, use);
            pst.setInt(2, rol);
            retorno = pst.executeUpdate();
            pst.close();
            con.CerrarConexion();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
        return retorno;
    }

    public ResultSet consultItem_Rol(int id) {
        ResultSet rs = null;
        try {
            PreparedStatement pst = con.AbrirConexion().prepareStatement(
                    "SELECT* FROM mydb.rol r, mydb.rol_usuario ru Where ru.rol_id = r.rol_id AND ru.us_id =" + id);
            rs = pst.executeQuery();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
        return rs;
    }
    
    public ResultSet consult_RolaAdjuntar(String rolname) {
        ResultSet rs = null;
        try {
            PreparedStatement pst = con.AbrirConexion().prepareStatement(
                    "SELECT rol_id FROM mydb.rol WHERE rol_nombre = ?" );
            pst.setString(1, rolname);
            rs = pst.executeQuery();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
        return rs;
    }

}
