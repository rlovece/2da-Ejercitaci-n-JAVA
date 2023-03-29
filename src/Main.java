import com.ruth.clases.*;

import java.util.Date;
import java.util.Scanner;
import java.time.Duration;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        int opcion = menu();
        switch (opcion){
            case 1:
                break;
            case 2:
                ejercicio2();
                break;
            case 3:
                ejercicio3();
                break;
            case 4:
                ejercicio4();
                break;

        }
    }

    ///region Menu
    public static int menu(){
        int nro;
        Scanner scan = new Scanner(System.in);  // Le indicamos que va a recibir datos por consola;

        System.out.println("Estas 👇 la opciones para probar las clases creadas y sus métodos!");
        System.out.println("1)    Clase Cuenta Bancaria");
        System.out.println("2)    Clase Vuelo");
        System.out.println("3)    Clase Agenda");
        System.out.println("4)    Clase Producto");
        System.out.println("Ingrese el número que desee ejecutar: ");

        nro = scan.nextInt();
        return nro;
    }
    ///endregion

    ///region Pruebas Clase Vuelo
    static void ejercicio2 () {
        Vuelo v1 = new Vuelo(01, "Mar del Plata", "Buenos Aires",
                LocalTime.of(9,30), LocalTime.of(10,30) );
        System.out.println(v1.toString());
        Duration tiempoVuelo = v1.tiempoDeVuelo (v1.getHorarioSaldia(), v1.getHorarioLlegada());
        System.out.println("EL vuelo tardará : "+ tiempoVuelo.toMinutes() +"min");
    }
    ///endregion

    ///region Pruebas Clase Agenda
    static void ejercicio3 () throws InterruptedException {

        Agenda miAgenda = new Agenda();

        Contacto c1 = new Contacto(001,"Ruth", "Lovece", "2291457449", "ruti@gmail.com" );
        Contacto c2 = new Contacto(002,"Belen", "Lovece", "5514287", "bel@gmail.com" );
        Contacto c3 = new Contacto(002,"Nahuel", "Perez", "2942153", "nahuel@gmail.com" );
        Contacto c4 = new Contacto(002,"Bruno", "Martin", "9542887", "bru@gmail.com" );

        miAgenda.agregarContacto2(c1);
        miAgenda.agregarContacto2(c2);
        miAgenda.agregarContacto2(c3);
        miAgenda.agregarContacto2(c4);

        System.out.println("La agenda actual!! ");
        System.out.println(miAgenda.toString());

        miAgenda.eliminarContacto("Nahuel");
        System.out.println("La agenda habiendo elimando a Nahuel");
        System.out.println(miAgenda.toString());

        miAgenda.modificarContactoDeAgenda();
        System.out.println("La agenda habiendo modificado un Contacto");
        System.out.println(miAgenda.toString());
    }
    ///endregion

       ///region Pruebas Clase Producto
    static void ejercicio4 () {

        GestionProductos misProductos = new GestionProductos();

        misProductos.NuevaLista();

        System.out.println("Mis productos antes de comprar/Vender");
        misProductos.toString();

        misProductos.comprar(002);
        misProductos.vender(003);

        System.out.println("Mis productos Después de comprar/Vender");
        misProductos.toString();

        System.out.println("Productos vencidos al 27/03/2023");
        misProductos.mostrarVencidos(new Date(2023, 03, 27));

    }
    ///endregion

}

