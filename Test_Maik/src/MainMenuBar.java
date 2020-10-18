
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MainMenuBar extends MenuBar implements ActionListener{
	
	private Menu _menu;
	private MenuItem _color1, _color2, _color3;
	private final Canvas _drawObjects;
	
	public MainMenuBar(Canvas drawObjects) {
		_menu = new Menu("Ändere die Hintergrundfarbe");
		this._drawObjects = drawObjects;
				
//		_menu.add(new MenuItem("color: red"));
//		_menu.add(new MenuItem("color: yellow"));
//		_menu.add(new MenuItem("color: green"));
		
		_color1 = new MenuItem("Farbe: Rot");
		_color1.addActionListener(this);
		_menu.add(_color1);
		_color2 = new MenuItem("Farbe: Gelb");
		_color2.addActionListener(this);
		_menu.add(_color2);
		_color3 = new MenuItem("Farbe: Blau");
		_color3.addActionListener(this);
		_menu.add(_color3);
			
		add(_menu);
		}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == _color1) {
			System.out.println("test rot");
			_drawObjects.setBackground(Color.red);
		}else if (e.getSource() == _color2) {
			System.out.println("test gelb");
			_drawObjects.setBackground(Color.green);
		}else if (e.getSource() == _color3) {
			System.out.println("test blau");
			_drawObjects.setBackground(Color.blue);
		}
	}

}

