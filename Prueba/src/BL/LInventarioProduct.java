package BL;


import DAT.ProductsDAT;

import Clases.Productos;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


/**
 *
 * @author alexa
 */
public class LInventarioProduct {
    
    
    ProductsDAT Product = new ProductsDAT();
    
    public ArrayList<Productos> ConsultarProducts() throws ClassNotFoundException, SQLException, IOException {
        ArrayList<Productos> lstCata = new ArrayList<>();

        ResultSet rs = Product.consultProducts();

        while (rs.next()) {
            
            String code = rs.getString("p_Codigo");
            String nomb = rs.getString("p_nombre");
            String descrip = rs.getString("p_descripcion");
            double precio = rs.getDouble("p_precio");
            String dispon= rs.getString("p_disponibilidad");
            int cantidad = rs.getInt("p_cantidad");
            String url = rs.getString("p_urlImagen");
            InputStream  foto = rs.getBinaryStream("p_img");
            
            Productos objAdmin = new Productos(code,nomb,descrip,precio,dispon,cantidad,url, foto);
            lstCata.add(objAdmin);
        }  
    
        return lstCata;
    }
    public ArrayList<Productos> ConsultarProductsReservados(int id) throws ClassNotFoundException, SQLException, IOException {
        ArrayList<Productos> lstCata = new ArrayList<>();

        ResultSet rs = Product.consultProductsSelected(id);

        while (rs.next()) {

            String code = rs.getString("p_Codigo");
            String nomb = rs.getString("p_nombre");

            double precio = rs.getDouble("p_precio");
            InputStream foto = rs.getBinaryStream("p_img");

            Productos objAdmin = new Productos(code, nomb, precio, foto);
            lstCata.add(objAdmin);
        }

        return lstCata;
    }
    public ArrayList<Productos> ConsultProductsPorNm(String nm) throws ClassNotFoundException, SQLException, IOException {
        ArrayList<Productos> lstCata = new ArrayList<>();

        ResultSet rs = Product.consultProductsPorNam(nm);

        while (rs.next()) {
            int id = rs.getInt("idProductos");
            String code = rs.getString("p_Codigo");
            String nomb = rs.getString("p_nombre");
            String descrip = rs.getString("p_descripcion");
            double precio = rs.getDouble("p_precio");
            String dispon= rs.getString("p_disponibilidad");
            int cantidad = rs.getInt("p_cantidad");
            
            InputStream  foto = rs.getBinaryStream("p_img");
            
            Productos objAdmin = new Productos(id,code,nomb,descrip,precio,dispon,cantidad, foto);
            lstCata.add(objAdmin);
        }  
    
        return lstCata;
    }
    
    public int insertProductsObjeto(Productos objAdmin) throws SQLException, ClassNotFoundException {
        String code = objAdmin.getP_Codigo();
        String nombre = objAdmin.getP_nombre();
        String descrip = objAdmin.getP_descripcion();
        double precio = objAdmin.getP_precio();
        String dispo = objAdmin.getP_disponibilidad();
        String url_img = objAdmin.getP_urlImagen();
        int cantidad = objAdmin.getCantidad();
        FileInputStream  foto = objAdmin.getP_image();
        
        int a;
        ResultSet rs = Product.consultExistencia(code);
        int Ide = 0;
        while (rs.next()) {
            Ide = rs.getInt("total");
        }
        //Validacion
        if (Ide > 0) {
            a = 100;
        } else {
            return Product.insertProduct(code,nombre,descrip,precio,dispo,cantidad,url_img,foto);
        }
        return a;
    }
    
    public int ModificarProducts(Productos objAdmin) throws SQLException, ClassNotFoundException {
        String code = objAdmin.getP_Codigo();
        String nombre = objAdmin.getP_nombre();
        String descrip = objAdmin.getP_descripcion();
        double precio = objAdmin.getP_precio();
        String dispo = objAdmin.getP_disponibilidad();
        String url_img = objAdmin.getP_urlImagen();
        int cantidad = objAdmin.getCantidad();
        FileInputStream  foto = objAdmin.getP_image();
        
        return Product.ModificarProducts(code, nombre, descrip, precio, dispo, cantidad, url_img, foto);
    }
     public int ActualizarProductos(Productos objAdmin) throws SQLException, ClassNotFoundException, IOException {
        String code = objAdmin.getP_Codigo();
        int cantidad = objAdmin.getCantidad();
        int Original = consultarProductUp(code);
        int Nuevo = Original - cantidad;
        System.out.println(code);
        System.out.println(cantidad);
        System.out.println(Original);
        System.out.println(Nuevo);
        return Product.ActualizarCantProducts(code, Nuevo);
    }
    
     public int consultarProductUp(String CO) throws SQLException {
        ResultSet rs = Product.consultProducts();
        int cant = 0;
        while (rs.next()) {
            cant = rs.getInt("p_cantidad");                     
        }
        return cant;
    }

     
    public int DeleteProducto(Productos objAdmin) throws SQLException {
        String codigo = objAdmin.getP_Codigo();
        
        return Product.deleteProduct(codigo);
        
    }
}
