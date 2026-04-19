/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Almacen.dto;

/**
 *
 * @author PC
 */
public class Ventas {
    private int id_venta;       
    private String cliente;
    private String vendedor;
     private double total;

    public Ventas() {
    }

    public Ventas(int id_venta, String cliente, String vendedor, double total) {
        this.id_venta = id_venta;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.total = total;
    }

    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

  
     
     
     
}
