/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;

import modelo.Cuenta;
import modelo.CuentaAhorros;
import modelo.CuentaCorriente;
import modelo.Fecha;

/**
 *
 * @author coffe
 */
public class ControladorBanco {
    private ArrayList<Cuenta> cuentas;

    public ControladorBanco(){
        this.cuentas = new ArrayList<>();
    }

    // Buscar una cuenta por su número
    public Cuenta buscarCuenta(int numeroCuenta){
        for (Cuenta c : cuentas){
            if (c.getNumeroCuenta() == numeroCuenta){
                return c;
            }
        }
        return null;
    }

    // Crear cuenta de ahorros
    public boolean crearCuentaAhorros(int numero, String titular, int dia, int mes, int anio, double saldoInicial){
        if (buscarCuenta(numero) != null || !Fecha.esValida(dia, mes, anio) || titular.trim().isEmpty() || saldoInicial < 0){
            return false;
        }
        Fecha fecha = new Fecha(dia, mes, anio);
        cuentas.add(new CuentaAhorros(numero, titular.trim(), fecha, saldoInicial));
        return true;
    }

    // Crear cuenta corriente
    public boolean crearCuentaCorriente(int numero, String titular, int dia, int mes, int anio, double saldoInicial, double sobregiro) {
        if (buscarCuenta(numero) != null || !Fecha.esValida(dia, mes, anio) || titular.trim().isEmpty() || saldoInicial < 0 || sobregiro < 0) {
            return false;
        }
        Fecha fecha = new Fecha(dia, mes, anio);
        cuentas.add(new CuentaCorriente(numero, titular.trim(), fecha, saldoInicial, sobregiro));
        return true;
    }

    // Consignar
    public boolean consignar(int numeroCuenta, double valor){
        Cuenta c = buscarCuenta(numeroCuenta);
        if (c != null){
            return c.consignar(valor);
        }
        return false;
    }

    // Retirar (polmórfico)
    public boolean retirar(int numeroCuenta, double valor){
        Cuenta c = buscarCuenta(numeroCuenta);
        if (c != null){
            return c.retirar(valor);
        }
        return false;
    }
}
