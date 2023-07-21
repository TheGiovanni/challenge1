import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class conversor extends JFrame {
    private JMenuBar menuBar;
    private JMenu menu;
    private JMenu menu2;
    private JMenuItem opcion1;
    private JMenuItem opcion2;
    private JMenuItem opcion3;
    private JMenuItem opcion4;
    private JMenuItem opcion5;
    private JMenuItem opcion6;
    private JMenuItem opcion7;
    private JMenuItem opcion8;

    private JMenuItem opcion9;



    public conversor(){
        setSize(300,200);
        setTitle("CONVERSOR");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        mostrarMenu();
        panel.add(menuBar);
        add(panel);
    }

    public void mostrarMenu(){
        menuBar = new JMenuBar();
        menu = new JMenu("Monedas");

        opcion1 = new JMenuItem("USD A MXN");
        opcion2 = new JMenuItem("MXN A USD");
        opcion3 = new JMenuItem("EURO A MXN");
        opcion4 = new JMenuItem("MXN A EURO");
        opcion5 = new JMenuItem("Libras esterlinas a MXN");
        opcion6 = new JMenuItem("MXN a Libras esterlinas");

        menu2 = new JMenu("Distancias");
        opcion7 = new JMenuItem("cm a metro");
        opcion8 = new JMenuItem("metro a cm");


        opcion9 = new JMenuItem("SALIR");

        menu.add(opcion1);
        menu.add(opcion2);
        menu.add(opcion3);
        menu.add(opcion4);
        menu.add(opcion5);
        menu.add(opcion6);
        menu.add(opcion9);
        menu2.add(opcion7);
        menu2.add(opcion8);
        menu2.add(opcion9);


        menuBar.add(menu);
        menuBar.add(menu2);

        opcion9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Saliendo...");
                System.exit(0);
            }
        });

        opcion1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               int p= Integer.parseInt(JOptionPane.showInputDialog(null,"Cantidad en dólares",0));
               JOptionPane.showMessageDialog(null,(p*16.84+" pesos"));
            }
        });
        opcion2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int o= Integer.parseInt(JOptionPane.showInputDialog(null,"Cantidad en pesos",0));
                JOptionPane.showMessageDialog(null,(o/16.84 + " doláres"));
            }
        });

        opcion3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int q= Integer.parseInt(JOptionPane.showInputDialog(null,"Cantidad en Euros",0));
                JOptionPane.showMessageDialog(null,((18.75*q)+ " pesos"));
            }
        });
        opcion4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int w=Integer.parseInt(JOptionPane.showInputDialog(null, "Cantidad en MXN", 0));
                JOptionPane.showMessageDialog(null,(w/18.75)+ " euros");
            }
        });
        opcion5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int w=Integer.parseInt(JOptionPane.showInputDialog(null, "Cantidad en libras", 0));
                JOptionPane.showMessageDialog(null,(w*21.70)+ " pesos");
            }
        });
        opcion6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int w=Integer.parseInt(JOptionPane.showInputDialog(null, "Cantidad en MXN", 0));
                JOptionPane.showMessageDialog(null,(w/21.70)+ " libras");
            }
        });
        opcion7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double c= Double.parseDouble(JOptionPane.showInputDialog(null,"Medida en cm",0));
                JOptionPane.showMessageDialog(null, c/100+ " metros");
            }
        });
        opcion8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double m= Double.parseDouble(JOptionPane.showInputDialog(null,"Medida en metros",0));
                JOptionPane.showMessageDialog(null, m*100+ " cm");
            }
        });

    }

    public static void main(String[] args) {
        conversor ventana = new conversor();
        ventana.setVisible(true);
    }
}
