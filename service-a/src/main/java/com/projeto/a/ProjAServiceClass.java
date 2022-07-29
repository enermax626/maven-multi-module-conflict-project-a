package com.projeto.a;

import com.baeldung.ProjBServiceClass;

public class ProjAServiceClass {

    public void calcularImposto(){

        ProjBServiceClass projBServiceClass = new ProjBServiceClass();
        projBServiceClass.calcularImposto();

        System.out.println("Service A versao 1.0-SNAPSHOT calculando imposto");
    }


}
