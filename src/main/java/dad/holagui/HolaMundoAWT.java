package dad.holagui;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;

public class HolaMundoAWT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Label saludarLabel = new Label();
		saludarLabel.setText("Aqui saldrá el texto");
		saludarLabel.setBounds(20, 20, 120, 50);

		Button saludarButton = new Button();
		saludarButton.setLabel("Saludar");
		saludarButton.setBounds(20, 80, 120, 30);
		saludarButton.addActionListener( e -> saludarLabel.setText("hola mundo"));

		Panel rootPanel = new Panel();
		rootPanel.setLayout(null);
		rootPanel.add(saludarLabel);
		rootPanel.add(saludarButton);

		Frame frame = new Frame();
		frame.setTitle("Hola mundo AWT");
		frame.setSize(320, 200);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.add(rootPanel);
		frame.setVisible(true);
		
		
		
	}

}
