import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanelDemo {
public static void main(String[] args) {
	JFrame frame=new JFrame("Demo For Panel");
	frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	//create a Panel
	
	JPanel p= new JPanel();
	frame.add(p);
	//the panel that is create is added to my frame.
	//the panel will have all the other components
	//when i want to display multiple sections then we will use panel
}
}
