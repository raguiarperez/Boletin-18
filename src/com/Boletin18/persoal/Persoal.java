package com.Boletin18.persoal;

/**
 *
 * @author raguiarperez
 */
public class Persoal {
    String Telefono;
    String Correo;

    public Persoal(String Telefono, String Correo) {
        this.Telefono = Telefono;
        this.Correo = Correo;
    }

    public String getTelefono() {
        return Telefono;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    
    @Override
    public String toString() {
        return "Persoal{" + "Telefono=" + Telefono + ", Correo=" + Correo + '}';
    }
    
}
