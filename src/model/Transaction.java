package model;

public class Transaction {
    private int amount;
    private String fecha;

    /**
     * Tipo de transacción
     * 1 Ingreso de dinero
     * 2 Retiro de dinero
     */
    private int type;
    private String description;

    /**
     * Método que construye un objeto de la clase Transaction <br>
     * @param amount Valor del movimiento
     * @param fecha Fecha en la cual se realiza el movimiento
     * @param type  Tipo de transacción: Retiro (2 ==) o consignación (1 ==)
     * @param description Descripción del tipo de transacción que el usuario está realizando
     */
    public Transaction(int amount, String fecha, int type, String description) {
        super();
        this.amount = amount;
        this.fecha = fecha;
        this.type = type;
        this.description = description;
    }

    /**
     * Retorna el valor del movimiento
     * @return Amount
     */

    public int getAmount() {
        return amount;
    }

    public String getFecha() {
        return fecha;
    }

    public int getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    public String toString(){
        return "Monto: $" + amount + ", Fecha: " + fecha + ", Tipo: " + ((type==1)?"Ingreso":"Egreso") + ", Descripción: " + description;
    }



}