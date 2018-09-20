
import java.awt.EventQueue;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JFrame;
import java.awt.GridLayout;

public class grid extends JFrame{
	JButton[][] grids = new JButton[20][20];
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		JFrame chessBorder = new grid();
		chessBorder.setTitle("test");
		chessBorder.setLocation(300, 200);
		chessBorder.setSize(400, 400);
		chessBorder.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		chessBorder.setVisible(true);
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					grid window = new grid();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
	}

	public grid() {
		setLayout(new GridLayout(20, 20));
		
		int count = 0;
		for(int i = 0; i < grids.length; i++, count++) {
			for(int j = 0; j < grids.length; j++) {
				grids[i][j] = new JButton();
				if(count % 2 == 0) {
					grids[i][j].setBackground(Color.WHITE);
					System.out.println("a");
				} else {
					grids[i][j].setBackground(Color.BLACK);
				}
				add(grids[i][j]);
				count++;
			}
	}
	}
}