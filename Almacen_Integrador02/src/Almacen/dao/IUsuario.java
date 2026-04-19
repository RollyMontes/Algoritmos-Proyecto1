/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Almacen.dao;

import Almacen.dto.Usuario;
import java.util.List;

/**
 *
 * @author PC
 */
public interface IUsuario {
    int create(Usuario u);

    int update(Usuario u);

    int delete(int id);

    Usuario read(int id);

    List<Usuario> readAll();
}
