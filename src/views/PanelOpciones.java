package views;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import org.graalvm.compiler.asm.aarch64.AArch64Assembler.SystemRegister;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelOpciones extends JPanel implements ActionListener {
    
    //Crear constantes:
    public final static String BTN_SALDO = "Consultar Saldo";
    public final static String BTN_CARGAR = "Cargar";

    // 1. Relación de atributos
    private JButton btnSaldo;
    private JButton btnCargar;

    private Interfaz interfaz;
   
    // 2. Inicializar las relaciones o atrubutos *PILAS CON ESTO! ES LO MÁS IMPORTANTE DEL TEMA DE INTERFAZ!
    public PanelOpciones(Interfaz inter) {
        super();
        setLayout(new GridLayout(1,2));
        setBorder(new TitledBorder("Opciones"));
        
        interfaz = inter;
        btnSaldo = new JButton(BTN_SALDO);
        btnCargar = new JButton(BTN_CARGAR);

    // 3. Modificar las propiedades (Opcional)
        btnSaldo.setActionCommand(BTN_SALDO);
        btnCargar.setActionCommand(BTN_CARGAR);

        btnSaldo.addActionListener(this);
        btnCargar.addActionListener(this);

    // 4. Agregar las relaciones o atributos
        add(btnSaldo);
        add(btnCargar);

    }


    @Override
    public void actionPerformed(ActionEvent e) {  //Esto se importó dando Quick.. al error que la clase PanelOpciones presentaba
        // TODO Auto-generated method stub
        if (e.getActionCommand().equals(BTN_SALDO)) {
            JOptionPane.showMessageDialog(interfaz, "Estas viendo tu saldo");
            //System.out.println("Estas viendo el saldo");     
        }
        else if (e.getActionCommand().equals(btnCargar.getActionCommand())) {
            JOptionPane.showMessageDialog(interfaz, "Vas a recargar", "Recarga Wallet", JOptionPane.WARNING_MESSAGE);
            //System.out.println("Monto a cargar"); 
        }
        
        
    }
    
}
