package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Persona persona1 = new Persona(1101, 21);
        Persona persona2 = new Persona(1102, 22);

        if (persona1.compareTo(persona2) < 0) {
            System.out.println("La persona 1 es menor");
        } else if (persona1.compareTo(persona2) > 0) {
            System.out.println("La persona 1 es mayor");
        } else {
            System.out.println("La persona 1 es igual a la persona 2");
        }
    }
}
