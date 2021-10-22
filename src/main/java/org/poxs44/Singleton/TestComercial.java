package org.poxs44.Singleton;

public class TestComercial {
    public static void main(String[] args)
    {
// inicialización del comercial en el sistema
        Comercial poxscomerci= Comercial.Instance();
        poxscomerci.setNombre("Comercial BOMMOSTER");
        poxscomerci.setDireccion("SIUNA");
        poxscomerci.setEmail("vzeledon7@gmail.com");
// muestra el comercial del sistema
        visualiza();
    }

    public static void visualiza()
    {
        Comercial poxscomerci = Comercial.Instance();
        poxscomerci.visualiza();
    }
}
