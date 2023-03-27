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
            case 5:
                ejercicio5();
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
        System.out.println("4)    Clase Estudiante");
        System.out.println("5)    Clase Producto");
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

        miAgenda.cargarAgenda();
        miAgenda.cargarAgenda();

        System.out.println(miAgenda.toString());

        miAgenda.modificarContactoDeAgenda();

        System.out.println(miAgenda.toString());
    }
    ///endregion

    ///region Pruebas Clase Estudiante
    static void ejercicio4 () {

        GestorEstudiantes misEstudiantes = new GestorEstudiantes();

        misEstudiantes.cargarNuevoEstudiante();

        System.out.println(misEstudiantes.toString());
    }
    ///endregion

    ///region Pruebas Clase Estudiante
    static void ejercicio5 () {

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

