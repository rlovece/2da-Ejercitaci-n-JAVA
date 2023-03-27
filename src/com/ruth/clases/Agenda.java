package com.ruth.clases;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/// Agenda es la clase que gestiona los contactos
public class Agenda {
    ArrayList<Contacto> agenda = new ArrayList(); /// arreglo dinámico

    public void cargarAgenda(){

        Contacto newContacto = new Contacto();
        Scanner scan = new Scanner(System.in); /// abro scaner

        System.out.print("Ingrese Nombre: ");
        newContacto.setNombre(scan.next());

        System.out.print("Ingrese Apellido: ");
        newContacto.setApellido(scan.next());

        System.out.print("Ingrese Telefono: ");
        newContacto.setTelefono(scan.next());

        System.out.print("Ingrese Correo electrónico: ");
        newContacto.setCorreoElectronico(scan.next());

        /// scan.close(); lo comenté porq sino me tira error al cargar un 2do contacto!
        this.agenda.add(newContacto);
    }

    /// busca un contacto en la Agenda o lista de contactos. Sólo me dice si está o no.
    public boolean buscarContacto (String nombreYApellido){
        boolean encontrado = false;
        for (Contacto iteradorContacto: agenda) {
            if (nombreYApellido.equals(iteradorContacto.getNombre() + " " + iteradorContacto.getApellido())){
                return encontrado = true;
            }
        }
        return encontrado;
    }

    /// busqueda de un contacto que retorne ese contacto de la Angenda
    public Contacto buscarContactoYRetornarlo (String nombreYApellido){
        Contacto contactoVacio = new Contacto();
        for (int i = 0; i < agenda.size(); i++) {
            if (nombreYApellido.equals(agenda.get(i).getNombre() + " " + agenda.get(i).getApellido())){
                return agenda.get(i);
            }
        }
        return contactoVacio;
    }

    /// función para modificar un contacto ingresado por parametro
    public void modificarContacto (Contacto contactoErroneo) throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        int opcion = menuModificarContacto();
        switch (opcion) {
            case 1:
                System.out.print("Ingrese nombre correcto: ");
                contactoErroneo.setNombre(scan.next());
                break;
            case 2:
                System.out.print("Ingrese apellido correcto: ");
                contactoErroneo.setApellido(scan.next());
                break;
            case 3:
                System.out.print("Ingrese teléfono correcto: ");
                contactoErroneo.setTelefono(scan.next());
                break;
            case 4:
                System.out.print("Ingrese correo electrónico correcto: ");
                contactoErroneo.setCorreoElectronico(scan.next());
                break;
            default:
                System.out.print("Opcion incorrecta");
                break;
        }
        scan.close();
    }

    static int menuModificarContacto () throws InterruptedException {
        int opcion =0;
        Scanner scan = new Scanner(System.in);  // Le indicamos que va a recibir datos por consola;
        boolean entradaValida = false;

        do {
            try {
                System.out.println("Ingrese la opción que desea modificar:");
                System.out.println("1. Nombre");
                System.out.println("1. Apellido");
                System.out.println("3. Teléfono");
                System.out.println("4. Correo electrónico");
                opcion = scan.nextInt(); // Intentamos leer un entero
                entradaValida = true;
            } catch (NoSuchElementException e) {
                System.out.println("Entrada inválida. Por favor, ingrese un número entero.");
                scan.next(); // Descartamos la entrada no válida
            }
        } while (!entradaValida);

        scan.close();
        return opcion;
    }


    /// función para modificar un contacto buscado por Nombre y apellido
    public void modificarContactoDeAgenda () throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nombre y Apellido del contacto a modificar?: ");
        String contacto = scan.next();
        scan.close();

        Contacto aModificar = buscarContactoYRetornarlo(contacto);
        modificarContacto(aModificar);
    }

    @Override
    public String toString() {
        return "Agenda{" +
                "agenda =" + agenda +
                '}';
    }
}
