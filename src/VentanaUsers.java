import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaUsers extends JFrame {
    private fondoPanel panelUsers = new fondoPanel();
    private JTextField texto = new JTextField();
    private JButton back = new JButton();

    public VentanaUsers(){
        setSize(750, 750);
        setLocationRelativeTo(null);
        setTitle("AD-MAGIC");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        iniciando();
    }
    private void iniciando(){
        paneles();
        etiquetas();
        botones();
        textos();

    }
    private void etiquetas(){

    }
    private void paneles(){
        panelUsers = new fondoPanel();
        panelUsers.setLayout(null);
        this.getContentPane().add(panelUsers);
    }
    private void botones(){
        backbutton();
    }
    private void textos(){

    }
    private void backbutton(){
        back = new JButton();
        back.setBounds(580, 620,120,60);
        back.setText("REGRESAR");
        panelUsers.add(back);
        ActionListener accionBotonBack = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                VentanaPrincipal V1 = new VentanaPrincipal();
                V1.setVisible(true);
            }
        };
        back.addActionListener(accionBotonBack);
    }
    class fondoPanel extends JPanel{
        private Image imagen;

        @Override
        public void paint(Graphics g){
            imagen = new ImageIcon(getClass().getResource("/Images/FondoPanelPrincipal.jpg")).getImage();
            g.drawImage(imagen, 0,0, panelUsers.getWidth(),panelUsers.getHeight(),this);
            setOpaque(false);
            super.paint(g);
        }
    }


}
