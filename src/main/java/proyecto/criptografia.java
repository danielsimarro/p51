/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author NitroPc
 */
public class criptografia {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        boolean repetir = true;
        int eleccion;

        do {
            System.out.println("¿Que deseas realizar?");
            System.out.println("1.- Cifrar");
            System.out.println("2.- Descifrar");
            System.out.println("3.- Salir");

            eleccion = teclado.nextInt();

            switch (eleccion) {
                case 1:

                    System.out.println("Tu selección: " + eleccion);

                    String palabraCifrar = "";

                    System.out.println("Introduce la palabra a cifrar: ");
                    palabraCifrar = teclado.next();

                    palabraCifrar = palabraCifrar.toUpperCase();

                    char cadenaCifrar[];

                    cadenaCifrar = palabraCifrar.toCharArray();

                    System.out.print("Imagen espectacular:");

                    for (int i = cadenaCifrar.length - 1; i >= 0; i--) {
                        System.out.print(cadenaCifrar[i]);
                    }

                    System.out.println("");

                    System.out.print("Sustitución de vocales: ");

                    for (int i = cadenaCifrar.length - 1; i >= 0; i--) {
                        switch (cadenaCifrar[i]) {
                            case 65:
                                cadenaCifrar[i] = 53;
                                break;
                            case 69:
                                cadenaCifrar[i] = 52;
                                break;
                            case 73:
                                cadenaCifrar[i] = 51;
                                break;
                            case 79:
                                cadenaCifrar[i] = 50;
                                break;
                            case 85:
                                cadenaCifrar[i] = 49;
                                break;
                        }
                        System.out.print(cadenaCifrar[i]);
                    }

                    System.out.println("");

                    System.out.print("Cadena cifrada: ");

                    char letraMayus = (char) (random.nextInt(26) + 'A');
                    char letraMayus2 = (char) (random.nextInt(26) + 'A');

                    switch (letraMayus) {
                        case 65:
                            letraMayus = 53;
                            break;
                        case 69:
                            letraMayus = 52;
                            break;
                        case 73:
                            letraMayus = 51;
                            break;
                        case 79:
                            letraMayus = 50;
                            break;
                        case 85:
                            letraMayus = 49;
                            break;
                    }

                    System.out.print(letraMayus);

                    for (int i = 0; i < cadenaCifrar.length; i++) {
                        System.out.print(cadenaCifrar[i]);
                    }

                    switch (letraMayus2) {
                        case 65:
                            letraMayus2 = 53;
                            break;
                        case 69:
                            letraMayus2 = 52;
                            break;
                        case 73:
                            letraMayus2 = 51;
                            break;
                        case 79:
                            letraMayus2 = 50;
                            break;
                        case 85:
                            letraMayus2 = 49;
                            break;
                    }

                    System.out.print(letraMayus2);
                    System.out.println("");
                    break;

                case 2:
                    System.out.println("Tu selección: " + eleccion);

                    String palabraDescifrar = "";

                    System.out.println("Introduce la palabra a cifrar: ");
                    palabraDescifrar = teclado.next();

                    palabraDescifrar = palabraDescifrar.toUpperCase();

                    char cadenaDescifrar[];

                    cadenaDescifrar = palabraDescifrar.toCharArray();

                    System.out.print("Cadena cifrada: ");

                    for (int i = 1; i < cadenaDescifrar.length - 1; i++) {
                        System.out.print(cadenaDescifrar[i]);
                    }

                    System.out.println("");
                    System.out.print("Sustitución de vocales: ");

                    for (int i = 1; i < cadenaDescifrar.length - 1; i++) {

                        switch (cadenaDescifrar[i]) {
                            case 53:
                                cadenaDescifrar[i] = 65;
                                break;
                            case 52:
                                cadenaDescifrar[i] = 69;
                                break;
                            case 51:
                                cadenaDescifrar[i] = 73;
                                break;
                            case 50:
                                cadenaDescifrar[i] = 79;
                                break;
                            case 49:
                                cadenaDescifrar[i] = 85;
                                break;
                        }
                        System.out.print(cadenaDescifrar[i]);
                    }

                    System.out.println("");
                    System.out.print("Cadena descifrada: ");

                    for (int i = cadenaDescifrar.length - 2; i >= 0 + 1; i--) {
                        System.out.print(cadenaDescifrar[i]);
                    }

                    System.out.println("");

                    break;

                case 3:
                    String salir;
                    System.out.println("¿Quieres salir?");

                    salir = teclado.next();

                    if (salir.equalsIgnoreCase("Si")) {
                        System.out.println("...Saliendo");
                        repetir = false;

                    }

                    break;
            }

        } while (repetir);
    }
}
