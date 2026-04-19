/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Almacen.DaoImpl;

import Almacen.Config.conexion;
import Almacen.dao.IVentas;
import Almacen.dto.Ventas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

/**
 *
 * @author PC
 */
public class VentasDaoImpl implements IVentas{

    private PreparedStatement ps;
    private ResultSet rs;
    private Connection conex;
    
    @Override
    public int create(Ventas v) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int update(Ventas v) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Ventas read(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Ventas> readAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    public int idventa(){
        int id =0;
        String SQL="SELECT MAX(id_venta) FROM ventas" ;
        try {
            conex = conexion.getConexion();
            ps=conex.prepareStatement(SQL);
            rs=ps.executeQuery();
            if (rs.next()) {
                id = rs.getInt(1);
           }
        } catch (Exception e) {
            System.out.println("Error:"+e);
        }
        return id;
    }
    
    public boolean ActualizarStock(int cant, String cod){
        String SQL ="UPDATE productos SET cantidad=? WHERE codigo=?";
        try {
            conex = conexion.getConexion();
            ps=conex.prepareStatement(SQL);
            ps.setInt(1, cant);
            ps.setString(2, cod);
            ps.execute();
             return true;
        } catch (Exception e) {
            System.out.println("Error:"+e);
            return false;
        }        
    }   
    
}
