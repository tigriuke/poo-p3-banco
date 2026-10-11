package main;

import controlador.ControladorBanco;
import vista.VistaBanco;

public class Main {
    public static void main(String[] args) {
        ControladorBanco controlador = new ControladorBanco();
        VistaBanco vista = new VistaBanco(controlador);
        vista.setLocationRelativeTo(null); // Centra la ventana en pantalla
        vista.setVisible(true);
    }
}
