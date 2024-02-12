package com.desarrollo.paquete2;
//herencia

import com.desarrollo.paquete1.Clase1;

public class Clase3 extends Clase1 {

    public Clase3() {
        //super("Viviana"); //constructor clase padre - público
        super(30); //constructor clase padre - protegido

    }

    public void pruebaAtributos() {
        System.out.println("Atributo público: " + super.atributoPublic);
        System.out.println("Atributo protegido: " + super.atributoProtected);
    }
    
    public void pruebaMetodos(){
        super.metodoPublic();
        super.metodoProtected();
    }
    
    public static void main(String[] args) {
        Clase3 clase3=new Clase3();
        clase3.pruebaAtributos();
        clase3.pruebaMetodos();
    }
}
