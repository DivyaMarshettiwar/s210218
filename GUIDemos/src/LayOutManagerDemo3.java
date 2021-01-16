import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
//event source in this demo is Jbutton
//event lister in this demo is GridLayoutDemo
//event handeler is action performed method that is written inside this class
class GridLayoutDemo extends JFrame implements ActionListener {
	JTextField tf1;
	JPasswordField pf1;
	JLabel l1, l2;
	JButton b1, b2;

	public GridLayoutDemo() {
		setLayout(new GridLayout(3, 2));
		l1 = new JLabel("Enter your username");
		add(l1);
		tf1 = new JTextField(100);
		add(tf1);
		l2 = new JLabel("Enter your password");
		add(l2);
		pf1 = new JPasswordField(100);
		add(pf1);
		b1 = new JButton("Submit");
		//the submit that is given overher is only for display
		//it uses setText()
		b1.addActionListener(this);
		add(b1);
		b2 = new JButton("Cancel");
		b2.addActionListener(this);
		add(b2);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setExtendedState(MAXIMIZED_BOTH);
		setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b=(JButton)e.getSource();
	if (b.getText().equals("Submit")) {
			JOptionPane.showMessageDialog(this,"Username and Password is correct", "Login Alert",
					JOptionPane.INFORMATION_MESSAGE);
		} else {
			int i = JOptionPane.showConfirmDialog(this, "are u sure u want to clear the items", "Login Alert",
					JOptionPane.ERROR_MESSAGE, JOptionPane.YES_NO_OPTION);
			if (i == 0) {
				tf1.setText("");
				pf1.setText("");
			}
		}
	}
}
public class LayOutManagerDemo3 {
	public static void main(String[] args) {
		GridLayoutDemo d = new GridLayoutDemo();
	}
}
