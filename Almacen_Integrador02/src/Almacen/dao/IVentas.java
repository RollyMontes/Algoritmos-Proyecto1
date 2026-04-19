/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Almacen.dao;

import Almacen.dto.Ventas;
import java.util.List;

/**
 *
 * @author PC
 */
public interface IVentas {
    int create(Ventas v);

    int update(Ventas v);

    int delete(int id);

    Ventas read(int id);

    List<Ventas> readAll();
}
