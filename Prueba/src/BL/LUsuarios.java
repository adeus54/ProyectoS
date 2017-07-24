package BL;

import DAT.UsuarioDAT;
import Clases.Usuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author alexa
 */
public class LUsuarios {

    UsuarioDAT User = new UsuarioDAT();

    public ArrayList<Usuario> consultarUsuarios() throws ClassNotFoundException, SQLException {
        ArrayList<Usuario> lstCata = new ArrayList<>();

        ResultSet rs = User.consultUser();

        while (rs.next()) {
            int id = rs.getInt("us_id");
            String name = rs.getString("us_nombre");
            String apell = rs.getString("us_apellido");
            String login = rs.getString("us_login");
            String password = rs.getString("us_password");
            int ID = rs.getInt("identificacion");
            Usuario objAdmin = new Usuario(id, name, apell, login, password, ID);
            lstCata.add(objAdmin);
        }

        return lstCata;
    }
    
    public ArrayList<Usuario> consultarIUsuario(String user) throws ClassNotFoundException, SQLException {
        ArrayList<Usuario> lstCata = new ArrayList<>();

        ResultSet rs = User.consultID_User(user);

        while (rs.next()) {
            int id = rs.getInt("us_id");
            
            Usuario objAdmin = new Usuario(id);
            lstCata.add(objAdmin);
        }

        return lstCata;
    }
    
    public ArrayList<Usuario> consultarUserIngresado(int us) throws ClassNotFoundException, SQLException {
        ArrayList<Usuario> lstCata = new ArrayList<>();

        ResultSet rs = User.consultUsuarioIngresado(us);

        while (rs.next()) {
            int id = rs.getInt("us_id");
            
            Usuario objAdmin = new Usuario(id);
            lstCata.add(objAdmin);
        }

        return lstCata;
    }
    
    public ArrayList<String> consultarLogin(String log, String pass) throws ClassNotFoundException, SQLException {
        ArrayList<String> lstCata = new ArrayList<>();
        String login = "";
        String password = "";
        String rol = "";
        int r = 0;
        boolean verificacion = false;
        ResultSet rs = User.consultLogin(log, pass);

        while (rs.next()) {
            login = rs.getString("us_login");
            password = rs.getString("us_password");
            rol = rs.getString("rol_nombre");
        }
        //Validacion
        if (login.equals(log) && password.equals(pass)) {
            verificacion = true;

        }
        if (rol.equals("ADMINISTRADOR")) {
            r = 1;
        } else {
            if (rol.equals("CLIENTE")) {
                r = 2;
            }
        }
        lstCata.add(Boolean.toString(verificacion));
        lstCata.add(Integer.toString(r));
        return lstCata;
    }

    public ArrayList<Usuario> consultUsersid() throws ClassNotFoundException, SQLException {
        ArrayList<Usuario> lstCata = new ArrayList<>();

        ResultSet rs = User.consultUserRol();

        while (rs.next()) {
            String ide = rs.getString("us_id");
            String name = rs.getString("us_nombre");
            String apell = rs.getString("us_apellido");
            String login = rs.getString("us_login");
            String password = rs.getString("us_password");
            int ID = rs.getInt("identificacion");
            int id = Integer.parseInt(ide);
            Usuario objAdmin = new Usuario(id, name, apell, login, password, ID);
            lstCata.add(objAdmin);
        }
        return lstCata;
    }

    public int insertUsersObjeto(Usuario objAdmin) throws SQLException, ClassNotFoundException {
        String nombre = objAdmin.getUs_nombres();
        String apelido = objAdmin.getUs_apellidos();
        String login = objAdmin.getUs_login();
        String password = objAdmin.getUs_password();
        String identificacion = Integer.toString(objAdmin.getID());
        int a;
        ResultSet rs = User.consultExistencia(identificacion,login);
        
        int Ide = 0;
        while (rs.next()) {
            Ide = rs.getInt("total");
        }
        //Validacion
        if (Ide > 0) {
            a = 100;
        } else {
            return User.insertUser(nombre, apelido, login, password, objAdmin.getID());
        }
        return a;
    }

    public int modificarObjetUser(Usuario objAdmin) throws SQLException {
        String nombre = objAdmin.getUs_nombres();
        String apelido = objAdmin.getUs_apellidos();
        String login = objAdmin.getUs_login();
        String password = objAdmin.getUs_password();
        int ide = objAdmin.getUs_id();
        int ID = objAdmin.getID();
        return User.mod_User(nombre, apelido, login, password, ide, ID);
    }

    public int deleteObjetUser(Usuario objAdmin) throws SQLException {
        int ident = objAdmin.getID();

        return User.deleteUser(ident);
    }

}
