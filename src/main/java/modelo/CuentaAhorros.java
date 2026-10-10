/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author coffe
 */
public class CuentaAhorros extends Cuenta{
    public CuentaAhorros(int numeroCuenta, String titular, Fecha fechaApertura, double saldoInicial){
        super(numeroCuenta, titular, fechaApertura, saldoInicial);
    }

    public CuentaAhorros(int numeroCuenta, String titular, Fecha fechaApertura){
        super(numeroCuenta, titular, fechaApertura);
    }

    @Override 
    public boolean retirar(double valor){
        if (valor > 0 && valor <= saldo){
            saldo -= valor;
            return true;
        }
        return false;
    }

}
