
package com.mycompany.grafof;

import java.util.List;
import java.util.HashMap;
import java.util.Map;


class Grafo {

    static class Nodo {
       private String nombre;
       private Integer id;

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }
       
      
        
        
        Nodo(String nodo_nombre, Integer nodo_id) {
            nombre = nodo_nombre;
            id = nodo_id;    
        }
        void Imprimir() {
            System.out.print(" || " + nombre + " , " + id + " || ");
        }
    }

    
    Map<Nodo, List<Nodo>> adjlist = new HashMap<>();

    void nuevoNodo(Nodo idTransmilenio, List<Nodo> nodoAdya) {
        adjlist.put(idTransmilenio, nodoAdya);
    }

    void Iteraciones (Nodo i) {
        List<Nodo> nodoAdya = adjlist.get(i);
        i.Imprimir();
        System.out.print(" >> ");
        for (Nodo nodo : nodoAdya) {
            nodo.Imprimir();
        } System.out.print("\n ");
    }

}