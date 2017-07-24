package Clases;

/**
 *
 * @author alexa
 */
public class Rol {
    private String nombre;
    private String descripcion;
    private int ide;
    public Rol(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    public Rol(String nombre) {
        this.nombre = nombre;
        
    }
    public Rol(int ide,String nombre, String descripcion) {
        this.ide = ide;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public Rol(int id) {
        this.ide = id;
    }

    public int getIde() {
        return ide;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
