package DAT;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author alexa
 */
public class Precios_PDAT {

 DatConexion con = new DatConexion();
    public int Insertar_Precios(double pr, int can, double Tpre, int rs, int idpr) {
    int retorno = 0;
        try {
            String strSQL = "INSERT INTO myinvtdb.precios ( precioU, rsv_cantidad, rsv_saldo, idreservacion, idproducto) " + "VALUES (?,?,?,?,?)";
            PreparedStatement pst = con.AbrirConexion().prepareStatement(strSQL);
            pst.setDouble(1, pr);
            pst.setInt(2, can);
            pst.setDouble(3, Tpre);
            pst.setInt(4, rs);
            pst.setInt(5, idpr);
            retorno = pst.executeUpdate();
            pst.close();
            con.CerrarConexion();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
        return retorno;
    
    }
    

    public ResultSet consultProductsSelected(int id) {
        ResultSet rs = null;
        try {
            PreparedStatement pst = con.AbrirConexion().prepareStatement("SELECT * FROM myinvtdb.reservaciones r, myinvtdb.precios s , myinvtdb.productos p \n"
                    + "WHERE 1=1 \n"
                    + "AND s.idproducto = p.idProductos\n"
                    + "AND s.idreservacion = ?");
            pst.setInt(1, id);
            rs = pst.executeQuery();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
        return rs;
    }
    
}
