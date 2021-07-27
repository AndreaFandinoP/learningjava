package views;

import model.Wallet;

public class Vista {

    public static void main2(String[] args) {
        Wallet wallet1 = new Wallet();
        Wallet wallet2 = new Wallet();
        try {       //Este es el bloque try catch (muy importante usarlo!)
            //Aquí pongo el código que pueda causar el error, por ejemplo:
            System.out.println(wallet1.getSaldo()/0);
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("Ups! Algo pasó!");
        }
        System.out.println(wallet1.getSaldo());
        System.out.println(wallet1.saveMoney(200000));
        System.out.println(wallet1.saveMoney(300000));
        System.out.println(wallet1.breakLimit());
        System.out.println(wallet1.saveMoney(600000));
        System.out.println(wallet2.getSaldo());
    }
    
}
