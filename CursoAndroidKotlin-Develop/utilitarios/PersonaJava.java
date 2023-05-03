package com.example.codigospractica;

public class PersonaJava {

    int edadPersona = 0;
    String nombrePersona = "";
    String rutPersona="";

    public PersonaJava(int edadPersona, String nombrePersona, String rutPersona) {
        this.edadPersona = edadPersona;
        this.nombrePersona = nombrePersona;
        this.rutPersona = rutPersona;
    }

    public PersonaJava(){

    }

    public void laPersonaCome(){
      System.out.println("La persona esta comiendo");
    }


}
