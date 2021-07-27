package model;

import java.util.ArrayList;

public class Wallet {                                       // Siempre son públicas, los objetos de la clase son privados

    public static final int CAPACIDAD_MAXIMA = 1000000;    //Crear una constante ojo! mayuscula el nombre

    private int saldo;
    private boolean tieneLimite;
    private int meta;

    /**
     * Listas
     */

    private ArrayList<Transaction> movimientos;

    public Wallet() {
        super();
        saldo = 0;
        tieneLimite = true;
        meta = 0;
        movimientos = new ArrayList<>();
    }

    public int getSaldo () {
        return saldo;                                             //métodos; si retorna algo tipo de dato es int
    }       
    public boolean getTieneLimite(){
        return tieneLimite;
    }   
    public boolean establecerMeta(int value){
        if(value==0){
            meta = value;
            return true;
        }
        if(value <0 || value <= saldo || (value >= CAPACIDAD_MAXIMA && tieneLimite) ){
            return false;
        }
        meta = value;
        return true;
    }                                                   //         get, trae un dato, luego como son 2 palabras porgo gitSaldo así la variable esté en minúscula

    public boolean verificarMeta(){
        if(meta == 0 || meta > saldo){
            return false;
        }
        return true;

    }
    public void setTieneLimite(boolean newTieneLimite){            // la función no retorna ningún valor
        this.tieneLimite = newTieneLimite;
    }

    public String saveMoney(int value) throws Exception{
        if (saldo + value > CAPACIDAD_MAXIMA && tieneLimite){
            
            throw new Exception("No se puede superar el límite" + CAPACIDAD_MAXIMA);
            //return "No se puede superar el límite" + CAPACIDAD_MAXIMA;
        }
        saldo += value; // saldo = saldo + value
        Transaction ingreso = new Transaction(value,"hoy", 1, "Ingreso de dinero");
        movimientos.add(ingreso);
        if(verificarMeta()){System.out.println("Has cumplido la meta");}
        return "Transacción exitosa, nuevo saldo" + saldo;   
    }
    


    public String takeMoney(int value){
        if(saldo < value){
            return "Saldo insuficiente";
        }
        saldo -= value;
        Transaction retiro = new Transaction(value,"hoy", 2, "Retiro de dinero");
        movimientos.add(retiro);
        return "Transacción exitosa, nuevo saldo" + saldo;
    }

    public String breakLimit(){
        if(!tieneLimite){
            return "Tu cuenta no tiene límites!";
        }
        if (saldo >= 10000){
            saldo -= 10000;
            setTieneLimite(false);  // igual a tieneLimite = false;
            Transaction limites = new Transaction(10000,"hoy", 2, "Has pasado tus límites");
            movimientos.add(limites);
            return "Has roto los límites!";
        }
        return "No tienes saldo suficiente :(";
    }

    public String compararCuenta(Wallet otraWallet){
        if(saldo == otraWallet.getSaldo()){
            return "Las cuentas tienen el mismo saldo";
        }
        if(saldo > otraWallet.getSaldo()){  
            return "La primera cuenta es mayor";
        }
        return "La segunda cuenta es mayor";
        
    }

    public void displayMovimientos(){
        for (Transaction movimiento : movimientos) {   //Aquí quiero que de la clase Transaction me muestre lo que hizo con el movimiento realizado por el usuario (Uso forich..)
            System.out.println(movimiento);
        }

    }


}
