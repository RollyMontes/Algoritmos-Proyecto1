/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Almacen.DaoImpl;

import Almacen.dao.IProductos;
import Almacen.dto.Productos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import Almacen.Config.conexion;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class ProductoDaoImpl implements IProductos {

    private PreparedStatement ps;
    private ResultSet rs;
    private Connection conex;

    @Override
    public int create(Productos p) {
        int x = 0;
        String SQL = "INSERT INTO productos(codigo,nombre,cantidad,precio,categoria) VALUES(?,?,?,?,?)";
        try {
            conex = conexion.getConexion();
            ps = conex.prepareStatement(SQL);
            ps.setInt(1, p.getCodigo());
            ps.setString(2, p.getNombre());
            ps.setInt(3, p.getCantidad());
            ps.setDouble(4, p.getPrecio());

            ps.setString(5, p.getCategoria());
            x = ps.executeUpdate();

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return x;
    }

    @Override
    public int update(Productos p) {
        int x = 0;
        String SQL = "UPDATE productos SET codigo=?, nombre=?, cantidad=?, precio=?, categoria=? WHERE id_Productos=?";
        try {
            conex = conexion.getConexion();
            ps = conex.prepareStatement(SQL);
            ps.setInt(1, p.getCodigo());
            ps.setString(2, p.getNombre());
            ps.setInt(3, p.getCantidad());
            ps.setDouble(4, p.getPrecio());
            ps.setString(5, p.getCategoria());
            ps.setInt(6, p.getId_Productos());
            x = ps.executeUpdate();

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return x;

    }

    @Override
    public int delete(int id) {
        int x = 0;
        String SQL = "DELETE FROM productos WHERE id_Productos=?";
        try {
            conex = conexion.getConexion();
            ps = conex.prepareStatement(SQL);
            ps.setInt(1, id);
            x = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return x;
    }

    @Override
    public Productos read(int id) {
        Productos p = new Productos();
        String SQL = "SELECT * FROM productos WHERE id_Productos=?";
        try {
            conex = conexion.getConexion();
            ps = conex.prepareStatement(SQL);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                p.setId_Productos(rs.getInt(1));
                p.setCodigo(rs.getInt(2));
                p.setNombre(rs.getString(3));
                p.setCantidad(rs.getInt(4));
                p.setPrecio(rs.getDouble(5));
                p.setCategoria(rs.getString(6));

            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return p;

    }

    @Override
    public List<Productos> readAll() {
        List<Productos> lista = new ArrayList<>();
        String SQL = "SELECT * FROM productos";
        try {
            conex = conexion.getConexion();
            ps = conex.prepareStatement(SQL);
            rs = ps.executeQuery();
            while (rs.next()) {
                Productos p = new Productos();
                p.setId_Productos(rs.getInt(1));
                p.setCodigo(rs.getInt(2));
                p.setNombre(rs.getString(3));
                p.setCantidad(rs.getInt(4));
                p.setPrecio(rs.getDouble(5));
                p.setCategoria(rs.getString(6));
                lista.add(p);
            }
        } catch (Exception e) {
            System.out.println("Error:" + e);
        }
        return lista;
    }

    
     public Productos buscarpro(String codigo){
       Productos pt = new Productos();
       String SQL ="SELECT * FROM productos WHERE codigo=?";
       try {
           conex =conexion.getConexion();
           ps =conex.prepareStatement(SQL);
           ps.setString(1, codigo);
           rs=ps.executeQuery();
           if(rs.next()){
               pt.setNombre(rs.getString("nombre"));
               pt.setPrecio(rs.getDouble("precio"));
               pt.setCantidad(rs.getInt("cantidad"));
           }
       } catch (SQLException e) {
           System.out.println(e.toString());
       }       
      return pt;
   }
}
