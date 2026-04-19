/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Almacen.DaoImpl;

import Almacen.Config.conexion;
import Almacen.dao.IUsuario;
import Almacen.dto.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author PC
 */
public class UsuarioDaoImpl implements IUsuario{
    
    private PreparedStatement ps;
    private ResultSet rs;
    private Connection conex;

    @Override
    public int create(Usuario u) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int update(Usuario u) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Usuario read(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Usuario> readAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    public Map<String, String> obtenerUsuario(String correo_usuario, String contraseña) {
    Map<String, String> usuario = new HashMap<>();
    try {
        conex =  conexion.getConexion();
        ps = conex.prepareStatement("SELECT cargo, nombre_usuario FROM usuario WHERE correo_usuario = ? AND contraseña = ?");
        ps.setString(1, correo_usuario);
        ps.setString(2, contraseña);
        rs = ps.executeQuery();
        if (rs.next()) {
            usuario.put("cargo", rs.getString("cargo"));
            usuario.put("nombre_usuario", rs.getString("nombre_usuario"));
        }
    } catch (Exception e) {
        System.out.println(e.toString());
    }
    return usuario;
} 
    
}
