/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apariociomolina_20251117;

public class ArbolTernarioRecursivo {
    
    Nodo[] nodos;
    int raiz;
    
    public ArbolTernarioRecursivo(int tamano){
        
        nodos =  new Nodo[tamano];
        raiz = -1;
    }
    
    public void insertar(char valor){
        
        Nodo nuevo = new Nodo(valor);
        for(int i=0; i<nodos.length; i++){
            if(nodos[i] == null){
                nodos [i] = nuevo;
                if(raiz == -1){
                    raiz = i;
                }
                return;
            }
        }
        System.out.println("El esta lleno");
    }
    
    public void asignarHijos(int padre, int hijosizq, int hijoscen, int hijosder){
    
        nodos[padre].izquierda = hijosizq;
        nodos[padre].centro = hijoscen;
        nodos[padre].derecha = hijosder;
    }
    
    public void recorrerPreOrden(int indice){
    
        if(indice == -1 || nodos[indice] == null){
            return;
        }else{
            System.out.print(nodos[indice].valor+" ");
            recorrerPreOrden(nodos[indice].izquierda);
            recorrerPreOrden(nodos[indice].centro);
            recorrerPreOrden(nodos[indice].derecha);
        }
    }
    
    public void recorrerInOrden(int indice){
    
        if(indice == -1 || nodos[indice] == null){
            return;
        }else{
            recorrerInOrden(nodos[indice].izquierda);
            System.out.print(nodos[indice].valor+" ");
            recorrerInOrden(nodos[indice].centro);
            recorrerInOrden(nodos[indice].derecha);
        }
    }
    
    public void recorrerPostOrden(int indice){
    
        if(indice == -1 || nodos[indice] == null){
            return;
        }else{
            recorrerPostOrden(nodos[indice].izquierda);
            recorrerPostOrden(nodos[indice].centro);
            recorrerPostOrden(nodos[indice].derecha);
            System.out.print(nodos[indice].valor+" ");
        }
    }
}
