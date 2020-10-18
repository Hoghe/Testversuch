
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MainMenuBar extends MenuBar implements ActionListener{
	

	
	private Menu _menu;
	private MenuItem _color1, _color2, _color3;
	private final Canvas _neuerName;
	
	public MainMenuBar(Canvas drawobject) {
		_menu = new Menu("Ändere die Hintergrundfarbe");
				
//		_menu.add(new MenuItem("color: red"));
//		_menu.add(new MenuItem("color: yellow"));
//		_menu.add(new MenuItem("color: green"));
		
		this._neuerName = drawobject;
		
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
			this._neuerName.setBackground(Color.red);
		}else if (e.getSource() == _color2) {
			System.out.println("test gelb");
			this._neuerName.setBackground(Color.green);
		}else if (e.getSource() == _color3) {
			System.out.println("test blau");
			this._neuerName.setBackground(Color.blue);
		}
	}


}

