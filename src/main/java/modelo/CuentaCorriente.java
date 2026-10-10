/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author coffe
 */
public class CuentaCorriente extends Cuenta{
    private double cupoSobregiro;

    public CuentaCorriente(int numeroCuenta, String titular, Fecha fechaApertura, double saldoIncial, double cupoSobregiro){
        super(numeroCuenta, titular, fechaApertura, saldoIncial);
        if (cupoSobregiro > 0){
            this.cupoSobregiro = cupoSobregiro;
        }else{
            this.cupoSobregiro = 0.0;
        }
    }

    public double getCupoSobregiro() {
        return cupoSobregiro;
    }

    public void setCupoSobregiro(double cupoSobregiro) {
        this.cupoSobregiro = cupoSobregiro;
    }


}
