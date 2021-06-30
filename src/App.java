public class App {

        private String nombre;
        private int edad;
        private char sexo;
        private double estatura;
        private float peso;
        private boolean estadoCivil;



   public static void main(String[] args) throws Exception {
        System.out.println("Hello World!");    

        // tipos de datos y operadores 
        String res = "Hola";
        int resultado = 15 + 32;
        int resultado2 = 125 - 32;
        double resultado3 = 25 / 3;
        float resultado4 = 58 * 21;
        int resultado5 = 21 % 9;

        // operadores uniarios (de un solo valor)
        resultado ++; //para sumar 1
        resultado --; //para restar 1
        resultado = -resultado;
        resultado = +resultado;

        // operadortes lógicos (resultado entre verdadero y falso)
        boolean respuesta = true;
        respuesta = 5 > 8;
        respuesta = 5 < 8;
        respuesta = 5 <= 8;
        respuesta = 5 >= 8;
        respuesta = 5 != 8;  //Es diferente?
        respuesta = 5 == 8;  //Es igual?
        respuesta = 12 < 5 && 4 > 1; //Se deben cumplir las dos condiciones
        respuesta = 14 < 25 || 1 > 5; //Si la 1ra es falsa.. se sigue, si no, se para

        // operadores bit a bit
        // & (at)
        // ^ (para potencias, o comparaciones numéricas)
        // | (otras operaciones)

        // Estructuras de control
        if (respuesta) {
            // bloque de código
        }

        if (respuesta) {
            // bloque de código si se cumple
        } else {
            // bloque de código si no se cumple
        }






    } 
}