package boletin.pkg23;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author galle
 */
public class Boletin23 {

    public static void main(String[] args) {
        JFrame ventana = new JFrame ("Boletin 23");
        ventana.setSize(487, 535);
        
        ventana.setLocation(300, 100);
        ventana.setLayout(null);
        ventana.setResizable(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel ();
        panel.setSize(430, 215);
        panel.setLocation(20, 20);
        panel.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        panel.setLayout(null);
        
        JPanel panel2 = new JPanel ();
        panel2.setSize(430, 215);
        panel2.setLocation(20, 258);
        panel2.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        panel2.setLayout(null);
        
        JLabel eti1 = new JLabel("Nome");
        eti1.setLocation(50, 60);
        eti1.setSize(100, 75);
        
        JLabel eti2 = new JLabel("Password");
        eti2.setLocation(50, 100);
        eti2.setSize(100, 75);
        
        JButton bot1 = new JButton("Premer");
        bot1.setLocation(150, 180);
        bot1.setSize(85, 20);

        JButton bot2 = new JButton("Limpar");
        bot2.setLocation(265, 180);
        bot2.setSize(85, 20);
        
        String[] data = {"ElementoLista1\n\n\n", "ElementoLista2\n", "ElementoLista3\n"};
        JList list = new JList();
        list.setListData(data);
        list.setSize(120, 180);
        list.setLocation(15, 15);
        
        
        JButton bot3 =new JButton("Boton");
        bot3.setLocation(172, 100);
        bot3.setSize(85, 20);
        
        JTextField text = new JTextField ("Area de texto");
        text.setLocation(295, 15);
        text.setSize(120, 180);
        
        panel.add(eti1);
        panel.add(eti2);
        panel.add(bot1);
        panel.add(bot2);
        panel2.add(list);
        panel2.add(bot3);
        panel2.add(text);
        
        ventana.add(panel);
        ventana.add(panel2);
        
        ventana.setVisible(true);
    }
    
}
