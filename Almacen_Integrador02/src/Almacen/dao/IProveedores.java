/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Almacen.dao;

import Almacen.dto.Proveedores;
import java.util.List;

/**
 *
 * @author PC
 */
public interface IProveedores {

    int create(Proveedores s);

    int update(Proveedores s);

    int delete(int id);

    Proveedores read(int id);

    List<Proveedores> readAll();
}
