/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Almacen.dao;

import Almacen.dto.Productos;
import java.util.List;

/**
 *
 * @author PC
 */
public interface IProductos {

    int create(Productos p);

    int update(Productos p);

    int delete(int id);

    Productos read(int id);

    List<Productos> readAll();
}
