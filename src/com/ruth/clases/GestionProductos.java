package com.ruth.clases;

import java.util.Date;
import java.util.ArrayList;

public class GestionProductos {

    ArrayList<Producto> listaProductos = new ArrayList<>();


    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos() {
        this.listaProductos = listaProductos;
    }

    public void NuevaLista (){
        Producto p1 = new Producto(001, "Atun", 5, 350,
                new Date(2023,12,31));
        this.listaProductos.add(p1);
        Producto p2 = new Producto(002, "Tomate", 10, 150,
                new Date(2023,3,26));
        this.listaProductos.add(p2);
        Producto p3 = new Producto(003, "Arvejas", 2, 150,
                new Date(2023,6,15));
        this.listaProductos.add(p3);
        Producto p4 = new Producto(003, "Arroz", 2, 150,
                new Date(2023,3,25));
        this.listaProductos.add(p4);
    }

    @Override
    public String toString() {
        for (Producto producto: this.listaProductos
             ) {
            System.out.println(producto.toString());

        }
        return null;
    }

    public void comprar (int codigoProducto){
        int nuevoStock = this.listaProductos.get(codigoProducto - 1).getStock() + 1;
        this.listaProductos.get(codigoProducto - 1).setStock(nuevoStock);
    }
    public void vender (int codigoProducto){
        int nuevoStock = this.listaProductos.get(codigoProducto - 1).getStock() -1 ;
        this.listaProductos.get(codigoProducto - 1).setStock(nuevoStock);
    }

    public void mostrarVencidos (Date hoy){
        for (Producto producto: this.listaProductos
        ) {
            if (hoy.after(producto.getFechaVecimiento())){
                System.out.println(producto.toString());
            }
        }
    }
}
