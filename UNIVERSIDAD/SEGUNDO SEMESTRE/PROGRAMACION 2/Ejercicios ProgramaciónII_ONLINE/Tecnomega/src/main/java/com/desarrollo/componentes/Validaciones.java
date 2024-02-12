package com.desarrollo.componentes;

import java.awt.event.KeyEvent;

public class Validaciones {

    public static void validarNumeros(KeyEvent evt) {
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            //deshabilitar cuando el usuario ingrese una letra
            evt.consume();
        }
    }

    public static void validarLetras(KeyEvent evt) {
        char validar = evt.getKeyChar();
        if (validar >= 33 && validar <= 64
                || validar >= 91 && validar <= 96
                || validar >= 123 && validar <= 126) {
            evt.consume();
        }
    }

}
