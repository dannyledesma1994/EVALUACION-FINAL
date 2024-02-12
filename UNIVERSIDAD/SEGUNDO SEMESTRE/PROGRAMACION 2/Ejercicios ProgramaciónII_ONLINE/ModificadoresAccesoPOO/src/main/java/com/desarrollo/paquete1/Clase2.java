package com.desarrollo.paquete1;

public class Clase2 {

    Clase1 clase1;

    public Clase2() {
        clase1 = new Clase1("Viviana"); //cosntructor público
        clase1 = new Clase1(30); //constructor protegido
        clase1 = new Clase1(1.59); //constructor default
    }

    public void pruebaAtributos() {
        System.out.println("Atributo público: " + clase1.atributoPublic);
        System.out.println("Atributo protegido: " + clase1.atributoProtected);
        System.out.println("Atributo default: "+clase1.atributoPackage);
    }
    
    public void pruebaMetodos(){
        clase1.metodoPublic();
        clase1.metodoProtected();
        clase1.metodoPackage();
    }
    
    //metodo main
    public static void main(String[] args) {
        Clase2 clase2=new Clase2();
        clase2.pruebaAtributos();
        clase2.pruebaMetodos();
    }

}
