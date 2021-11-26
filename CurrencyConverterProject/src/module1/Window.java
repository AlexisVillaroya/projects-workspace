package module1;
import javax.swing.*;
import java.awt.*;

public class Window extends JFrame{
	private JFrame f;
	private JPanel p;
	private JButton b1;
	private JTextField textField;
	private JLabel lab;
	
	public Window() {
		gui();
	}
	
	public void gui() {
		f = new JFrame("Currency Converter");
		
		f.setVisible(true);
		f.setSize(600,400);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		textField = new JTextField(20);
		
		p = new JPanel();
		p.setBackground(Color.WHITE);
		
		b1 = new JButton();
		
		f.add(p);
		p.add(textField);
		p.add(b1);
	}
	
	private void setLabel(String text) {
		this.lab.setText(text);
	}
	
	public void convertButton(Currency c) {
		setLabel(convertDoubleToString(c.ConvertCurrencyToDollar(c)));
	}
	
	public String convertDoubleToString(double d) {
		String result = d+"";
		return result;
	}
}
