/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author coffe
 */
public abstract class Cuenta {
    protected int numeroCuenta;
    protected String titular;
    protected Fecha fechaApertura;
    protected double saldo;

    // Constructor
    public Cuenta(int numeroCuenta, String titular, Fecha fechaApertura, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.fechaApertura = fechaApertura;
        this.saldo = saldo;
    }
    
    // Sobrecarga de constructor (por si se abre con saldo 0)
    public Cuenta(int numeroCuenta, String titular, Fecha fechaApertura){
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.fechaApertura = fechaApertura;
        this.saldo = 0;
    }

    // Método común: consignar dinero
    public boolean consignar(double valor){
        if (valor > 0){
            this.saldo += valor;
            return true;
        }
        return false;
    }

    // Método abstracto: cada subclase definira su propia regla para retirar
    public abstract boolean retirar(double valor);

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Fecha getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(Fecha fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Sobrecarga de métodos para consulta de datos
    public String consultarDatos(){
        return "No. Cuenta: " + numeroCuenta +
               "\nTitular: " + titular +
               "\nFecha Apertura: " + fechaApertura.toString() +
               "\nSaldo: $" + String.format("%.2f", saldo);
    }

    public String consultarDatos(boolean soloSaldo){
        if (soloSaldo) {
            return "Saldo actual: $" + String.format("%.2f",saldo);
        }
        return consultarDatos();
    }
    
    @Override 
    public String toString(){
        return consultarDatos();
    }
    
}
