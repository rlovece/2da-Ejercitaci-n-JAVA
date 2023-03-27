package com.ruth.clases;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class GestorEstudiantes {

    ArrayList<Estudiante> Escuela = new ArrayList(); /// arreglo dinámico

    public void cargarNuevoEstudiante (){

        Estudiante nuevoEstudiante = new Estudiante();
        Scanner scan = new Scanner(System.in);

        Random random = new Random();
        nuevoEstudiante.getLegajo(random.nextInt(100));

        System.out.print("Ingrese Nombre: ");
        nuevoEstudiante.setNombre(scan.next());


        System.out.print("Ingrese Materias aprobadas: ");
        nuevoEstudiante.setMateriasAprobadas(cargaIncialMaterias());

        scan.close();
        Escuela.add(nuevoEstudiante);
    }

    static Materia[] cargaIncialMaterias (){
        char control ='n';
        Materia[] materiasAp = new Materia[20];
        Scanner scan = new Scanner(System.in);

        int i =0;
        do {

            System.out.println("Ingrese los datos de la " + i + "° materia aprobada");
            materiasAp[i].cargarMateria();
            System.out.println("Desea agregar otra materia? s/n");
            control = scan.next().charAt(0);
        } while (control == 'n');

        scan.close();
        return materiasAp;
    }

    @Override
    public String toString() {
        return "GestorEstudiantes{" +
                "Escuela=" + Escuela +
                '}';
    }
}
