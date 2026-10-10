/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author coffe
 */
public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    // Antes de crear una Fecha quien la cree debe comprobar si la fecha es valida con Fecha.esValida(dia, mes, anio).
    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    // Cantidad de días del mes, devuelve 0 si es invalido
    public static int diasDelMes(int mes, int anio) {
        switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return esBisiesto(anio) ? 29 : 28;
            default:
                return 0;
        }
    }
    
    // validacion de una fecha con meses de 1 al 12, an
    public static boolean esValida(int dia, int mes, int anio) {
        if (mes < 1 || mes > 12) {
            return false;
        }
        return dia >= 1 && dia <= diasDelMes(mes, anio);
    }
    
    // Bisiesto es divisible por 4, salvo los múltiplos de 100 que no lo sean de 400.
    public static boolean esBisiesto(int anio) {
        return (anio % 4 == 0 && anio % 100 != 0) || anio % 400 == 0;
    }

}
