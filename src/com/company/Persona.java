package com.company;

/**
 * Created by carlosjoseanguiano on 29/03/17.
 */
public class Persona implements Comparable<Persona> {
    public int dni;
    public int edad;

    public Persona(int my_dni, int my_edad) {
        this.dni = my_dni;
        this.edad = my_edad;
    }

    @Override
    public int compareTo(Persona o) {
        int resultado = 0;

        if (this.edad < o.edad) {
            resultado = -1;
        } else if (this.edad > o.edad) {
            resultado = 1;
        } else {
            if (this.dni < o.dni) {
                resultado = -1;
            } else if (this.dni > o.dni) {
                resultado = 1;
            } else {
                resultado = 0;
            }
        }
        return resultado;

    }
}
