package cc_diegobermejo;

import java.util.Scanner;

/**
 *
 * @author Diego Bermejo
 */
public class Bloques {

    static final String MATRICULA = "M-6048-VC";
    static final Scanner CONSOLA = new Scanner(System.in);

    // **********************************************************************************************
    public static void ejecutarBloque1() {
        // 1. UTILIZAR NOMBRES CON SIGNIFICADO
        //String a = "Ford", b = "Escort"; int c = 1997;
        String marca = "Ford", modelo = "Escort";
        int año = 1997, potencia = 90;

        // 2. UTILIZAR NOMBRES FACILES DE PRONUNCIAR
        //String cmstbl = "Diesel";
        String combustible = "Diesel";

        // 3. UTILIZAR NOMBRES QUE PUEDAN BUSCARSE
        System.out.println(marca + " " + modelo + " " + año + " " + combustible + " " + MATRICULA);

        // 4. NOMBRES DE CLASES Y METODOS
        mostrarPotencia(potencia);

        // 5. ELIGE UNA SOLA PALABRA POR CONCEPTO
    }

    private static void mostrarPotencia(int potencia) {
        System.out.println("Potencia: " + potencia);
    }

    // **********************************************************************************************
    public static void ejecutarBloque2() {
        // 6. LAS FUNCIONES TIENEN QUE SER PEQUEÑAS
        //pintarMenuIncorrecto();
        pintarMenuCorrecto();

        // 7. HAZ UNA UNICA COSA
        // 8. NO ABUSES DE LOS SWITCH/WHEN
        // 9. ¿CUANTOS ARGUMENTOS DEBE TENER UNA FUNCION?
        // 10. EVITA LOS FLAG ARGUMENTS
        // 11. NO GENERES EFECTOS COLATERALES
        // 12. NO TE REPITAS
    }

    private static void pintarMenuIncorrecto() {
        int opcionMenu = 0, opcionSubmenu = 0;
        do {
            System.out.println("Menu Principal"
                    + "\n1. Opcion 1"
                    + "\n2. Opcion 2"
                    + "\n3. Salir");
            opcionMenu = CONSOLA.nextInt();
            switch (opcionMenu) {
                case 1:
                    System.out.println("Has elegido la Opcion 1");
                    break;
                case 2:
                    do {
                        System.out.println("*** SUBMENU ***");
                        System.out.println("1. Decir 'Hola'");
                        System.out.println("2. Salir");
                        opcionSubmenu = CONSOLA.nextInt();
                        switch (opcionSubmenu) {
                            case 1:
                                System.out.println("Hola");
                                break;
                            case 2:
                                System.out.println("Volver Al menu Principal");
                                break;
                            default:
                                System.out.println("Elige una opcion correcta\n");
                        }
                    } while (opcionSubmenu != 2);
                    break;
                case 3:
                    System.out.println("Adios...");
                    break;
                default:
                    System.out.println("Elige una opcion correcta\n");
            }
        } while (opcionMenu != 3);
    }

    private static void pintarMenuCorrecto() {
        int opcionMenu = 0, opcionSubmenu = 0;
        do {
            pintarMenuPrincipal();
            opcionMenu = CONSOLA.nextInt();
            switch (opcionMenu) {
                case 1:
                    System.out.println("Has elegido la Opcion 1");
                    break;
                case 2:
                    do {
                        pintarSubMenu();
                        opcionSubmenu = CONSOLA.nextInt();
                        switch (opcionSubmenu) {
                            case 1:
                                System.out.println("Hola");
                                break;
                            case 2:
                                System.out.println("Volver Al menu Principal");
                                break;
                            default:
                                System.out.println("Elige una opcion correcta\n");
                        }
                    } while (opcionSubmenu != 2);
                    break;
                case 3:
                    System.out.println("Adios...");
                    break;
                default:
                    System.out.println("Elige una opcion correcta\n");
            }
        } while (opcionMenu != 3);
    }

    // Utilizado tambien para explicar el punto 7
    private static void pintarMenuPrincipal() {
        System.out.println("Menu Principal"
                + "\n1. Opcion 1"
                + "\n2. Opcion 2"
                + "\n3. Salir");
    }

    private static void pintarSubMenu() {
        System.out.println("*** SUBMENU ***");
        System.out.println("1. Decir 'Hola'");
        System.out.println("2. Salir");
    }

    // **********************************************************************************************
    public static void ejecutarBloque3() {
        // 13. LOS COMENTARIOS MIENTEN
        // Muestra los numeros del 0 al 10
//        for (int i = 10; i >= 0; i--) {
//            System.out.println(i);
//        }

        // 14. USA CODIGO AUTOEXPLICATIVO
        int prec = 4 * 80; // Mal codigo

        int numNeumaticos = 4;
        int precioNeumatico = 80;
        int precioTotalNeumaticos = numNeumaticos * precioNeumatico;

        // 15. A VECES LOS COMENTARIOS SON NECESARIOS
        
    }

    // 16. LOS COMENTARIOS DICEN LO QUE HACE EL CODIGO, NO COMO LO HACE
    public static int leerNumero() {
        /*
        El usuario debe escribir un numero
        Si no es un numero, devuelve una excepcion por teclado
         */
        boolean correcto = false;
        int opcion = 0;
        try {
            while (!correcto) {
                opcion = CONSOLA.nextInt();
                correcto = true;
            }
        } catch (Exception e) {
            System.out.println("Excepción de teclado");
            CONSOLA.nextLine();
        }
        return opcion;
    }
}
