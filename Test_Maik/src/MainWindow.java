

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainWindow extends Frame implements WindowListener {
	
	private int _x, _y;

	
	public MainWindow(int windowSizeX, int windowSizeY) {
		this._x = windowSizeX;
		this._y = windowSizeY;
		setTitle("Programm für Softwaretechnik");
		setSize(_x,_y);
		addWindowListener(this);
	//	add(new DrawObject(_x, _y));
		DrawObject d = new DrawObject(_x, _y);
		add(d);
		MainMenuBar mmb = new MainMenuBar(d);
		setMenuBar(mmb);

		
	}
	
	public int getX () {
		return _x;
	}
	
	public int getY () {
		return _y;
	}
	
	public void openWindow() {
		setVisible(true);
	}

	@Override
	public void windowOpened(WindowEvent e) {
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		dispose();	//	Ressourcenfreigabe
		System.exit(0);

	}

	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Automatisch generierter Methodenstub
		
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Automatisch generierter Methodenstub
		
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Automatisch generierter Methodenstub
		
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Automatisch generierter Methodenstub
		
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Automatisch generierter Methodenstub
		
	}
}
