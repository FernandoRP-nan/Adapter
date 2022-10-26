/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

public class Adapter {

    public static void main(String[] args) {

        bombillaClasica bombilla = new bombillaClasica();

        System.out.println(bombilla.encender());
        System.out.println(bombilla.aumentarIntensidad());
        System.out.println(bombilla.apagar());

        System.out.println();

        bombillaModerna moderna = new bombillaModerna();

        System.out.println(moderna.encender());
        System.out.println(moderna.aumentarIntensidad());
        System.out.println(moderna.apagar());

        System.out.println();

        bombillaAdapter usarVela = new bombillaAdapter();

        System.out.println(usarVela.encender());
        System.out.println(usarVela.aumentarIntensidad());
        System.out.println(usarVela.apagar());

        System.out.println();

    }
}
