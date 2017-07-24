package BL;


import Clases.ReservacionVO;
import DAT.ReservacionDAT;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author alexa
 */
public class LReservacion {
   
    ReservacionDAT ReserDAO = new ReservacionDAT();
    
      public int Insertar_Reservacion(int user) throws SQLException {
        int usuario = user;
           
        return ReserDAO.insertreservacion(usuario);      
    }
     
     public ArrayList<ReservacionVO> consultarId_AIngresar() throws ClassNotFoundException, SQLException {
        ArrayList<ReservacionVO> lstCata = new ArrayList<>();

        ResultSet rs = ReserDAO.consultexistencia();

        while (rs.next()) {
            int id = rs.getInt("id");
            
            ReservacionVO objAdmin = new ReservacionVO(id);
            lstCata.add(objAdmin);
        }

        return lstCata;
    }
}
