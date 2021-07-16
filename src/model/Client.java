package model;

public class Client extends User {
    private Wallet wallet;

    public Client(String pNombre) {
        super();
        wallet = new Wallet();
        setNombre(pNombre);
    }

    public Wallet getWallet() {
        return wallet;
    }

   @Override               //Anotaciones generadas por el sistema
    public int getEstado() {                    //Está sobre escribiendo el getEstado que trajo del archivo User
        // TODO Auto-generated method stub
        return super.getEstado();
    }


}

