import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal extends JFrame {
    private fondoPanel panel = new fondoPanel();
    private JButton botonUser = new JButton();
    private JButton botonComputer = new JButton();
    private JLabel texto = new JLabel();
    private JLabel consulta = new JLabel();


    public VentanaPrincipal(){
        setTitle("AD-MAGIC");
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        iniciando();
        setMinimumSize(new Dimension(500,500));
        setMaximumSize(new Dimension(500, 500));
    }
    private void iniciando(){
        paneles();
        etiquetas();
        botones();
    }
    private void paneles(){
        panel = new fondoPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
    }
    class fondoPanel extends JPanel{
        private Image imagen;

        @Override
        public void paint(Graphics g){
            imagen = new ImageIcon(getClass().getResource("/Images/FondoPanelPrincipal.jpg")).getImage();
            g.drawImage(imagen, 0,0, panel.getWidth(),panel.getHeight(),this);
            setOpaque(false);
            super.paint(g);
        }
    }

    private void etiquetas(){
        texto = new JLabel("Bienvenido", SwingConstants.CENTER);
        texto.setBounds(140, 10,200,50);
        texto.setFont(new Font("Amasis MT Pro Black", Font.BOLD, 30));
        panel.add(texto);
        consulta = new JLabel("¿Sobre que desea operar?", SwingConstants.CENTER);
        consulta.setBounds(100, 70,275,50);
        consulta.setFont(new Font("Amasis MT Pro Black", Font.BOLD, 20));
        panel.add(consulta);
    }
    private void botones(){
        botonUser();
        botonComputer();
    }

    private void botonUser(){
        botonUser = new JButton();
        botonUser.setBounds(50,250,150,100);
        botonUser.setText("Users");
        botonUser.setFont(new Font("Amasis MT Pro Black", Font.BOLD, 20));
        botonUser.setMnemonic('u');
        panel.add(botonUser);
        ActionListener accionBotonUser = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                VentanaUsers VU1 = new VentanaUsers();
                VU1.setVisible(true);
            }
        };
        botonUser.addActionListener(accionBotonUser);
    }
    private void botonComputer(){
        botonComputer = new JButton();
        botonComputer.setBounds(285,250,150,100);
        botonComputer.setText("Computers");
        botonComputer.setFont(new Font("Amasis MT Pro Black", Font.BOLD, 20));
        botonComputer.setMnemonic('c');
        ActionListener accionBotonComputer = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VentanaComputers VC1 = new VentanaComputers();
                VC1.setVisible(true);
                dispose();
            }
        };
        botonComputer.addActionListener(accionBotonComputer);
        panel.add(botonComputer);
    }


}
