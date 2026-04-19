/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Almacen.dto;

/**
 *
 * @author PC
 */
public class Usuario {

    private int id_Usuario;    
    private String nombre_usuario;
    private int DNI;
    private String contraseña;
    private String correo_usuario;
    private String cargo;

    public Usuario() {
    }

    public Usuario(int id_Usuario, String nombre_usuario, int DNI, String contraseña, String correo_usuario, String cargo) {
        this.id_Usuario = id_Usuario;
        this.nombre_usuario = nombre_usuario;
        this.DNI = DNI;
        this.contraseña = contraseña;
        this.correo_usuario = correo_usuario;
        this.cargo = cargo;
    }

    public int getId_Usuario() {
        return id_Usuario;
    }

    public void setId_Usuario(int id_Usuario) {
        this.id_Usuario = id_Usuario;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getCorreo_usuario() {
        return correo_usuario;
    }

    public void setCorreo_usuario(String correo_usuario) {
        this.correo_usuario = correo_usuario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    

   
   

    
    
  
}
