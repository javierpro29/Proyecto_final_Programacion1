package Aplication;
import java.awt.BorderLayout;

import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JInternalFrame.JDesktopIcon;
import javax.swing.JPanel;

public class MostrarPanel {
	
	public void showpane(JPanel a, JDesktopPane Vista){
		a.setSize(1080, 684);
		a.setLocation(0, 0);
	
		Vista.removeAll();
		Vista.add(a, BorderLayout.CENTER);
		Vista.revalidate();
		Vista.repaint();
	}
	
	public void showpane(JPanel a, JDesktopPane Vista, int w, int h ){
		a.setSize(w, h);
		a.setLocation(0, 0);
	
		Vista.removeAll();
		Vista.add(a, BorderLayout.CENTER);
		Vista.revalidate();
		Vista.repaint();
	}
		
}
