package views;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties; 


public class Files {
    
    public static void main(String[] args) {

        try {

            InputStream ins = new FileInputStream("./data/data.properties");

            Properties prop = new Properties();

            prop.load(ins);

            prop.forEach((key, value) -> System.out.println(key + "" + value));   //Para filtrar datos del archivo data.properties

            // System.out.println(prop.getProperty("58"));   //Para mostrar en consola las llaves y los datos
            


        } catch (Exception e) {
            //TODO: handle exception
        }
        
     // 1.  // try {
            
        //     OutputStream ous = new FileOutputStream("./data/data.properties");

        //     Properties prop = new Properties();

        //    // prop.setProperty("nombre", "marco");
        //   //  prop.setProperty("edad", "31");
        //     for (int i = 1; i <= 100; i++) {       // Lave única que en data.properties me va a mostrar los numeros de 1 a 00 de 3 en 3
        //         prop.setProperty(i+"", (i*3)+"");
        //     }

        //     prop.store(ous, null);

        //     System.out.println(prop);


        // } catch (Exception e) {
        //     //TODO: handle exception
        // }
    }



}
