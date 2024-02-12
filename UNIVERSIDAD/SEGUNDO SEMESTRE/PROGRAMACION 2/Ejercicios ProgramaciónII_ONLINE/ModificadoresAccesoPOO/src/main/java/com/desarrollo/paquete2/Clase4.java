package com.desarrollo.paquete2;

import com.desarrollo.paquete1.Clase1;

public class Clase4 {

    Clase1 clase1;

    public Clase4() {
        clase1 = new Clase1("Viviana"); //constructor público
    }

    public void pruebaAtributos() {
        System.out.println("Atributo público: " + clase1.atributoPublic);
    }
    
    public void pruebaMetodos(){
        clase1.metodoPublic();
    }
    
    public static void main(String[] args) {
        Clase4 clase4=new Clase4();
        clase4.pruebaAtributos();
        clase4.pruebaMetodos();
    }
}
