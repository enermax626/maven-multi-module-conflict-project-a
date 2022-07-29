package com.projeto.a;

import com.baeldung.ProjBServiceClass;

public class ProjACoreClass {

    public void processarReserva(){

        ProjBServiceClass projBServiceClass = new ProjBServiceClass();

        projBServiceClass.calcularImposto();

        System.out.println("Core A versao 1.0-SNAPSHOT processando o pagamento");
    }


}
