package com.example;


import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


        /**************************************/
        /* Nom: Pau Garcia Parets */
        /* DNI/NIE: 45371971D */
        /* Data: 14/10/2024 */
        /* Exercici: PROU2EX02 */
        /**************************************/


        Scanner sc = new Scanner(System.in);


        // Declaro las variables que voy a utilizar
        double[] cambio = { 0.85, 20, 1.18, 23.50, 0.05, 0.042, 152.28, 0.0066, 0.13, 7.62, 164.51, 0.0061 };// declaro el array con 11 posiciones de
                                                                               // los cambios de cada moneda
        int opcion = 0;
        float dinero = 0; // declaro la variable float para que pueda introducir el dinero decimal
        boolean veces = true; // declaro las dos boleanas para el while y si son true siempre entraran al
                              // bucle
        boolean dineroPositivo = true; // declaro las dos boleanas para el while y si son true siempre entraran al
                                       // bucle


        while (veces) {// creo un bucle para que lo haga todas las veces hasta que ponga la opcion 9 de
                       // salir
            // muestro todas las opciones
            System.out.println("Elige el cambio que quieras:\n" +
                    "1-Dolares a Euros\n" +
                    "2-Dolares a Pesos Mexicans\n" +
                    "3-Euros a Dolares\n" +
                    "4-Euros a Pesos Mexicans\n" +
                    "5-Pesos Mexicanos a Dolares\n" +
                    "6-Pesos Mexicanos a Euros\n" +
                    "7-Dolares a Yenes\n" +
                    "8-Yenes a Dolares\n" +
                    "9-Yenes a Pesos Mexicanos\n" +
                    "10-Pesos Mexicanos a Yenes\n" +
                    "11-Euros a Yenes\n" +
                    "12-Yenes a Euros\n" +
                    "13-Salir\n");
            // pide al usuario la opcion
            opcion = sc.nextInt();
            // creo un if en el cual si el usuario introduce un numero menor a 1 o mayor a 9
            // le saldra que introduzca una de las opciones correctas, sino se ejecutara el
            // codigo


            // creo un switch con varias opciones para que sea mas dinamico que muchos ifs
            switch (opcion) {
                // le dice al usuario que ha elegido esa opcion
                case 1:
                    System.out.println("Has elegido de dolares a euros");
                    // creo un bucle en el cual dineroPositivo siempre sera true para que entre a
                    // dicho bucle, creo un if que si introduce el dinero negativo lo indique
                    // poniendo que introduzca el dinero positivo, en cambio en el else el boleano
                    // dineroPositivo sera falso y realizara la operacion de cada opcion.
                    // Y luego para la próxima vez que el usuario vuelva a elegir la opcion, la
                    // variable boleana vuelva a ser positiva para que vuelva a entrar
                    while (dineroPositivo) {
                        System.out.println("Introduce el dinero en dolares");
                        dinero = sc.nextFloat();
                        if (dinero < 0) {
                            System.out.println("Introduce el dinero positivo");
                        } else {
                            dineroPositivo = false;
                            System.out.println(dinero + " dolares son " + dinero * cambio[0] + " euros\n");
                        }
                    }
                    break;


                case 2:
                    System.out.println("Has elegido de dolares a pesos mexicanos");
                    // creo un bucle en el cual dineroPositivo siempre sera true para que entre a
                    // dicho bucle, creo un if que si introduce el dinero negativo lo indique
                    // poniendo que introduzca el dinero positivo, en cambio en el else el boleano
                    // dineroPositivo sera falso el y realizara la operacion de cada opcion.
                    // Y luego para la próxima vez que el usuario vuelva a elegir la opcion, la
                    // variable boleana vuelva a ser positiva para que vuelva a entrar
                    dineroPositivo = true;
                    while (dineroPositivo) {
                        System.out.println("Introduce el dinero en euros");
                        dinero = sc.nextFloat();
                        if (dinero < 0) {
                            System.out.println("Introduce el dinero positivo");
                        } else {
                            dineroPositivo = false;
                            System.out.println(dinero + " dolares son " + dinero * cambio[1] + " pesos mexicanos\n");
                        }
                    }
                    break;


                case 3:
                    System.out.println("Has elegido de euros a dolares");
                    // creo un bucle en el cual dineroPositivo siempre sera true para que entre a
                    // dicho bucle, creo un if que si introduce el dinero negativo lo indique
                    // poniendo que introduzca el dinero positivo, en cambio en el else el boleano
                    // dineroPositivo sera falso el y realizara la operacion de cada opcion.
                    // Y luego para la próxima vez que el usuario vuelva a elegir la opcion, la
                    // variable boleana vuelva a ser positiva para que vuelva a entrar
                    dineroPositivo = true;
                    while (dineroPositivo) {
                        System.out.println("Introduce el dinero en euros");
                        dinero = sc.nextFloat();
                        if (dinero < 0) {
                            System.out.println("Introduce el dinero positivo");
                        } else {
                            dineroPositivo = false;
                            System.out.println(dinero + " euros son " + dinero * cambio[2] + " dolares\n");
                        }
                    }
                    break;


                case 4:
                    System.out.println("Has elegido de euros a pesos mexicanos");
                    // creo un bucle en el cual dineroPositivo siempre sera true para que entre a
                    // dicho bucle,creo un if que si introduce el dinero negativo lo indique
                    // poniendo que introduzca el dinero positivo, en cambio en el else el boleano
                    // dineroPositivo sera falso el y realizara la operacion de cada opcion.
                    // Y luego para la próxima vez que el usuario vuelva a elegir la opcion, la
                    // variable boleana vuelva a ser positiva para que vuelva a entrar
                    dineroPositivo = true;
                    while (dineroPositivo) {
                        System.out.println("Introduce el dinero en euros");
                        dinero = sc.nextFloat();
                        if (dinero < 0) {
                            System.out.println("Introduce el dinero positivo");
                        } else {
                            dineroPositivo = false;
                            System.out.println(dinero + " euros son " + dinero * cambio[3] + " pesos mexicanos\n");
                        }
                    }
                    break;


                case 5:
                    System.out.println("Has elegido de pesos mexicanos a dolares");
                    // creo un bucle en el cual dineroPositivo siempre sera true para que entre a
                    // dicho bucle, creo un if que si introduce el dinero negativo lo indique
                    // poniendo que introduzca el dinero positivo, en cambio en el else el boleano
                    // dineroPositivo sera falso el y realizara la operacion de cada opcion.
                    // Y luego para la próxima vez que el usuario vuelva a elegir la opcion, la
                    // variable boleana vuelva a ser positiva para que vuelva a entrar
                    dineroPositivo = true;
                    while (dineroPositivo) {
                        System.out.println("Introduce el dinero en pesos mexicanos");
                        dinero = sc.nextFloat();
                        if (dinero < 0) {
                            System.out.println("Introduce el dinero positivo");
                        } else {
                            dineroPositivo = false;
                            System.out.println(dinero + " pesos mexicanos son " + dinero * cambio[4] + " dolares\n");
                        }
                    }
                    break;


                case 6:
                    System.out.println("Has elegido de pesos mexicanos a euros");
                    // creo un bucle en el cual dineroPositivo siempre sera true para que entre a
                    // dicho bucle, creo un if que si introduce el dinero negativo lo indique
                    // poniendo que introduzca el dinero positivo, en cambio en el else el boleano
                    // dineroPositivo sera falso el y realizara la operacion de cada opcion.
                    // Y luego para la próxima vez que el usuario vuelva a elegir la opcion, la
                    // variable boleana vuelva a ser positiva para que vuelva a entrar
                    dineroPositivo = true;
                    while (dineroPositivo) {
                        System.out.println("Introduce el dinero en pesos mexicanos");
                        dinero = sc.nextFloat();
                        if (dinero < 0) {
                            System.out.println("Introduce el dinero positivo");
                        } else {
                            dineroPositivo = false;
                            System.out.println(dinero + " pesos mexicanos son " + dinero * cambio[5] + " euros\n");
                        }
                    }
                    break;


                case 7:
                    System.out.println("Has elegido de dolares a yenes");
                    // creo un bucle en el cual dineroPositivo siempre sera true para que entre a
                    // dicho bucle, creo un if que si introduce el dinero negativo lo indique
                    // poniendo que introduzca el dinero positivo, en cambio en el else el boleano
                    // dineroPositivo sera falso el y realizara la operacion de cada opcion.
                    // Y luego para la próxima vez que el usuario vuelva a elegir la opcion, la
                    // variable boleana vuelva a ser positiva para que vuelva a entrar
                    dineroPositivo = true;
                    while (dineroPositivo) {
                        System.out.println("Introduce la cantidad en dolares");
                        dinero = sc.nextFloat();
                        if (dinero < 0) {
                            System.out.println("Introduce el dinero positivo");
                        } else {
                            dineroPositivo = false;
                            System.out.println(dinero + " dolares son " + dinero * cambio[6] + " yenes\n");
                        }
                    }
                    break;


                case 8:
                    System.out.println("Has elegido de Yenes a Dolares");
                    // creo un bucle en el cual dineroPositivo siempre sera true para que entre a
                    // dicho bucle,creo un if que si introduce el dinero negativo lo indique
                    // poniendo que introduzca el dinero positivo, en cambio en el else el boleano
                    // dineroPositivo sera falso el y realizara la operacion de cada opcion.
                    // Y luego para la próxima vez que el usuario vuelva a elegir la opcion, la
                    // variable boleana vuelva a ser positiva para que vuelva a entrar
                    dineroPositivo = true;
                    while (dineroPositivo) {
                        System.out.println("Introduce el dinero en yenes");
                        dinero = sc.nextFloat();
                        if (dinero < 0) {
                            System.out.println("Introduce el dinero positivo");
                        } else {
                            dineroPositivo = false;
                            System.out.println(dinero + " yenes son " + dinero * cambio[7] + " dolares\n");
                        }
                    }
                    break;


                case 9:
                    System.out.println("Has elegido de Yenes a Pesos Mexicanos");
                    // creo un bucle en el cual dineroPositivo siempre sera true para que entre a
                    // dicho bucle,creo un if que si introduce el dinero negativo lo indique
                    // poniendo que introduzca el dinero positivo, en cambio en el else el boleano
                    // dineroPositivo sera falso el y realizara la operacion de cada opcion.
                    // Y luego para la próxima vez que el usuario vuelva a elegir la opcion, la
                    // variable boleana vuelva a ser positiva para que vuelva a entrar
                    dineroPositivo = true;
                    while (dineroPositivo) {
                        System.out.println("Introduce el dinero en yenes");
                        dinero = sc.nextFloat();
                        if (dinero < 0) {
                            System.out.println("Introduce el dinero positivo");
                        } else {
                            dineroPositivo = false;
                            System.out.println(dinero + " yenes son " + dinero * cambio[8] + " Pesos mexicanos\n");
                        }
                    }
                    break;
                case 10:
                    System.out.println("Has elegido de Pesos Mexicanos a Yenes");
                    // creo un bucle en el cual dineroPositivo siempre sera true para que entre a
                    // dicho bucle,creo un if que si introduce el dinero negativo lo indique
                    // poniendo que introduzca el dinero positivo, en cambio en el else el boleano
                    // dineroPositivo sera falso el y realizara la operacion de cada opcion.
                    // Y luego para la próxima vez que el usuario vuelva a elegir la opcion, la
                    // variable boleana vuelva a ser positiva para que vuelva a entrar
                    dineroPositivo = true;
                    while (dineroPositivo) {
                        System.out.println("Introduce el dinero en pesos mexicanos");
                        dinero = sc.nextFloat();
                        if (dinero < 0) {
                            System.out.println("Introduce el dinero positivo");
                        } else {
                            dineroPositivo = false;
                            System.out.println(dinero + " pesos mexicanos son " + dinero * cambio[9] + " yenes\n");
                        }
                    }
                    break;
                   
                case 11:
                    System.out.println("Has elegido de Euros a Yenes");
                    // creo un bucle en el cual dineroPositivo siempre sera true para que entre a
                    // dicho bucle,creo un if que si introduce el dinero negativo lo indique
                    // poniendo que introduzca el dinero positivo, en cambio en el else el boleano
                    // dineroPositivo sera falso el y realizara la operacion de cada opcion.
                    // Y luego para la próxima vez que el usuario vuelva a elegir la opcion, la
                    // variable boleana vuelva a ser positiva para que vuelva a entrar
                    dineroPositivo = true;
                    while (dineroPositivo) {
                        System.out.println("Introduce el dinero en euros");
                        dinero = sc.nextFloat();
                        if (dinero < 0) {
                            System.out.println("Introduce el dinero positivo");
                        } else {
                            dineroPositivo = false;
                            System.out.println(dinero + " euros son " + dinero * cambio[10] + " yenes\n");
                        }
                    }
                    break;


                case 12:
                    System.out.println("Has elegido de yenes a euros");
                    // creo un bucle en el cual dineroPositivo siempre sera true para que entre a
                    // dicho bucle,creo un if que si introduce el dinero negativo lo indique
                    // poniendo que introduzca el dinero positivo, en cambio en el else el boleano
                    // dineroPositivo sera falso el y realizara la operacion de cada opcion.
                    // Y luego para la próxima vez que el usuario vuelva a elegir la opcion, la
                    // variable boleana vuelva a ser positiva para que vuelva a entrar
                    dineroPositivo = true;
                    while (dineroPositivo) {
                        System.out.println("Introduce el dinero en yenes");
                        dinero = sc.nextFloat();
                        if (dinero < 0) {
                            System.out.println("Introduce el dinero positivo");
                        } else {
                            dineroPositivo = false;
                            System.out.println(dinero + " yenes son " + dinero * cambio[11] + " euros\n");
                        }
                    }
                    break;


                case 13:
                    System.out.println("Has elegido salir");
                    // esta última opción finaliza el programa, e indico que veces es falso para que
                    // termine el bucle de antes para que repitiera hasta que el usuario
                    // introduciera la opcion de salir
                    veces = false;
                    break;


                default:
                    // si el usuario introduce una opcion diferente entre 1 y 9 saldra que
                    // introduzca una opcion correcta
                    System.out.println("Introduce una opción correcta");
                    break;


            }
        }
    }
}
