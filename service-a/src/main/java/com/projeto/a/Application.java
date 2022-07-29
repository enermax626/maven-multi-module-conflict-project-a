package com.projeto.a;

public class Application {

    public static void main(String[] args) {

        ProjACoreClass projACoreClass = new ProjACoreClass();

        projACoreClass.processarReserva();

        ProjAServiceClass projAServiceClass = new ProjAServiceClass();

        projAServiceClass.calcularImposto();
    }

}
