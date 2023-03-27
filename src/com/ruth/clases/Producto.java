package com.ruth.clases;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Producto {

    private int codigo;
    private String descripción;
    private int stock;
    private int precio;
    private Date fechaVecimiento;

    ///region Constructor
    public Producto(int codigo, String descripción, int stock, int precio, Date fechaVecimiento) {
        this.codigo = codigo;
        this.descripción = descripción;
        this.stock = stock;
        this.precio = precio;
        this.fechaVecimiento = fechaVecimiento;
    }
    ///endregion

    ///region Getter and Setter

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Date getFechaVecimiento() {
        return fechaVecimiento;
    }

    public void setFechaVecimiento(Date fechaVecimiento) {
        this.fechaVecimiento = fechaVecimiento;
    }

    ///endregion
    @Override
    public String toString() {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yy");
        return "Producto{" +
                "codigo=" + codigo +
                ", descripción='" + descripción + '\'' +
                ", stock=" + stock +
                ", precio=" + precio +
                ", fechaVecimiento=" + formato.format(fechaVecimiento) +
                '}';
    }
}
