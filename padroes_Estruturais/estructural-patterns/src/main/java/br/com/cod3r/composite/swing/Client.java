package br.com.cod3r.composite.swing;

import javax.swing.*;
import java.awt.*;

public class Client {

	public static void main(String[] args) {
    JFrame frame =new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JLabel title = new JLabel("Padrão Composite");
    frame.add(title, BorderLayout.NORTH);

    JPanel panel = new JPanel(new FlowLayout());
    JLabel label = new JLabel("Label");
    JButton button = new JButton("Button");
    JCheckBox checkBox = new JCheckBox("CheckBox");

    panel.add(label, BorderLayout.AFTER_LAST_LINE);
    panel.add(button, BorderLayout.LINE_END);
    panel.add(checkBox, BorderLayout.LINE_START);

    frame.add(panel, BorderLayout.CENTER);

    frame.setSize(400,200);
    frame.setVisible(true);
	}
}
