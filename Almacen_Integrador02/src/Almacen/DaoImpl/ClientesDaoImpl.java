/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Almacen.DaoImpl;

import Almacen.Config.conexion;
import Almacen.dao.IClientes;
import Almacen.dto.Clientes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC
 */
public class ClientesDaoImpl implements IClientes {

    private PreparedStatement ps;
    private ResultSet rs;
    private Connection conex;

    @Override
    public int create(Clientes c) {
         int x=0;
        String SQL ="INSERT INTO clientes(dni,nombre,apellido,telefono,correo) VALUES(?,?,?,?,?)";
        try {
            conex = conexion.getConexion();
            ps = conex.prepareStatement(SQL);
            ps.setInt(1, c.getDni());
            ps.setString(2, c.getNombre());
            ps.setString(3, c.getApellido());
            ps.setInt(4, c.getTelefono());
            ps.setString(5, c.getCorreo());
            x = ps.executeUpdate();
            
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
        return x;
    }

    @Override
    public int update(Clientes c) {
         int x=0;
        String SQL ="UPDATE clientes SET dni=?, nombre=?, apellido=?,telefono=?,correo=? WHERE id_cliente=?";
        try {
            conex = conexion.getConexion();
            ps = conex.prepareStatement(SQL);            
            ps.setInt(1, c.getDni());
            ps.setString(2, c.getNombre());
            ps.setString(3, c.getApellido());
            ps.setInt(4, c.getTelefono());
            ps.setString(5, c.getCorreo());
            ps.setInt(6, c.getIdcliente());

            x = ps.executeUpdate();            
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
        return x;    
    }

    @Override
    public int delete(int id) {
       int x=0;
        String SQL ="DELETE FROM clientes WHERE id_cliente=?";
        try {
            conex = conexion.getConexion();
            ps = conex.prepareStatement(SQL);            
            ps.setInt(1, id);
            x = ps.executeUpdate();            
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
        return x; 
    }

    @Override
    public Clientes read(int id) {
        Clientes I = new Clientes();
        String SQL = "SELECT * FROM clientes WHERE id_cliente=?";
        try {
            conex = conexion.getConexion();
            ps = conex.prepareStatement(SQL);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                I.setIdcliente(rs.getInt(1));
                I.setDni(rs.getInt(2));
                I.setNombre(rs.getString(3));
                I.setApellido(rs.getString(4));
                I.setTelefono(rs.getInt(5));
                I.setCorreo(rs.getString(6));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return I;
    }

    @Override
    public List<Clientes> readAll() {
        List<Clientes> lista = new ArrayList<>();
        String SQL = "SELECT * FROM clientes";
        try {
            conex = conexion.getConexion();
            ps = conex.prepareStatement(SQL);
            rs = ps.executeQuery();
            while (rs.next()) {
                Clientes I = new Clientes();
                I.setIdcliente(rs.getInt(1));
                I.setDni(rs.getInt(2));
                I.setNombre(rs.getString(3));
                I.setApellido(rs.getString(4));
                I.setTelefono(rs.getInt(5));
                I.setCorreo(rs.getString(6));
                lista.add(I);
            }
        } catch (Exception e) {
            System.out.println("Error:" + e);
        }
        return lista;
    }

    
    public Clientes buscarcli(int dni){
        Clientes ct = new Clientes();
        String SQL ="SELECT * FROM clientes WHERE dni = ?";
        try {
            conex = conexion.getConexion();  
            ps = conex.prepareStatement(SQL);
            ps.setInt(1, dni);
            rs = ps.executeQuery();
            if (rs.next()) {
                ct.setNombre(rs.getString("nombre"));
                ct.setApellido(rs.getString("apellido"));
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return ct;
    }
}
