import javax.swing.JFrame;
import javax.swing.JRootPane;

public class Main {

	public static void main(String args[]) {
		JFrame janela = new CalculadoraFrame();
		janela.setUndecorated(true);
		janela.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}

}


