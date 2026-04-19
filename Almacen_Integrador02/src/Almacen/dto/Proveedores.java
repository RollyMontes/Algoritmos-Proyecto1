/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Almacen.dto;

/**
 *
 * @author PC
 */
public class Proveedores {
    
    
    private int id_Proveedores;
    private int RUC;
    private String nombreE;
    private String productoE;
   

    public Proveedores() {
    }

    public Proveedores(int id_Proveedores, int RUC, String nombreE, String productoE) {
        this.id_Proveedores = id_Proveedores;
        this.RUC = RUC;
        this.nombreE = nombreE;
        this.productoE = productoE;
        
    }

    public int getId_Proveedores() {
        return id_Proveedores;
    }

    public void setId_Proveedores(int id_Proveedores) {
        this.id_Proveedores = id_Proveedores;
    }

    public int getRUC() {
        return RUC;
    }

    public void setRUC(int RUC) {
        this.RUC = RUC;
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getProductoE() {
        return productoE;
    }

    public void setProductoE(String productoE) {
        this.productoE = productoE;
    }

 
    
}
