package com.jetbrains;

public class Main {

    /**
     *
     * @param args son los parametros de argumento que hemos introdicido en las posiciones [0],[1],[2] del main
     */
    public static void main(String[] args) {

            String valor1;
            String valor2;

            valor1=args[1];
            valor2=args[2];

            System.out.println("La calificación de " + args[0] + " su objetivo, impusto es de : " + args[1] + " y la  nota obtenia es : " + args[2] + " sobre 10");

            System.out.println(Main.veredicto(valor1,valor2));

        }

    /**
     *
     * @param valor1 es la variable que devulelve el valor de la notas a conseguir
     * @param valor2 es la variable que devulelve el valor de la notas  conseguir
     * @return devuelve el resultado obtenido de las variables valor1 y valor2
     */
            private static String veredicto(String valor1, String valor2) {
                if (valor1.equals(valor2)) {
                    return "Perfecto. Has tenido buen criterio.";
                }
                if (Integer.valueOf(valor1) < Integer.valueOf(valor2)){
                    return "Has mejorado, o te ha llegado el éxito inesperado.";
                }
                else
                    return "Te has confiado. Falta realismo.";
            }


        }