import javax.swing.JFrame;

public class Test
{

	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Hola Windows 10");
		
		frame.setSize(600,  600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}
