import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

//in this demo we will see how to use Label,textfield,textarea,password,check box,radio box
//list,combo box, buttons
public class ComponentsDemo {
public static void main(String[] args) {
	JFrame frame=new JFrame("Demo For Panel");
	frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	JPanel p=new JPanel();
	frame.add(p);
	
	JLabel l=new JLabel("Enter the username");
	p.add(l);
	
	JTextField tf1=new JTextField(25);
	p.add(tf1);
	
	JLabel l1=new JLabel("Enter the address");
	p.add(l1);
	
	JTextArea ta1=new JTextArea(5,25);
	p.add(ta1);
	

	JLabel l2=new JLabel("Enter your password");
	p.add(l2);
	
	JPasswordField pf=new JPasswordField(25);
	p.add(pf);
	
	JLabel l3=new JLabel("area of intrest");
	p.add(l3);
	
	JCheckBox b1=new JCheckBox("web development");
	JCheckBox b2=new JCheckBox("window development");
	JCheckBox b3=new JCheckBox("mobile development");
	JCheckBox b4=new JCheckBox("java developer");
	b4.setSelected(true);
	
	p.add(b1);	p.add(b2);	p.add(b3);	p.add(b4);
	
	JLabel l4=new JLabel("select gender");
	p.add(l4);
	ButtonGroup bg=new ButtonGroup();
	JRadioButton rb1=new JRadioButton("Male");
	JRadioButton rb2=new JRadioButton("Female");
	bg.add(rb1);
	bg.add(rb2);
	//we cannot add the buttongroup to the panel as it is not a component
	p.add(rb1);
	p.add(rb2);
	JLabel l5=new JLabel("select state");
	p.add(l5);
	JComboBox combobox=new JComboBox();
	combobox.addItem("Mumbai");
	combobox.addItem("Delhi");
	combobox.addItem("Karnataka");
	combobox.addItem("TN");
	p.add(combobox);
	

	JLabel l6=new JLabel("select state");
	p.add(l6);
	JList lcombobox=new JList();
	DefaultListModel lm=new DefaultListModel();
	lm.addElement("AP");
	lm.addElement("UP");
	lm.addElement("MP");
	lcombobox.setModel(lm);
	p.add(lcombobox);
	
	JButton b=new JButton();
	b.setText("submit");
	p.add(b);
	
	
	
	
	frame.setVisible(true);
}
}
