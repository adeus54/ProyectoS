package BL;

import Clases.Rol;
import DAT.RolUsuarioDAT;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author alexa
 */
public class LROLUsuario {

    RolUsuarioDAT RolUs= new RolUsuarioDAT();

    public int insertrRoleUser(int user, int rol) throws SQLException {
        int usuario = user;
        int role = rol;

        return RolUs.insertRolUser(usuario, role);
    }

    public int deleteRoleUser(int user, int rol) throws SQLException {
        int usuario = user;
        int role = rol;

        return RolUs.deleteRolUser(usuario, role);
    }
    
    public ArrayList<Rol> consultarId_AIngresar() throws ClassNotFoundException, SQLException {
        ArrayList<Rol> lstCata = new ArrayList<>();

        ResultSet rs = RolUs.consult_RolaAdjuntar("CLIENTE");

        while (rs.next()) {
            int id = rs.getInt("rol_id");
            
            Rol objAdmin = new Rol(id);
            lstCata.add(objAdmin);
        }

        return lstCata;
    }

}
