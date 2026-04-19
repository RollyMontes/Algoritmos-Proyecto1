/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Almacen.dao;

import Almacen.dto.Clientes;
import java.util.List;

/**
 *
 * @author PC
 */
public interface IClientes {
    int create(Clientes c);

    int update(Clientes c);

    int delete(int id);

    Clientes read(int id);

    List<Clientes> readAll();
}
