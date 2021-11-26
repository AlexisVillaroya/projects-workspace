package module1;
import javax.swing.*;
import java.awt.*;

public class Main{
	public static void main(String[] args) {
		
		Currency c1 = new Currency(10, "EUR");
		Currency c2 = new Currency(10, "GBP");
		Currency c3 = new Currency(10, "MXN");
		
		new Window();
	}
}
