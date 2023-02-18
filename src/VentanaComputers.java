import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaComputers extends JFrame {

    private fondoPanel panelComputers = new fondoPanel();
    private JButton back = new JButton();
    private JTextField texto = new JTextField();

    public VentanaComputers(){
        setSize(750, 750);
        setLocationRelativeTo(null);
        setTitle("AD-MAGIC");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        iniciando();
    }
    private void iniciando(){
        etiquetas();
        paneles();
        botones();
    }
    private void etiquetas(){

    }
    private void paneles(){
        panelComputers = new fondoPanel();
        panelComputers.setLayout(null);
        this.getContentPane().add(panelComputers);
    }
    private void botones(){
        backbutton();
    }
    private void backbutton(){
        back = new JButton();
        back.setBounds(580, 620,120,60);
        back.setText("REGRESAR");
        ActionListener accionBotonBack = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                VentanaPrincipal V1 = new VentanaPrincipal();
                V1.setVisible(true);
            }
        };
        back.addActionListener(accionBotonBack);
        panelComputers.add(back);

    }
    class fondoPanel extends JPanel{
        private Image imagen;

        @Override
        public void paint(Graphics g){
            imagen = new ImageIcon(getClass().getResource("/Images/FondoPanelPrincipal.jpg")).getImage();
            g.drawImage(imagen, 0,0, panelComputers.getWidth(),panelComputers.getHeight(),this);
            setOpaque(false);
            super.paint(g);
        }
    }

}
