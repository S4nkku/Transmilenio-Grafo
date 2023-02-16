
package com.mycompany.grafof;
import com.mycompany.grafof.Grafo.Nodo;
import java.util.Arrays;
import java.util.List;


public class GrafoF {

    public static void main(String[] args) {
        Nodo transm1 = new Nodo("Calle 76", 1);
        Nodo transm2 = new Nodo("Calle 72", 2);
        Nodo transm3 = new Nodo("Flores", 3);
        Nodo transm4 = new Nodo("Calle 63", 4);
        Nodo transm5 = new Nodo("Calle 57", 5);
        Nodo transm6 = new Nodo("Marly", 6);
        Nodo transm7 = new Nodo("Calle 45", 7);
        Nodo transm8 = new Nodo("Av. 39", 8);
        Nodo transm9 = new Nodo("Profamilia", 9);
        Nodo transm10 = new Nodo("Calle 26", 10);

        
        List<Nodo> transm1_ruta = Arrays.asList(transm2, transm3, transm4);
        List<Nodo> transm2_ruta = Arrays.asList(transm1, transm4, transm3);
        List<Nodo> transm3_ruta = Arrays.asList(transm1, transm4, transm5);
        List<Nodo> transm4_ruta = Arrays.asList(transm1, transm2, transm3);
        List<Nodo> transm5_ruta = Arrays.asList(transm3, transm4, transm6);
        List<Nodo> transm6_ruta = Arrays.asList(transm3, transm7, transm6);
        List<Nodo> transm7_ruta = Arrays.asList(transm6, transm8 , transm10);
        List<Nodo> transm8_ruta = Arrays.asList(transm3, transm9, transm3);
        List<Nodo> transm9_ruta = Arrays.asList(transm7, transm10);
        List<Nodo> transm10_ruta = Arrays.asList(transm8, transm5);
            

        System.out.println("Ruta de Transmilenio");

        Grafo grafo = new Grafo();
        grafo.nuevoNodo (transm1, transm1_ruta);
        grafo.nuevoNodo (transm2, transm2_ruta);
        grafo.nuevoNodo (transm3, transm3_ruta);
        grafo.nuevoNodo (transm4, transm4_ruta);
        grafo.nuevoNodo (transm5, transm5_ruta);
        grafo.nuevoNodo (transm6, transm6_ruta);
        grafo.nuevoNodo (transm7, transm7_ruta);
        grafo.nuevoNodo (transm8, transm8_ruta);
        grafo.nuevoNodo (transm9, transm9_ruta);
        grafo.nuevoNodo (transm10, transm10_ruta);

        grafo.Iteraciones(transm1);
        grafo.Iteraciones(transm2);
        grafo.Iteraciones(transm3);
        grafo.Iteraciones(transm4);
        grafo.Iteraciones(transm5);
        grafo.Iteraciones(transm6);
        grafo.Iteraciones(transm7);
        grafo.Iteraciones(transm8);
        grafo.Iteraciones(transm9);
        grafo.Iteraciones(transm10);
    }
    }

