package com.desarrollo.paquete1;

public class Clase1 {

    //atributos - modificadores de acceso
    public String atributoPublic = "valor público";
    protected String atributoProtected = "valor protegido";
    String atributoPackage = "valor default";
    private String atributoPrivate = "valor privado";

    //constructores - modificadores de acceso
    public Clase1(String texto) {
        System.out.println("Constructor público " + texto);
    }

    protected Clase1(int entero) {
        System.out.println("Constructor protegido " + entero);
    }

    Clase1(double decimal) {
        System.out.println("Constructor default " + decimal);
    }

    private Clase1(boolean booleano) {
        System.out.println("Constructor privado " + booleano);
    }

    //métodos - modificadores de acceso
    public void metodoPublic() {
        System.out.println("Método público");
    }

    protected void metodoProtected() {
        System.out.println("Método protegido");
    }

    void metodoPackage() {
        System.out.println("Método default");
    }

    private void metodoPrivate() {
        System.out.println("Método protegido");
    }
}
