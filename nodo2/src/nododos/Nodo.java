/*
Monica Jaqueline Vela Galvan 
 */
package nododos;
import java.util.Scanner;
public class Nodo {


    Scanner sc = new Scanner(System.in);
    String dato;
    Nodo sig;
    Nodo inicio = null;
    Nodo fin = null;


    public void agregar() {
        Nodo temp = new Nodo();
        System.out.println("agregar el dato ");
        temp.dato = sc.nextLine();
        if (fin == null) {
        fin = temp;
        fin.sig = null;
        inicio = temp;
        }else{
        inicio.sig = temp;
        temp.sig = null;
        inicio = temp;
        System.out.println("Dato agregado "+ inicio.dato);
        }
        }

    public void mostrar() {
        Nodo actual = new Nodo();
        actual = fin;
        if (fin != null) {
        while (actual != null) {
        System.out.print(" DATO " + "[" + actual.dato + "]");
        actual = actual.sig;
        }
        } else {
        System.out.println("\n La lista se encuentra vacia\n");
        }
        }

    public void eliminarP() {
        Nodo actual = fin;
        while(actual.sig != inicio){
        actual = actual.sig;
        }
        System.out.println("Dato eliminado: "+ inicio.dato);1
                1111223
        actual.sig = null;
        inicio = actual;
        }


    public void eliminarU(){
        System.out.println("El dato se elimino correctamente: "+fin.dato);
        fin = fin.sig;
        }
        }

