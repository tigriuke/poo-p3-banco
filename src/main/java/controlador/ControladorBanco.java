/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;

import modelo.Cuenta;

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

    
}
