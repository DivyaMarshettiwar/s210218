import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class TabPaneDemo {
public static void main(String[] args) {
	JFrame f=new JFrame();
	f.setExtendedState(JFrame.MAXIMIZED_BOTH);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	JTabbedPane tab=new JTabbedPane();
	JPanel p1=new JPanel();
	JPanel p2=new JPanel();
	tab.addTab("First",p1);
	tab.addTab("SEcond",p2);
	
	f.add(tab);
	f.setVisible(true);
}
}
