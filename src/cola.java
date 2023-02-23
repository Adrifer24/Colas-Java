// GitHub: Adrifer24
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class cola {
    static Queue<paciente> cola1= new LinkedList<>();
    static Queue<paciente> cola2 = new LinkedList<>();
    static Queue<paciente> cola3 = new LinkedList<>();
    static Queue<paciente> cola4 = new LinkedList<>();
    static Queue<paciente> cola5 = new LinkedList<>();
    static Queue<paciente> cola6 = new LinkedList<>();
    static Queue<paciente> cola7 = new LinkedList<>();
    static Queue<paciente> cola8 = new LinkedList<>();
    static Queue<paciente> cola9 = new LinkedList<>();
    static Queue<paciente> cola10 = new LinkedList<>();
    static Queue<paciente> cola11 = new LinkedList<>();

    public static void nuevoPaciente() {
        String nombre,gravedad;
        int edad,idEspeicalidad;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el nombre del paciente");
        nombre = teclado.nextLine();

        do {
            System.out.println("Introduzca la edad del paciente");
            edad = teclado.nextInt();
        }while (edad < 0);

        do {
            System.out.println("------");
            System.out.println("Introduzca la especialidad que necesita");
            System.out.println("1. Neumología");
            System.out.println("2. Cardiología");
            System.out.println("3. Toxicología");
            System.out.println("4. Pediatría");
            System.out.println("5. Psiquiatría");
            System.out.println("6. Radiología");
            System.out.println("7. Digestivo");
            System.out.println("8. Traumatología.");
            System.out.println("9. Otorrino-laringología");
            System.out.println("10. Cirugía");
            System.out.println("11. Oftalmología");

            idEspeicalidad = teclado.nextInt();
        }while (idEspeicalidad < 1 || idEspeicalidad > 11);

        teclado.nextLine();
        System.out.println("Gravedad del paciente: ");
        gravedad = teclado.nextLine();
        paciente p = new paciente(nombre, edad, idEspeicalidad, gravedad);

        if (idEspeicalidad == 1) cola1.offer(p);
        else if (idEspeicalidad == 2) cola2.offer(p);
        else if (idEspeicalidad == 3) cola3.offer(p);
        else if (idEspeicalidad == 4) cola4.offer(p);
        else if (idEspeicalidad == 5) cola5.offer(p);
        else if (idEspeicalidad == 6) cola6.offer(p);
        else if (idEspeicalidad == 7) cola7.offer(p);
        else if (idEspeicalidad == 8) cola8.offer(p);
        else if (idEspeicalidad == 9) cola9.offer(p);
        else if (idEspeicalidad == 10) cola10.offer(p);
        else if (idEspeicalidad == 11) cola11.offer(p);

    }

    public static void mostrarColas() {
        System.out.println("---------------");
        System.out.println("Cola 1: ");
        for (paciente p: cola1) {
            System.out.println(p.getNombre());
        }
        System.out.println("----------");
        System.out.println("Cola 2: ");
        for (paciente p: cola2) {
            System.out.println(p.getNombre());
        }
        System.out.println("----------");
        System.out.println("Cola 3: ");
        for (paciente p: cola3) {
            System.out.println(p.getNombre());
        }
        System.out.println("----------");
        System.out.println("Cola 4: ");
        for (paciente p: cola4) {
            System.out.println(p.getNombre());
        }
        System.out.println("----------");
        System.out.println("Cola 5: ");
        for (paciente p: cola5) {
            System.out.println(p.getNombre());
        }
        System.out.println("----------");
        System.out.println("Cola 6: ");
        for (paciente p: cola6) {
            System.out.println(p.getNombre());
        }
        System.out.println("----------");
        System.out.println("Cola 7: ");
        for (paciente p: cola7) {
            System.out.println(p.getNombre());
        }
        System.out.println("----------");
        System.out.println("Cola 8: ");
        for (paciente p: cola8) {
            System.out.println(p.getNombre());
        }
        System.out.println("----------");
        System.out.println("Cola 9: ");
        for (paciente p: cola9) {
            System.out.println(p.getNombre());
        }
        System.out.println("----------");
        System.out.println("Cola 10: ");
        for (paciente p: cola10) {
            System.out.println(p.getNombre());
        }
        System.out.println("----------");
        System.out.println("Cola 11: ");
        for (paciente p: cola11) {
            System.out.println(p.getNombre());
        }
        System.out.println("----------");
    }

    public static void sigPaciente() {
        if (!cola1.isEmpty()) {
            paciente pSig = cola1.poll();
            System.out.println("SIGUIENTE PACIENTE");
            System.out.println("COLA 1:");
            System.out.println("Nombre: "+pSig.getNombre());
            System.out.println("Edad: "+pSig.getEdad());
        }
        else if (!cola2.isEmpty()) {
            paciente pSig = cola2.poll();
            System.out.println("SIGUIENTE PACIENTE");
            System.out.println("COLA 2:");
            System.out.println("Nombre: "+pSig.getNombre());
            System.out.println("Edad: "+pSig.getEdad());
        }
    }

    public static boolean menu() {
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;

        System.out.println("LISTA DE ESPERA HOSPITAL POLITÉCNICO");
        System.out.println("1. Añadir un nuevo paciente");
        System.out.println("2. Elegir siguiente paciente");
        System.out.println("3. Mostrar contenido de las cola de espera");
        opcion = teclado.nextInt();

        if (opcion == 1) {
            nuevoPaciente();
            return true;
        }
        else if (opcion == 2) {
            sigPaciente();
            return true;
        }
        else if (opcion == 3) {
            mostrarColas();
            return true;
        }
        else if (opcion == 4) {
            return false;
        }
        else {
            System.out.println("Introduce una opción válida");
            return true;
        }
    }
    public static void main(String[] args) {
        boolean seguir = true;
        while (seguir) {
            if (!menu()) seguir = false;
        }
    }
}
