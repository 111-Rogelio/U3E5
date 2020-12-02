import java.util.Scanner;

Colas de clase pública {
    public static void main (String [] args) {
    Cola cola = nueva Cola ();
      int elemento;
     int opc2 = 0;
     int opc;
     Escáner LECTOR = nuevo escáner (System.in);
       hacer{ 
        System.out.println ("\ n ------- Menú ------");
        System.out.println ("1. Insertar 10 datos");
        System.out.println ("2. Eliminar");
        System.out.println ("3. Mostrar");
        System.out.println ("5. Salir del programa");
        System.out.println ("¿Que desea realizar?");
        opc = LECTOR.nextInt ();
        cambiar (opc) {
            caso 1:
            Scanner Lector2 = nuevo escáner (System.in);
            int cont = 10;
            while (cont> 0) {
            System.out.println ("inserte un elemento");
            elemento = Lector2.nextInt ();
            cola.empuja (elemento); 
            cont--;
            
            }
           
    
            romper;
            caso 2: cola.eliminar (); romper;
            caso 3: cola.mostrar (); romper;
            caso 4: System.exit (0); break;
            predeterminado: System.out.println ("No existe esa opcion, por favor intente de nuevo");
        }
        
          System.out.println ("\ n¿Desea realizar otro proceso? Presione 2 = NO");
       opc2 = LECTOR.nextInt ();
       } while (opc2! = 2);


    }
    
}
