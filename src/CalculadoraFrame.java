import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class CalculadoraFrame extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	JLabel label1, label2, label3;
	JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12;
	JTextField t1, t2, t3;

	CalculadoraFrame() {

		b1 = new JButton("+");
		b1.addActionListener(this);
		b2 = new JButton("-");
		b2.addActionListener(this);
		b3 = new JButton("x");
		b3.addActionListener(this);
		b4 = new JButton("/");
		b4.addActionListener(this);
		
		
		
		b6 = new JButton("Log");
		b6.addActionListener(this);
		b7 = new JButton("Exp");
		b7.addActionListener(this);
		b8 = new JButton("Inv");
		b8.addActionListener(this);
		b9 = new JButton("Sen");
		b9.addActionListener(this);
		b10 = new JButton("Cos");
		b10.addActionListener(this);
		b11 = new JButton("Tan");
		b11.addActionListener(this);
		b12 = new JButton("^");
		b12.addActionListener(this);
		
		
		b5 = new JButton("Limpar");		
		b5.addActionListener(this);
		b5.setBackground(Color.black);
		b5.setForeground(Color.white);

		setTitle("Calculadora Versão 1.0");
		setTitle("Calculadora Versão 1.0");
		setBounds(300, 50, 350, 90);
		getContentPane().setBackground(new Color(150, 150, 150));
		getContentPane().setLayout(new GridLayout(3, 4));
		label1 = new JLabel("Num.1");
		label1.setForeground(Color.black);
		label1.setFont(new Font("", Font.BOLD, 14));
		label2 = new JLabel("Num.2");
		label2.setForeground(Color.black);
		label2.setFont(new Font("", Font.BOLD, 14));
		label3 = new JLabel("Total");
		label3.setFont(new Font("", Font.BOLD, 14));
		t1 = new JTextField();
		t2 = new JTextField();
		t3 = new JTextField();
		t3.setEditable(false);
		getContentPane().add(label1);
		getContentPane().add(t1);
		getContentPane().add(b1);
		getContentPane().add(b2);
		getContentPane().add(label2);
		getContentPane().add(t2);
		getContentPane().add(b3);
		getContentPane().add(b4);
		getContentPane().add(label3);
		getContentPane().add(t3);
		getContentPane().add(b5);
		
		getContentPane().add(b6);
		getContentPane().add(b7);
		getContentPane().add(b8);
		getContentPane().add(b9);
		getContentPane().add(b10);
		getContentPane().add(b11);
		getContentPane().add(b12);

		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b5) {
			t1.setText("");
			t2.setText("");
			t3.setText("");
			return;
		}
		float n1 = 0, n2 = 0, result = 0;
		try {
			n1 = Float.parseFloat(t1.getText());
			n2 = Float.parseFloat(t2.getText());
		} catch (NumberFormatException erro) {
			t3.setText("Erro");
			return;
		}
		if (e.getSource() == b1)
			result = n1 + n2; // botão somar
		if (e.getSource() == b2)
			result = n1 - n2; // botão subtrair
		if (e.getSource() == b3)
			result = n1 * n2; // botão multiplicar
		if (e.getSource() == b4)
			result = n1 / n2; // botão dividir
		
		if (e.getSource() == b5)
			result = n1 / n2; // botão Logaritmos
		if (e.getSource() == b6)
			result = n1 / n2; // botão Exponencial
		if (e.getSource() == b7)
			result = n1 / n2; // botão Inverso
		if (e.getSource() == b8)
			result = n1 / n2; // botão Cosseno
		if (e.getSource() == b9)
			result = n1 / n2; // botão Tangente
		if (e.getSource() == b10)
			result = n1 / n2; // botão Potência
		if (e.getSource() == b11)
			result = n1 / n2; // botão Raiz quadrada
		if (e.getSource() == b12)
			result = n1 / n2; // botão Raiz Cúbica

		t3.setText("" + result);
	}

}
