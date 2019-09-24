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
        long ultimoPrimo = 3L, numero = 3L, num, y = 0L, z = 3L;
        boolean ehPrimo;
        int i;
        StringBuilder listaNumeros = new StringBuilder("3");
        while (true) {
            numero += 2;
            ehPrimo = true;
            String[] nuns = listaNumeros.toString().split(",");
            i = 0;
            while (ehPrimo && i < nuns.length && Integer.parseInt(nuns[i]) <= (Math.sqrt(numero))) {
                num = Long.parseLong(nuns[i]);
                if (numero % num == 0) {
                    ehPrimo = false;
                }
                i++;
            }
            if (ehPrimo) {
                listaNumeros.append(",").append(numero);
                ultimoPrimo = numero;
                z++;
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
