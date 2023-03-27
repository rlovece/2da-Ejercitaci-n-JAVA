package com.ruth.clases;

public class CuentaBacaria {

    ///region Atributos
    private int id;
    private String DNI;
    private float saldo;
    private float inversion;

    ///endregion

    public CuentaBacaria(int id, String DNI, float saldo, float saldoDisponible) {
        this.id = id;
        this.DNI = DNI;
        this.saldo = saldo;
        this.inversion = inversion;
    }

    ///region Setter and Getter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getSaldoDisponible() {
        return inversion;
    }

    public void setSaldoDisponible(float inversion) {
        this.inversion = inversion;
    }
    ///endregion


    public void retiro (float dinero){
        this.saldo = saldo-dinero;
    }
    public void deposito (float dinero){
        this.saldo = saldo+dinero;
    }
    public void mostrarSaldo (){
        System.out.println("Saldo = " + this.saldo);
    }

    private float interesPlazoFijo (float dinero, float interes){
        return dinero*interes;
    }

    public void mostrarSaldoConPlazoFijo (float dinero, float interes){
        System.out.println("Su saldo final sera" + (interesPlazoFijo(dinero,interes)+dinero));
    }

}
