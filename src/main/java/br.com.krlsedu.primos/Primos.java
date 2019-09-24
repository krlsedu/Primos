/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.krlsedu.primos;

/**
 * @author CarlosEduardo
 */
public class Primos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        testaSePrimo();
    }

    public static void testaSePrimo() {
        long ehPrimo = 0L, ultimoPrimo = 3L, numero = 3L, num, y = 0L, z = 3L;
        int i;
        StringBuilder listaNumeros = new StringBuilder("3");
        while (true) {
            numero += 2;
            ehPrimo = 1L;
            String[] nuns = listaNumeros.toString().split(",");
            i = 0;
            while (ehPrimo == 1L && i < nuns.length && Integer.parseInt(nuns[i]) <= (Math.sqrt(numero))) {
                num = Long.parseLong(nuns[i]);
                if (numero % num == 0) {
                    ehPrimo = 0L;
                }
                i++;
            }
            if (ehPrimo == 1) {
                listaNumeros.append(",").append(numero);
                ultimoPrimo = numero;
                z++;
                System.out.println(ultimoPrimo);
            }
            if (z == 1000) {
                System.out.println(ultimoPrimo);
                z = 0L;
                y++;
                System.out.println("Número de primos até agora :" + y * 1000 + " um primo a cada " + (ultimoPrimo / (y * 1000)) + " Números. Raiz do numero atual " + Math.sqrt(ultimoPrimo));
            }
        }
    }
}
