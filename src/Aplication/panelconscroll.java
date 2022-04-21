package Aplication;

import javax.swing.*;
import java.awt.event.*;
 
@SuppressWarnings("deprecation")
public class panelconscroll extends JFrame {

	
	JPanel panel = new JPanel();
		 
	 JTextArea mensajes = new JTextArea(30,35);
	 
	 
	 JScrollPane scroll1 = new JScrollPane(mensajes);
	 
	 JScrollPane scroll2 = new JScrollPane(panel);
 
 
 
 public panelconscroll() {
	 super("Los Grupos");
	 setLocation(100,100);
	 setSize(230,270);
	
	 mensajes.setEditable(false);
	 panel.add("South",scroll1);
	 
	 add(scroll2);
	 show();
  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }
 
 
 
 
 class MiEscucha implements ActionListener {
  public void actionPerformed(ActionEvent evt) {
   mensajes.append("Presionado el boton: "+
    evt.getActionCommand()+"\n");
  }
 }
 
 
 public static void main(String[] arg) {
  JOptionPane.showMessageDialog(null,"Un Panel con Scroll\n");
  JOptionPane.showMessageDialog(null,"By Carlitox ("+
   "http://calitoxenlaweb.blogspot.com)");
  new panelconscroll();
 }
}