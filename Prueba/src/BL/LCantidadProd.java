package BL;

import DAT.Precios_PDAT;
import Modelo.vo.vo.PreciosVO;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author alexa
 */
public class LCantidadProd {

    Precios_PDAT PreUs= new Precios_PDAT();

    public int Insertar_Reservacion(double pu, int can, int rs, int idpr) throws SQLException {
        double precioU = pu;
        int cantidad = can;
        //Se hace el formateo a dos digitos
        double totalSinIVA = precioU * cantidad;
        String sinIva = String.format("%.2f", totalSinIVA);
        double tempI= Double.parseDouble(sinIva);
        //Se hace el formateo a dos digitos 
        double iva = tempI * 0.14;    
        String ivaA = String.format("%.2f", iva);
        double tempA= Double.parseDouble(ivaA);
        
        double totalAPagar = tempI + tempA;
        String Total = String.format("%.2f", totalAPagar);
        double tempTotal= Double.parseDouble(Total);
        
        int idReservacion = rs;
        int idProd = idpr;
               
        return PreUs.Insertar_Precios(precioU, cantidad, tempTotal, idReservacion, idProd);
    }
    
    public ArrayList<PreciosVO> ConsultarPreciosPSeleccionados(int id) throws ClassNotFoundException, SQLException, IOException {
        ArrayList<PreciosVO> lstCata = new ArrayList<>();

        ResultSet rs = PreUs.consultProductsSelected(id);

        while (rs.next()) {
            
            double precio = rs.getDouble("precioU");
            int can = rs.getInt("rsv_cantidad");     
            double Sprecio = rs.getDouble("rsv_saldo");
            int id_res = rs.getInt("idreservacion");  
            int id_prod = rs.getInt("idproducto");  
            
            PreciosVO objAdmin = new PreciosVO(precio,can,Sprecio, id_res,id_prod);
            lstCata.add(objAdmin);
        }  
    
        return lstCata;
    }

}