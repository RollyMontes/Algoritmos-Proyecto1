/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Almacen.TEST;

import Almacen.Config.conexion;
import Almacen.DaoImpl.ProductoDaoImpl;
import Almacen.dao.IProductos;
import com.google.gson.Gson;

/**
 *
 * @author PC
 */
public class test {
static Gson gson = new Gson();
static IProductos ip = new ProductoDaoImpl();

  
    public static void main(String[] args) {
       listarP();
        
        if(conexion.getConexion()!=null){
            System.out.println("si");
        }else{
            System.out.println("NO");
        }    
    }static void listarP(){
        System.out.println(gson.toJson(ip.readAll()));
    }
    
    
}
